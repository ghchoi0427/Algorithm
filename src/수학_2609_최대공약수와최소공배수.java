import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 수학_2609_최대공약수와최소공배수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

    }

    int Euclid(int a, int b) {
        if (a % b == 0) {
            return b;
        } else
            return a % b;
    }
}
