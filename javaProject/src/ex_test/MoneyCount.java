package ex_test;

import java.util.Scanner;

public class MoneyCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("금액을 입력하세요?=");
        int a = scan.nextInt();
        if(a>0){
            int result1 = a/50000;
            int result2 = (a-result1*50000)/10000;
            int result3 = (a-(result1*50000+result2*10000))/5000;
            int result4 = (a-(result1*50000+result2*10000+result3*5000))/1000;
            int result5 = (a-(result1*50000+result2*10000+result3*5000+result4*1000))/500;
            int result6 = (a-(result1*50000+result2*10000+result3*5000+result4*1000+result5*500))/100;
            int result7 = (a-(result1*50000+result2*10000+result3*5000+result4*1000+result5*500+result6*100))/10;
            int result8 = (a-(result1*50000+result2*10000+result3*5000+result4*1000+result5*500+result6*100+result7*10));
            if(result1!=0)System.out.println("50000원="+result1+"장");
            if(result2!=0)System.out.println("10000원="+result2+"장");
            if(result3!=0)System.out.println("5000원="+result3+"장");
            if(result4!=0)System.out.println("1000원="+result4+"장");
            if(result5!=0)System.out.println("500원="+result5+"개");
            if(result6!=0)System.out.println("100원="+result6+"개");
            if(result7!=0)System.out.println("10원="+result7+"개");
            if(result8!=0)System.out.println("1원="+result8+"개");

        }

    }
}
