package ex_test;

import java.util.Scanner;

public class Ex1125 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("년도=");
        int a = scan.nextInt();
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println("윤년");
        }else
            System.out.println("평년");

    }
}
