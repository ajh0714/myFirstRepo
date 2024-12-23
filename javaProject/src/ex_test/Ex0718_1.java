package ex_test;
import java.lang.System;
import java.util.Scanner;

public class Ex0718_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수=");
        int data = s.nextInt();
        int result = data/100*100;
        System.out.println("결과="+ result);

    }
}
