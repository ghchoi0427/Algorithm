import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 브루트포스_14501_퇴사 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Counsel> counsels = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            counsels.add(new Counsel(Integer.parseInt(line[0]),Integer.parseInt(line[1])));
        }
        /*
        do something
         */
    }
}

class Counsel {
    private int time;
    private int profit;

    public Counsel(int time, int profit) {
        this.time = time;
        this.profit = profit;
    }
}
