import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class 그리디_18310_안테나 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> numList = new ArrayList<>();
        List<Integer> distance = new ArrayList<>();
        String temp = br.readLine();

        for (int i = 0; i < n; i++) {
            numList.add(Integer.parseInt(temp.split(" ")[i]));
        }

        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    tmp += getDist(numList.get(i), numList.get(j));
                }
            }
            distance.add(tmp);
        }

        int minIndex = IntStream.range(0, distance.size()).boxed().min(Comparator.comparingInt(distance::get)).get();
        System.out.println(numList.get(minIndex));


    }

    static int getDist(int a, int b) {
        return Math.abs(a - b);
    }
}
