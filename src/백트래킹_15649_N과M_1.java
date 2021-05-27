import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 백트래킹_15649_N과M_1 {
    static List<Node> nodes = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 1; i <= n; i++) {
            nodes.add(new Node(i));
        }

        for (Node node : nodes) {
            node.setConnected(nodes.stream().filter(e -> !e.equals(node)).collect(Collectors.toList()));
        }

        nodes.stream().forEach(System.out::println);

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