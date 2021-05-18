import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 백트래킹_15649_N과M_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        List<Node> nodes = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            nodes.add(new Node(i));
        }
    }
}

class Node {
    List<Node> connected;
    private int number;

    public Node() {
    }

    public Node(int number) {
        this.number = number;
    }

    public void addNode(Node node) {
        if (!node.equals(this)) {
            connected.add(node);
        }
    }
}

