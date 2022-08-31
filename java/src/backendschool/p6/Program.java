package backendschool.p6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {



    public static void main(String[] args) throws IOException {
        run();
    }

    static void command(String cmd, PostController3 controller) {
        switch (cmd) {
            case "등록":
                controller.write();
                break;
            case "조회":
                controller.read();
                break;
        }
    }

    static void run() throws IOException {
        PostController3 controller = PostController3.getInstance();

        while (true) {
            System.out.print("명령어) ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String cmd = br.readLine();
            if (cmd.equals("종료")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            command(cmd, controller);
        }
    }
}
