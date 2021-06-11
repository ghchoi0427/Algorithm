import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 정렬_6986_절사평균 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = line[0];
        int k = line[1];
        List<Float> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Float.parseFloat(br.readLine()));
        }
        System.out.println(String.format("%.2f",list.stream().sorted().skip(k).limit(n - 2 * k).mapToDouble(Float::doubleValue).average().orElseThrow(Exception::new)));
    }
}
