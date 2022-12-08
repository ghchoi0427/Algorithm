package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFS_1012_유기농배추 {
    static int M;
    static int N;
    static int K;
    static int[][] map;
    static boolean[][] isVisited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            count = 0;
            StringTokenizer token = new StringTokenizer(br.readLine());

            M = Integer.parseInt(token.nextToken());
            N = Integer.parseInt(token.nextToken());
            K = Integer.parseInt(token.nextToken());


            map = new int[M][N];
            isVisited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                StringTokenizer str = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(str.nextToken());
                int y = Integer.parseInt(str.nextToken());
                map[x][y] = 1;
            }

            for (int k = 0; k < M; k++) {
                for (int l = 0; l < N; l++) {
                    if (map[k][l] == 1 && !isVisited[k][l]) {
                        dfs(k, l);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void dfs(int i, int j) {
        isVisited[i][j] = true;
        for (int k = 0; k < 4; k++) {
            if (i + dx[k] >= 0 && i + dx[k] < map.length && j + dy[k] >= 0 && j + dy[k] < map[0].length) {
                if (!isVisited[i + dx[k]][j + dy[k]] && map[i + dx[k]][j + dy[k]] == 1) {
                    dfs(i + dx[k], j + dy[k]);
                }
            }
        }
    }
}