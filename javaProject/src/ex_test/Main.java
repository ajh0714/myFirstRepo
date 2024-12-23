package ex_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            double Data = Math.pow(a, b);
            double result = Data%10;
            System.out.println(result);
        }

    }
}