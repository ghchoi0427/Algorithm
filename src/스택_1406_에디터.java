import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택_1406_에디터 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> s = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        char[] str = br.readLine().toCharArray();
        int num = Integer.parseInt(br.readLine());
        int StrLength = str.length;

        for (int i = 0; i < StrLength; i++) {
            s.push(str[i]);
        }

        for (int i = 0; i < num; i++) {

            String[] cmd = br.readLine().split(" ");

            if (cmd[0].equals("L") && !s.isEmpty()) {
                s2.push(s.pop());
            }
            if (cmd[0].equals("D") && !s2.isEmpty()) {
                s.push(s2.pop());
            }
            if (cmd[0].equals("B") && !s.isEmpty()) {
                s.pop();
            }
            if (cmd[0].equals("P")) {
                s.push(cmd[1].charAt(0));
            }
        }

        while (!s2.isEmpty()) {
            s.push(s2.pop());
        }

        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.elementAt(i));
        }
    }
}
