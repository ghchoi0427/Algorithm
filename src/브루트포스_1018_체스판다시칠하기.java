import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 브루트포스_1018_체스판다시칠하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int y = Integer.parseInt(line[0]);
        int x = Integer.parseInt(line[1]);
        char[][] board = new char[y][x];

        int Black;
        int White;

        int min;
        int result = 1000;

        for (int i = 0; i < y; i++) {
            String temp = br.readLine();
            for (int j = 0; j < x; j++) {
                board[i][j] = temp.charAt(j);
            }
        }

        for (int i = 0; i < y - 7; i++) {
            for (int j = 0; j < x - 7; j++) {
                Black = 0;
                White = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if ((k + l) % 2 == 0 && board[k + i][l + j] != 'B') {
                            Black++;
                        }
                        if ((k + l) % 2 == 1 && board[k + i][l + j] != 'W') {
                            Black++;
                        }
                        if ((k + l) % 2 == 0 && board[k + i][l + j] != 'W') {
                            White++;
                        }
                        if ((k + l) % 2 == 1 && board[k + i][l + j] != 'B') {
                            White++;
                        }
                    }
                }
                min = Math.min(Black, White);
                if (result > min) result = min;
            }
        }
        System.out.println(result);

    }

}