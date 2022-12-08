package baekjoon.legacy;

import java.util.*;

class 그리디_11047_동전0 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        while (K > 0) {
            for (int i = N - 1; i >= 0; i--) {
                if (K >= arr[i]) {
                    K -= arr[i];
                    result++;
                    break;
                }
            }
        }


        System.out.println(result);

    }
}