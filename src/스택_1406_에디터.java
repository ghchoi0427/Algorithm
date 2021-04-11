import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 스택_1406_에디터 {

    static String line;
    static int cursor;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        line = br.readLine();
        cursor = line.length() - 2;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");

            switch (cmd[0]) {
                case "L":
                    if (cursor > 0) cursor--;
                    break;
                case "D":
                    if (cursor < line.length() - 2) cursor++;
                    break;
                case "B":
                    B();
                    break;
                case "P":
                    P(cmd[1]);
                    break;
            }
            /*
            if (cmd[0] == "L") {
                if (cursor > 0) cursor--;
            }
            if (cmd[0] == "D") {
                if (cursor < line.length() - 2) cursor++;
            }
            if (cmd[0] == "B") {
                B();
            }
            if (cmd[0] == "P") {
                P(cmd[1]);
            }*/
        }

        System.out.println(line);
    }

    static void B() {
        if (cursor > 2) {
            line = line.substring(0, cursor - 2) + line.substring(cursor, line.length() - 1);
        } else {
            line = line.substring(0, 1) + line.substring(cursor, line.length() - 1);

        }
    }

    static void P(String s) {
        line = line.substring(0, cursor - 1).concat(s) + line.substring(cursor, line.length() - 1);
    }

}
