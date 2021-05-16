import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 그리디_1541_잃어버린괄호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] subtract = br.readLine().split("-");

        int firstNumber = Integer.parseInt(subtract[0]);
        subtract[0] = "0";
        System.out.println(firstNumber);
        for (String s : subtract) {
            String[] temp = s.split("\\+");
            int sum = Arrays.stream(temp).mapToInt(e -> Integer.parseInt(e)).sum();
            firstNumber -= sum;
            System.out.println(firstNumber);
        }

        System.out.println(firstNumber);
    }
}
