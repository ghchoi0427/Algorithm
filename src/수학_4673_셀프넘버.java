import java.util.stream.IntStream;

public class 수학_4673_셀프넘버 {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 10000; i++) {
            if (!isH(i)) {
                System.out.println(i);
            }
        }
    }

    public static int d(int n) {
        return Integer.toString(n).chars().mapToDouble(e->e-48).mapToInt(e->(int)e).sum()+n;
    }

    static boolean isH(int n) {
        for (int j = 1; j < n; j++) {
            if (d(j) == n) {
                return true;
            }
        }
        return false;
    }
}