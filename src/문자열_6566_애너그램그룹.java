import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 문자열_6566_애너그램그룹 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp;
        List<String> list = new ArrayList<>();
        List<Word> words = new ArrayList<>();
        List<List<Word>> groups = new ArrayList<>();

        while (!(temp = br.readLine()).equals("EOF")) list.add(temp);

        list.forEach(e -> words.add(new Word(e, getAlphabet(e))));

        for (int i = 0; i < words.size() - 1; i++) {
            if (!words.get(i).isBelong()) {
                List<Word> group = new ArrayList<>();
                group.add(words.get(i));
                words.get(i).setBelong(true);
                for (int j = i + 1; j < words.size(); j++) {
                    if (isAnagram(words.get(i).info, words.get(j).info)) {
                        group.add(words.get(j));
                        words.get(j).setBelong(true);
                    }
                }
                groups.add(group);
            }
        }

        Comparator<List<Word>> comparator = Comparator.comparing(List::size);
        Comparator<List<Word>> reveredComparator = comparator.reversed();

        groups.stream().sorted(reveredComparator).limit(5).forEach(e -> {
            StringBuilder sb = new StringBuilder();
            e.forEach(entity -> sb.append(entity.letter).append(" "));
            System.out.println("Group of size " + e.size() + ": " + sb.toString());
        });
    }

    static int[] getAlphabet(String input) {
        int[] result = new int[26];
        input.chars().asDoubleStream().mapToInt(e -> (int) (e - 97)).forEach(e -> result[e] += 1);
        return result;
    }

    static boolean isAnagram(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != (b[i])) {
                return false;
            }
        }

        return true;
    }

}

class Word {
    String letter;
    int[] info;

    public boolean isBelong() {
        return isBelong;
    }

    public void setBelong(boolean belong) {
        isBelong = belong;
    }

    private boolean isBelong;

    public Word(String letter, int[] info) {
        this.letter = letter;
        this.info = info;
        this.isBelong = false;
    }
}
