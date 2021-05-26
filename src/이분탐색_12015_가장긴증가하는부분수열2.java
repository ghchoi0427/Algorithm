import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 이분탐색_12015_가장긴증가하는부분수열2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    }
}
