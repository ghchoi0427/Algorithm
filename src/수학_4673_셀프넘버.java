public class 수학_4673_셀프넘버 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10000; i++) {
            if (isH(i) == false) {
                System.out.println(i);
            }
        }
    }

    public static int d(int n) {
        int result = n;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
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