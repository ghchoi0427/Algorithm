import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 구현_2567_색종이2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[102][102];
        int result = 0;

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    map[j+1][k+1] = 1;
                }
            }
        }

        for (int j = 0; j < 101; j++) {
            for (int i = 0; i < 101; i++) {
                if (map[j][i] != map[j + 1][i]) {
                    result += 1;
                }
                if (map[j][i] != map[j][i + 1]) {
                    result += 1;
                }
            }
        }

        System.out.println(result);

    }
}
