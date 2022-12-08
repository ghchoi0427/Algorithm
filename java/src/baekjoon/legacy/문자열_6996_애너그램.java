package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열_6996_애너그램 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            String first = temp.split(" ")[0];
            String second = temp.split(" ")[1];
            if (solveAnagrams(getInfo(first), getInfo(second))) {
                System.out.printf("%s & %s are anagrams.%n", first, second);
            } else {
                System.out.printf("%s & %s are NOT anagrams.%n", first, second);
            }
        }

    }

    static int[] getInfo(String s) {
        int[] result = new int[26];
        s.chars().forEach(e -> result[e - 97]++);
        return result;
    }

    private static boolean solveAnagrams(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
