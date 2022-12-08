package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 정렬_6986_절사평균 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = line[0];
        int k = line[1];

        List<Float> list = new ArrayList<>();
        List<Float> newList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Float.parseFloat(br.readLine()));
        }

        Collections.sort(list);
        System.out.println(String.format("%.2f", list.stream().skip(k).limit(n - 2 * k).mapToDouble(Float::doubleValue).average().orElseThrow(Exception::new)));

        for (int i = 0; i < n; i++) {
            if (i < k) {
                newList.add(list.get(k));
            } else if (k <= i && i < n - k) {
                newList.add(list.get(i));
            } else if (n - k <= i) {
                newList.add(list.get(n - k - 1));
            }
        }
        System.out.println(String.format("%.2f", newList.stream().mapToDouble(Float::doubleValue).average().orElseThrow(Exception::new)));

    }
}
