package ex_test;

import java.util.Scanner;

public class Ex0718_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("문자=");
        String data= s.nextLine();
        char result = data.charAt(0);
        System.out.println("결과="+(char)(result+32));
    }
}
