import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.*;

public class BFS_2667_단지번호붙이기 {
    static int[][] map;
    static boolean[][] flag;
    static int N;

    static int countCell;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = parseInt(br.readLine());
        map = new int[N][N];
        flag = new boolean[N][N];
        countCell = 0;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[j][i] = parseInt(String.valueOf(line.charAt(i)));
                flag[j][i] = false;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                checkNeighbor(j, i);
            }
        }

        System.out.println(countCell);
    }

    private static void checkNeighbor(int x, int y) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            if (y + dy[i] >= 0 && x + dx[i] >= 0 && y + dy[i] < N && x + dx[i] < N) {
                setFlag(x, y, dx[i], dy[i]);
                //checkNeighbor(x + dx[i], y + dy[i]);
            }
        }
    }

    private static void setFlag(int x, int y, int dx, int dy) {
        if (map[y + dy][x + dx] != 1 || flag[y + dy][x + dx]) {
            return;
        }
        flag[y + dy][x + dx] = true;
        countCell += 1;
    }
}
