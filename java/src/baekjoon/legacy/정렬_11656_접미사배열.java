package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class 정렬_11656_접미사배열 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] arr = new String[S.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
            for (int j = i; j < S.length(); j++) {
                arr[i] += S.charAt(j);
            }
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + "\n");
        }

        System.out.println(sb.toString());

    }
}