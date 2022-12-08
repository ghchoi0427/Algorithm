package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 브루트포스_2798_블랙잭 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int max = 0;
        String[] cardsStr = br.readLine().split(" ");
        int[] cards = new int[cardsStr.length];
        for (int i = 0; i < cardsStr.length; i++) {
            cards[i] = Integer.parseInt(cardsStr[i]);
        }
        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    if (cards[i] + cards[j] + cards[k] <= M) {
                        if (max < cards[i] + cards[j] + cards[k]) {
                            max = cards[i] + cards[j] + cards[k];
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}