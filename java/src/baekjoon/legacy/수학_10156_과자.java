package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class 수학_10156_과자 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        if (Integer.parseInt(str[0]) * Integer.parseInt(str[1]) - Integer.parseInt(str[2]) > 0)
            System.out.println(Integer.parseInt(str[0]) * Integer.parseInt(str[1]) - Integer.parseInt(str[2]));
        else System.out.println(0);
    }
}