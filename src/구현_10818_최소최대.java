import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class 구현_10818_최소최대 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] line = br.readLine().split(" ");
        System.out.println(Arrays.stream(line).mapToInt(e->Integer.parseInt(e)).min().orElseThrow(NoSuchElementException::new));
        System.out.println(Arrays.stream(line).mapToInt(e->Integer.parseInt(e)).max().orElseThrow(NoSuchElementException::new));
    }
}
