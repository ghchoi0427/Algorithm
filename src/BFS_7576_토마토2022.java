import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BFS_7576_토마토2022 {
    static int[][] map;
    static int[][] date;
    static boolean[][] visited;
    static int M;
    static int N;
    static int count = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static List<int[]> startPoints;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        N = Integer.parseInt(str.nextToken());
        M = Integer.parseInt(str.nextToken());
        map = new int[M][N];
        date = new int[M][N];
        visited = new boolean[M][N];
        startPoints = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                if ((map[i][j] = Integer.parseInt(str.nextToken())) == 1) {
                    startPoints.add(new int[]{i, j});
                    count++;
                }
            }
        }
        bfs();
        int max = -1;

        for (int i = 0; i < date.length; i++) {
            for (int j = 0; j < date[0].length; j++) {
                if (map[i][j] == 0) {
                    count++;
                }
                if (max < date[i][j]) {
                    max = date[i][j];
                }
            }
        }
        System.out.println(count == 0 ? max : -1);
        br.close();
    }

    static void bfs() {
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        startPoints.forEach(e -> {
            qx.offer(e[0]);
            qy.offer(e[1]);
            visited[e[0]][e[1]] = true;
            date[e[0]][e[1]] = 0;
        });


        while (!qx.isEmpty()) {
            int tempX = qx.poll();
            int tempY = qy.poll();
            count--;

            for (int i = 0; i < 4; i++) {
                int nx = tempX + dx[i];
                int ny = tempY + dy[i];

                if (check(nx, ny) && map[nx][ny] == 0 && !visited[nx][ny]) {
                    qx.offer(nx);
                    qy.offer(ny);
                    visited[nx][ny] = true;
                    date[nx][ny] = date[tempX][tempY] + 1;
                }
            }
        }
    }

    static boolean check(int x, int y) {
        if (x < 0 || x >= M) return false;
        if (y < 0 || y >= N) return false;
        return true;
    }
}

