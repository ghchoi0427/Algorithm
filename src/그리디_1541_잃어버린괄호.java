import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 그리디_1541_잃어버린괄호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] subtract = input.split("-");
        boolean isFirstGroup = true;


        int firstNumber = Integer.parseInt(subtract[0]);
        subtract[0] = "0";
        for (String s : subtract) {
            String[] temp = s.split("\\+");

        }
        System.out.println(firstNumber);
    }
}
