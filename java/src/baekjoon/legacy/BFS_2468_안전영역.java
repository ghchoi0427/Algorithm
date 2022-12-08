package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS_2468_안전영역 {
    static int[][] arr;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str.nextToken());
            }
        }

        int max = 1;

        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (arr[j][k] > i && !visited[j][k]) {
                        bfs(j, k, i);
                        count++;
                    }
                }
            }
            if (max < count) {
                max = count;
            }
            clearVisit();
        }

        System.out.println(max);
    }

    static void bfs(int x, int y, int h) {
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();

        qx.offer(x);
        qy.offer(y);
        visited[x][y] = true;


        while (!qx.isEmpty()) {
            int cx = qx.poll();
            int cy = qy.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (check(nx, ny)) {
                    if (arr[nx][ny] > h && !visited[nx][ny]) {
                        qx.offer(nx);
                        qy.offer(ny);
                        visited[nx][ny] = true;
                    }
                }
            }

        }

    }

    static boolean check(int x, int y) {
        return x >= 0 && y >= 0 && x < arr.length && y < arr.length;
    }

    static void clearVisit() {
        visited = new boolean[n][n];
    }
}

