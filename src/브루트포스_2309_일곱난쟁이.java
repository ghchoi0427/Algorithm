import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 브루트포스_2309_일곱난쟁이 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int flag1 = 0;
        int flag2 = 0;

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    flag1 = i;
                    flag2 = j;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i != flag1 && i != flag2) {
                System.out.println(arr[i]);
            }
        }
    }
}