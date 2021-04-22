import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 정렬_1181_단어정렬 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Word[] arr = new Word[num];

        for (int i = 0; i < 13; i++) {
            arr[i] = new Word(br.readLine());
        }

        for (Word w : arr) {
            w.getLength();
        }

        //Arrays.stream(arr).map(Word::getLength).sorted();
        //Arrays.stream(arr).map(Word::getLength).sorted().forEach(System.out::println);
        //Arrays.stream(arr)




    }

    static class Word {
        private String spell;
        private int length;

        public Word(String spell) {
            this.spell = spell;
            length = spell.length();
        }

        public String getSpell() {
            return spell;
        }

        public int getLength() {
            return length;
        }

    }


}
