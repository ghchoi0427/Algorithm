package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문자열_1373_2진수8진수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        if (line.length() % 3 == 1) {
            line = "00" + line;
        }
        if (line.length() % 3 == 2) {
            line = "00" + line;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < (line.length()) / 3 + 1; i++) {
            sb.append(strToOct(line.substring(line.length() - 3 * i, line.length() - 3 * i + 3)));
        }

        String result = sb.toString();
        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
    }

    static String strToOct(String str) {
        int input = Integer.parseInt(str);
        int result = input % 10;
        result += 2 * ((input / 10) % 10);
        result += 4 * (input / 100);
        return String.valueOf(result);
    }

}