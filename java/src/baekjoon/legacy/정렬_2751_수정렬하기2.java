package baekjoon.legacy;

import java.util.*;

class 정렬_2751_수정렬하기2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            sb.append(arr[i] + "\n");
        }

        System.out.println(sb.toString());

    }
}