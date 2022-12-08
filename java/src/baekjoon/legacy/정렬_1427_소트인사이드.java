package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 정렬_1427_소트인사이드 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Arrays.stream(br.readLine().split("")).sorted(Comparator.comparing(String::valueOf).reversed()).forEach(System.out::print);
    }
}
