import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class 정렬_2108_통계학 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        int[] arr = new int[4000];
        System.out.println((int) list.stream().mapToInt(e -> e).average().orElseThrow(Exception::new));
        list.stream().sorted().skip(num / 2).limit(1).forEach(System.out::println);
        list.stream().filter(e -> e > 0).forEach(e -> arr[e]++);
        System.out.println(Arrays.stream(arr).max().orElseThrow(NoSuchElementException::new));
        System.out.println(list.stream().max().orElseThrow(NoSuchElementException::new)
                - list.stream().min().orElseThrow(NoSuchElementException::new));

    }
}
