package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 정렬_20551_Sort마스터배지훈의후계자 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int[] arr = new int[n];
        int[] question = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < m; i++) {
            question[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            boolean exist = false;
            for (int j = 0; j < n; j++) {
                if (question[i] == arr[j]) {
                    System.out.println(j);
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                System.out.println(-1);
            }
        }
    }
}
