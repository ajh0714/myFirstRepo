package ex_test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("게임수=");
        int game = scan.nextInt();
        int[] lotto = new int[7];
        for (int k = 1; k <= game; k++) {
            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = (int) (Math.random() * 45) + 1;
                for (int j = 0; j < i; j++) {
                    if (lotto[i] == lotto[j]) {
                        i--;
                        break;
                    }
                }
            }
            Arrays.sort(lotto);
            int bouns = lotto[7];
            System.out.println(k + "게임=" + Arrays.toString(lotto) + "," + "bonus="+bouns);
        }
    }
}
