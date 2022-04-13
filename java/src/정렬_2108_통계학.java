import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .ifPresent(System.out::println);
        System.out.println(Arrays.stream(arr).max().orElseThrow(NoSuchElementException::new));
        System.out.println(list.stream().max().orElseThrow(NoSuchElementException::new)
                - list.stream().min().orElseThrow(NoSuchElementException::new));

    }
}
