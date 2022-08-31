package backendschool.p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        two();
    }

    static void two() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for (int i = 1; i < 11; i++) {
            System.out.printf("숫자 %d: ", i);
            String input = br.readLine();
            if (Validator.isInteger(input)) {
                sum += Integer.parseInt(input);
            } else {
                System.out.println("[입력오류] : 숫자를 입력해주세요");
                i -= 1;
            }
        }
        System.out.printf("결과: %d", sum);
    }
}
