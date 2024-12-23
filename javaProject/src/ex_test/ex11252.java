package ex_test;

import java.util.Scanner;

public class ex11252 {
    static int print(String str){
        Scanner scan=new Scanner(System.in);
        System.out.print(str);
        return scan.nextInt();
    }
    public static void main(String[] args) {
        int a = print("나이=");
        int b = print("성별(1:남,2:여)=");
        int c = print("키=");
        int d = print("현재체중=");
        double sw = 1.00;
        if(a<=35 && b==1){
            sw=(c-100)*0.90;
        }else if(a<=35 && b==2){
            sw=(c-100)*0.85;
        }else if(a>=36 && b==1){
            sw=(c-100)*0.95;
        }else if(a>=36 && b==2){
            sw=(c-100)*0.90;
        }
        System.out.println("표준체중="+sw);
        double sw2 = d/sw * 100;
        String tp="";
        if(sw2<=85){
            tp="마른형";
        }else if(sw2>=86 && sw2<=95){
            tp="조금 마른형";
        }else if(sw2>=96 && sw2<=115){
            tp="표준형";
        }else if(sw2>=116 && sw2<=125){
            tp="조금 비만형";
        }else if(sw2>=126){
            tp="비만형";
        }
        System.out.printf("당신의 표준체중지수는%.2f 으로 %s입니다.",sw2,tp);
    }
}
