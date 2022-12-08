package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 그리디_1541_잃어버린괄호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] subtract = br.readLine().split("-");
        boolean isFirstGroup = true;
        int result = 0;

        for (String s : subtract) {
            if (isFirstGroup) {
                result += Arrays.stream(s.split("\\+")).mapToInt(Integer::parseInt).sum();
                isFirstGroup = false;
            } else {
                result -= Arrays.stream(s.split("\\+")).mapToInt(Integer::parseInt).sum();
            }
        }
        System.out.println(result);
    }
}
