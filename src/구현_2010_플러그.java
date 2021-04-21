import java.io.BufferedReader;
import java.io.InputStreamReader;


public class 구현_2010_플러그 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 1;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            result -= 1;
            result += a;
        }

        System.out.println(result);
    }
}