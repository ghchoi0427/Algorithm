import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 백트래킹_15649_N과M_1 {
    static List<Node> nodes = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        // int m = Integer.parseInt(input[1]);

        for (int i = 1; i <= n; i++) {
            nodes.add(new Node(i));
        }

    }

    static Node findNodeById(int id) {
        for (Node n : nodes) {
            if (n.getNumber() == id) {
                return n;
            }
        }
        return new Node(id);
    }
}

class Node {
    private List<Node> connected;

    public void setConnected(List<Node> connected) {
        this.connected = connected;
    }

    private int number;

    public Node(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addNode(Node node) {
        connected.add(node);
    }

    public List<Node> getConnected() {
        return connected;
    }
}