package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class BFS_2178_미로탐색 {

    static int[][] map;
    static int n;
    static int m;
    static boolean[][] visit;


    static boolean check(int y, int x) {
        if (y < 1 || y > n || x < 1 || x > m) return false;
        if (map[y][x] == 0) return false;
        if (visit[y][x]) return false;
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        map = new int[n + 1][m + 1];
        visit = new boolean[101][101];


        for (int y = 1; y <= n; y++) {
            String line = br.readLine();
            for (int x = 1; x <= m; x++) {
                map[y][x] = Integer.parseInt(String.valueOf(line.charAt(x - 1)));
            }
        }

        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        Queue<Integer> qc = new LinkedList<>();

        qy.offer(1);
        qx.offer(1);
        qc.offer(1);

        int cnt = 0;

        while (!qy.isEmpty()) {

            int cy = qy.poll();
            int cx = qx.poll();
            int cc = qc.poll();

            if (visit[cy][cx]) continue;
            visit[cy][cx] = true;

            if (cy == n && cx == m) {
                cnt = cc;
                break;
            }

            if (check(cy - 1, cx)) {
                qy.offer(cy - 1);
                qx.offer(cx);
                qc.offer(cc + 1);
            }    //up
            if (check(cy + 1, cx)) {
                qy.offer(cy + 1);
                qx.offer(cx);
                qc.offer(cc + 1);
            }    //down
            if (check(cy, cx - 1)) {
                qy.offer(cy);
                qx.offer(cx - 1);
                qc.offer(cc + 1);
            }    //left
            if (check(cy, cx + 1)) {
                qy.offer(cy);
                qx.offer(cx + 1);
                qc.offer(cc + 1);
            }    //right

        }
        System.out.println(cnt);
    }

}