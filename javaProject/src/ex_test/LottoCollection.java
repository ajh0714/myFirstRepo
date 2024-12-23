package ex_test;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollection {
public LottoCollection(){}
    public void start() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("게임수=");
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
            for(int i=0; i<lotto.length-2 ;i++){
                for(int j =0; j<lotto.length-2-i; j++){
                    if(lotto[j] > lotto[j+1]){
                        int temp= lotto[j];
                        lotto[j] = lotto[j+1];
                        lotto[j+1] = temp;
                    }
                }
            }
        }
    }
    TreeSet<Integer> lt = new TreeSet<>();
    Iterator<Integer> asc = lt.iterator();

    public static void main(String[] args) {
        LottoCollection lc = new LottoCollection();
    }
}

