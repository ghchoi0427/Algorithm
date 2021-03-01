import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class 구현_1076_저항 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String result="";
        long result = 0;
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("black", 0);
        table.put("brown", 1);
        table.put("red", 2);
        table.put("orange", 3);
        table.put("yellow", 4);
        table.put("green", 5);
        table.put("blue", 6);
        table.put("violet", 7);
        table.put("grey", 8);
        table.put("white", 9);

        result = 10 * table.get(br.readLine());
        result += table.get(br.readLine());
        result *= Math.pow(10, table.get(br.readLine()));


        System.out.println(result);
    }

}