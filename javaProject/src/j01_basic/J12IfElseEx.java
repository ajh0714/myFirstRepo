package j01_basic;

import java.util.Scanner;

public class J12IfElseEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        두수를 입력받아 큰수 순서대로 출력하라

        실행
        수1=30
        수2=50
        50
        30
         */
        System.out.print("수1=");
        int num1 = scan.nextInt();
        System.out.print("수2=");
        int num2 = scan.nextInt();
        if(num1>num2) {
            System.out.println(num1);
            System.out.println(num2);
        }else{
            System.out.println(num2);
            System.out.println(num1);
        }
    }
}
