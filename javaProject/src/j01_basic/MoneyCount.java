package j01_basic;

import java.util.Scanner;

public class MoneyCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //금액을 입력받아 화폐의 갯수를 구하라.
        System.out.print("금액을 입력하세요?=");
        int money = scan.nextInt();

        // 50000,10000,5000,1000,500,100,50,10,1
        // 화폐단위가 큰순서로 갯수를 계산한다.
        int cnt = money / 50000; //5
        if(cnt>0){
            System.out.println("50000원="+cnt+"장");
            //50000원 화폐수에 해당하는 금액을 뺀다
            money = money - cnt *50000;
        }
        //10000
        cnt = money /10000;
        if(cnt>0){
            System.out.println("10000원="+cnt+"장");
            money = money - cnt * 10000;
        }
        cnt = money / 5000;
        if(cnt>0) {
            System.out.println("5000원=" + cnt + "장");
            money = money - cnt * 5000;
        }
        cnt = money / 1000;
        if(cnt>0){
            System.out.println("1000원="+cnt+"장");
            money = money - cnt * 1000;
        }
    }
}
