package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 그래프_DFS와BFS_1260 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int N = Integer.parseInt(temp.split(" ")[0]);
        int M = Integer.parseInt(temp.split(" ")[1]);
        int V = Integer.parseInt(temp.split(" ")[2]);
        List<Node> nodes = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            nodes.add(new Node(i));
        }

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            int first = Integer.parseInt(line.split(" ")[0]);
            int second = Integer.parseInt(line.split(" ")[1]);

            nodes.get(first - 1).addConnected(nodes.get(second - 1));
            nodes.get(second - 1).addConnected(nodes.get(first - 1));
        }

        dfs(nodes.get(V - 1));
        System.out.println();
        for (Node n : nodes) {
            n.setVisited(false);
        }
        bfs(nodes.get(V - 1));

    }

    static void dfs(Node node) {
        node.setVisited(true);
        System.out.print(node.id + " ");
        for (Node n : node.connected) {
            if (!n.isVisited()) {
                dfs(n);
            }
        }
    }

    static void bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        node.setVisited(true);
        queue.add(node);

        while (queue.size() != 0) {
            node = queue.poll();
            System.out.print(node.id + " ");

            for (Node n : node.connected) {
                if (!n.isVisited()) {
                    n.setVisited(true);
                    queue.add(n);
                }
            }
        }
    }
}

class Node {
    int id;

    public int getId() {
        return id;
    }

    List<Node> connected = new ArrayList<>();
    boolean visited;

    public Node(int id) {
        this.id = id;
        visited = false;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addConnected(Node node) {
        connected.add(node);
        connected.sort(Comparator.comparing(Node::getId));
    }
}
