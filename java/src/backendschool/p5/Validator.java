package backendschool.p5;

import java.util.List;

public class Validator {
    public static final String ERROR_FORMAT = "[입력오류] : 숫자를 입력해주세요";
    public static final String ERROR_ALREADY_EXIST = "[입력오류] : 이미 입력된 숫자입니다.";

    public static boolean validateInput(String input, List<Integer> list) {
        if (!isInteger(input)) {
            System.out.println(ERROR_FORMAT);
            return false;
        }

        if (isExist(list, Integer.parseInt(input))) {
            System.out.println(ERROR_ALREADY_EXIST);
            return false;
        }

        return true;
    }

    public static boolean isInteger(String input) {
        return input.matches("\\d*");
    }

    public static boolean isExist(List<Integer> list, int input) {
        return list.contains(input);
    }

    public static boolean isPrime(int input) {
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
