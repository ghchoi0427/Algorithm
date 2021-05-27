import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 이분탐색_12015_가장긴증가하는부분수열2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Element> elements = new ArrayList<>();
        for (int i : nums) {
            elements.add(new Element(i));
        }

        elements.stream().forEach(System.out::println);

        for (Element n : elements) {
            n.setNext(elements.stream().filter(e -> e != n).collect(Collectors.toList()));
        }

        for(Element n : elements){
            System.out.println(n.getNext());
        }


    }

}
class Element {
    int num;
    List<Element> next;

    public List<Element> getNext() {
        return next;
    }

    public void setNext(List<Element> next) {
        this.next = next;
    }

    public Element(int num) {
        this.num = num;
    }
}


