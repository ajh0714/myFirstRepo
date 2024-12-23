package ex_test;

import java.util.Scanner;

public class Ex0718_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수=");
        int 숫자 = s.nextInt();
        int result = 숫자/10*10+1;
        System.out.println("결과="+result);
    }
}
