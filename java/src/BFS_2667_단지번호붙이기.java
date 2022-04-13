import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BFS_2667_단지번호붙이기 {
    static int[][] map;
    static boolean[][] flag;
    static int N;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[] aparts;
    static int apartsNum = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        flag = new boolean[N][N];
        aparts = new int[N * N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[j][i] = Integer.parseInt(String.valueOf(line.charAt(j)));
                flag[j][i] = false;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[j][i] == 1 && !flag[j][i]) {
                    recursive(j, i);
                    apartsNum++;
                }
            }
        }
        System.out.println(apartsNum);
        Arrays.stream(aparts).filter(e -> e > 0).sorted().forEach(System.out::println);
    }

    private static void recursive(int x, int y) {
        if (map[x][y] == 1 && !flag[x][y]) {
            flag[x][y] = true;
            aparts[apartsNum]++;

            for (int i = 0; i < 4; i++) {
                if (x + dx[i] >= 0 && y + dy[i] >= 0 && x + dx[i] < N && y + dy[i] < N) {
                    recursive(x + dx[i], y + dy[i]);
                }
            }
        } else return;
    }
}
