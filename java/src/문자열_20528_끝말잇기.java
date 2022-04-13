import java.util.Scanner;

public class 문자열_20528_끝말잇기 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        char c = arr[0].charAt(0);
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) != c) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}