package j01_basic;

import java.util.Scanner;

public class MoneyCount2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("금액=");
        int cash = scan.nextInt();

        int danwi = 50000; // 화폐단위
        int value = 5;; // 다음 화폐단위 계산할 값
        for(;cash>0;){
            int cnt = cash / danwi;
            if(cnt>0) {
                System.out.print(danwi + "원=" + cnt+ ((danwi>=1000)?"장":"개"));
                // if, switch, 삼항연산자
            }
            //이미 계산 단위의 금액만큼 빼기
            cash -= danwi * cnt; //cash= cash-danwi*cnt
            //다음 화폐단위 계산
            danwi = danwi/value;  // 10000
            value = (value==5)? 2:5 ;
        }
    }
}
