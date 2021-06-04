import java.io.BufferedReader;
import java.io.InputStreamReader;

class 구현_20540_연길이의이상형 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";

        if (str.charAt(0) == 'I') {
            result += 'E';
        } else result += 'I';

        if (str.charAt(1) == 'S') {
            result += 'N';
        } else result += 'S';

        if (str.charAt(2) == 'T') {
            result += 'F';
        } else result += 'T';

        if (str.charAt(3) == 'J') {
            result += 'P';
        } else result += 'J';

        System.out.println(result);
    }


}
