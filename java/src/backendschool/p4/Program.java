package backendschool.p4;

import backendschool.p3.Validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

    }

    static void four() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        while (!(input = br.readLine()).equals("0")) {
            if (Validator.isInteger(input)) {
                list.add(Integer.parseInt(input));
                counter += 1;
            }
        }
    }
}
