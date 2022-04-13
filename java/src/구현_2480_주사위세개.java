import java.io.BufferedReader;
import java.io.InputStreamReader;



public class 구현_2480_주사위세개{


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int result=0;


        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);

        if(a==b&&b==c) {
            result=10000+a*1000;

        }
        else if(a==b||b==c||c==a) {
            result+=1000;
            if(a==b) {
                result+=a*100;
            }
            if(a==c) {
                result+=a*100;
            }
            if(b==c) {
                result+=b*100;
            }

        }
        else if(a!=b && b!=c && c!=a) {
            int max = Math.max(c, Math.max(a, b))*100;
            result= max;
        }


        System.out.println(result);
    }
}