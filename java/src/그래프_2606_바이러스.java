import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 그래프_2606_바이러스 {
    static int result = 0;
    static int ExcludeComputerOne = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Computer> computerList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            computerList.add(new Computer());
        }

        int rep = Integer.parseInt(br.readLine());
        for (int i = 0; i < rep; i++) {
            String[] line = br.readLine().split(" ");
            connect(computerList.get(Integer.parseInt(line[0]) - 1), computerList.get(Integer.parseInt(line[1]) - 1));
        }
        getLinkedCom(computerList.get(0));
        System.out.println(result - ExcludeComputerOne);
    }

    private static void connect(Computer c1, Computer c2) {
        c1.link(c2);
        c2.link(c1);
    }

    private static void getLinkedCom(Computer computer) {
        for (Computer c : computer.connected) {
            if (!c.isVisited()) {
                c.visit();
                getLinkedCom(c);
                result++;
            }
        }
    }
}

class Computer {
    List<Computer> connected = new ArrayList<>();
    private boolean visited = false;

    public boolean isVisited() {
        return visited;
    }

    public void visit() {
        visited = true;
    }

    public void link(Computer linkedComputer) {
        this.connected.add(linkedComputer);
    }
}
