package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class 구현_10872_팩토리얼 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(IntStream.range(1, Integer.parseInt(br.readLine()) + 1).reduce(1, (a, b) -> a * b));
    }
}
