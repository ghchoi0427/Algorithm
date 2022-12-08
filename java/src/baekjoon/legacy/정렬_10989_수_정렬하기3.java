package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 정렬_10989_수_정렬하기3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10001];
        int rep = Integer.parseInt(br.readLine());

        for (int i = 0; i < rep; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10001; i++) {
            while (arr[i] > 0) {
                sb.append(i).append("\n");
                arr[i]--;
            }
        }

        System.out.println(sb.toString());

    }
}
