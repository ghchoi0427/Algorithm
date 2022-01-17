import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BFS_1697_숨바꼭질 {

    static boolean[] visited = new boolean[100000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());

        System.out.println(bfs(n, k));
    }

    static int bfs(int s, int d) {
        Queue<Node0117> q = new LinkedList<>();
        q.offer(new Node0117(s));
        visited[s] = true;
        int result = 0;

        while (!q.isEmpty()) {
            Node0117 node0117 = q.poll();
            visited[node0117.index] = true;
            if (node0117.index == d) {
                result = node0117.cost;
                break;
            }
            Node0117[] search = new Node0117[3];
            search[0] = new Node0117(node0117.index - 1, node0117.cost + 1);
            search[1] = new Node0117(node0117.index + 1, node0117.cost + 1);
            search[2] = new Node0117(node0117.index * 2, node0117.cost + 1);

            for (Node0117 n : search) {
                if (!visited[n.index] && n.index < 100000) {
                    q.offer(n);
                }
            }
        }
        return result;
    }

}

class Node0117 {
    int index;
    int cost;

    public Node0117(int index) {
        this.index = index;
        this.cost = 0;
    }

    public Node0117(int index, int cost) {
        this.index = index;
        this.cost = cost;
    }

}
