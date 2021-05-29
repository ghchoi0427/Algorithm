import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 백트래킹_15649_N과M_1 {
    static List<Node> nodes = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        nodes = IntStream.rangeClosed(1, n).mapToObj(e -> new Node(e)).collect(Collectors.toList());

        for (Node node : nodes) {
            node.setConnected(nodes.stream().filter(e -> !e.equals(node)).collect(Collectors.toList()));
        }





    }
}

class Node {
    private List<Node> connected;
    private boolean visited;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

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