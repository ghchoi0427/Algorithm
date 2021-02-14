import java.io.BufferedReader;
        import java.io.InputStreamReader;

public class 구현_2167_2차원배열의합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
        int rep = Integer.parseInt(br.readLine());
        int[] result = new int[rep];

        for (int i = 0; i < rep; i++) {
            String[] line = br.readLine().split(" ");
            int left = Math.min(Integer.parseInt(line[0]), Integer.parseInt(line[2]));
            int right = Math.max(Integer.parseInt(line[0]), Integer.parseInt(line[2]));
            int bottom = Math.min(Integer.parseInt(line[1]), Integer.parseInt(line[3]));
            int top = Math.max(Integer.parseInt(line[1]), Integer.parseInt(line[3]));
            int temp = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (left <= j + 1 && j + 1 <= right && bottom <= k + 1 && k + 1 <= top) {
                        temp += arr[j][k];
                    }
                }
            }
            result[i] = temp;
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}