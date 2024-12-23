package j02_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        // 1~45까지 로또번호 만들기
        do{
            //게임수 입력
            System.out.print("게임수 입력=");
            int gameCnt = scan.nextInt();
            //게임수 만큼 로또번호 생성,출력
            for (int cnt = 1; cnt <= gameCnt; cnt++) {
                //1게임
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
                for(int i=0; i<lotto.length-2 ;i++){
                    for(int j =0; j<lotto.length-2-i; j++){
                        if(lotto[j] > lotto[j+1]){
                            int temp= lotto[j];
                            lotto[j] = lotto[j+1];
                            lotto[j+1] = temp;
                        }
                    }
                }
                System.out.print(cnt+"게임="+ Arrays.toString(Arrays.copyOfRange(lotto,0,lotto.length-1)));
                System.out.println(",bonus="+lotto[6]);

                }
            //계속 여부
            System.out.print("계속하시겠습니까(1.예,2.아니오)?");
            int que = scan.nextInt();
            if(que!=1){
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }

        }while (true) ;



    }
}
