package backendschool.p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        List<Integer> list = new ArrayList<>();
        StringBuilder result = new StringBuilder("결과 : ");

        while (true) {
            System.out.printf("숫자 %d: ", count);
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            if (Validator.validateInput(input, list)) {
                if (Validator.isPrime(Integer.parseInt(input))) {
                    list.add(Integer.parseInt(input));
                }
                count += 1;
            }
        }
        list.forEach(e -> result.append(e.toString()).append(", "));
        trim(result);
        System.out.println(result);
    }

    private static StringBuilder trim(StringBuilder result) {
        return result.replace(result.length() - 2, result.length() - 1, "");
    }
}
