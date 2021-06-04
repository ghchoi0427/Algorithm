import java.io.BufferedReader;
import java.io.InputStreamReader;


public class 구현_11655_ROT13 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] >= 65 && arr[i] <= 96 || arr[i] >= 97 && arr[i] <= 122) {


                if (arr[i] >= 97 && arr[i] <= 122) {
                    if (arr[i] + 13 > 122) {
                        arr[i] -= 13;
                    } else arr[i] += 13;
                } else if (arr[i] >= 65 && arr[i] <= 90) {
                    if (arr[i] + 13 > 90) {
                        arr[i] -= 13;
                    } else arr[i] += 13;
                }
            }
        }

        for (char c : arr) {
            System.out.print(c);
        }
    }
}