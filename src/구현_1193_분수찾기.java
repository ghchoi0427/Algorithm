import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구현_1193_분수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int line = 0;
        int count = 0;
        while (count < n) {
            line++;
            count = line * (line + 1) / 2;
        }
        if (line % 2 != 0) {
            int top = 1 + (count - n);
            int bottom = line - (count - n);
            System.out.println(top + "/" + bottom);
        } else {
            int top = line - (count - n);
            int bottom = 1 + (count - n);
            System.out.println(top + "/" + bottom);
        }
    }
}
