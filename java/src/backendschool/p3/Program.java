package backendschool.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Program {
    public static void main(String[] args) throws IOException {
        three();
    }

    static void three() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        StringBuilder result = new StringBuilder("총합 : ");

        for (int i = 1; i < 11; i++) {
            System.out.printf("숫자 %d : ", i);
            String input = br.readLine();
            if (Validator.isInteger(input)) {
                queue.add(Integer.parseInt(input));
            } else {
                System.out.println("[입력오류] : 숫자로 입력해주세요");
                i -= 1;
            }
        }

        while (!queue.isEmpty()) {
            result.append(queue.poll().toString());
            if (!queue.isEmpty()) {
                result.append(", ");
            }
        }
        System.out.println(result);
    }
}
