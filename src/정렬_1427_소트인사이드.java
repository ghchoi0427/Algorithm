import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 정렬_1427_소트인사이드 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        line.chars().map(e -> e - 48).sorted().forEach(System.out::print);
    }
}
