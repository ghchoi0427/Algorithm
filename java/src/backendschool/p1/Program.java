package backendschool.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        one();
    }

    static void one() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int b = Integer.parseInt(br.readLine());
        System.out.printf("결과: %d", a + b);

    }

}
