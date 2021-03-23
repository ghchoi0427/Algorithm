import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class 수학_5543_상근날드 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        System.out.println(list.stream().limit(3).min(Integer::compare).orElseThrow(NoSuchElementException::new) +
                list.stream().skip(3).limit(2).min(Integer::compare).orElseThrow(NoSuchElementException::new) - 50);
    }
}
