package J03_oop;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoOOP {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    public LottoOOP(){

    }
    void startlotto(){
        do{
            int gamecnt = getInput("게임수");
            for(int i=1; i<=gamecnt; i++){
                createlotto(i);
            }
            int que = getInput("계속하시겠습니까(1.예, 2.아니오)?");
            if(que!=1) break;
        }while(true);
    }
    //게임수 만큼 로또번호 만드는 메소드
    void createlotto(int c){
        int lotto[] = new int[7];
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1;
            //이전에 만들어진 로또번호가 i번째와 같은지 확인하여 같으면 다시 만든다.
            for (int check = 0; check < i; check++) {// i=0 ->반복안함
                if (lotto[i] == lotto[check]) {// i=1 ->0
                    i--;                       // i=2 ->0,1
                    break;
                }
            }
        }
        lottoSort(lotto, c);

    }
    void lottoSort(int lotto[], int c){
        for(int i=0; i<lotto.length-2 ;i++){
            for(int j =0; j<lotto.length-2-i; j++){
                if(lotto[j] > lotto[j+1]){
                    int temp= lotto[j];
                    lotto[j] = lotto[j+1];
                    lotto[j+1] = temp;
                }
            }
        }
        //출력
        lottoPrint(lotto, c);
    }
    void lottoPrint(int[] lotto, int cnt){
        System.out.print(cnt+"게임="+ Arrays.toString(Arrays.copyOfRange(lotto,0,lotto.length-1)));
        System.out.println(",bonus="+lotto[6]);
    }
    int getInput(String msg){
        System.out.print(msg+"=");
        return scan.nextInt();
    }

    public static void main(String[] args) {
       new LottoOOP().startlotto();
    }
}
