package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class contest210616 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isAscending = false;
        boolean isDescending = false;
        br.readLine();
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                isAscending = true;
                if(isDescending){
                    System.out.println("NO");
                    return;
                }
            }
            if (nums[i] > nums[i + 1]) {
                isDescending = true;
            }
        }
        System.out.println("YES");
    }
}
