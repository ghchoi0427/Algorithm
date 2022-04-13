public class 수학_4673_셀프넘버 {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 10000; i++) {
            if (!isSelfNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static int getProperty(int n) {
        return Integer.toString(n).chars().asDoubleStream().mapToInt(e -> (int) (e - 48)).sum() + n;
        //return Integer.toString(n).chars().mapToDouble(e -> e - 48).mapToInt(e -> (int) e).sum() + n;

    }

    static boolean isSelfNumber(int n) {
        for (int j = 1; j < n; j++) {
            if (getProperty(j) == n) {
                return true;
            }
        }
        return false;
    }
}