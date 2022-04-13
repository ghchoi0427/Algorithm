import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 브루트포스_1436_영화감독숌 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int i =666;

        while(true){
            if(String.valueOf(i).contains("666")){
                count++;
            }
            i++;
            if(n==count){
                System.out.println(i-1);
                return;
            }
        }

    }
}
