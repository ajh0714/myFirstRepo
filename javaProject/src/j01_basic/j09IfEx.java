package j01_basic;

import java.util.Scanner;

public class j09IfEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("전공 이수 학점=");
        int a = scan.nextInt();
        System.out.print("교양 이수 학점=");
        int b = scan.nextInt();
        System.out.print("일반 이수 학점=");
        int c = scan.nextInt();

        if (a >= 70 && ((b >= 30 && c >= 30) || b + c >= 80) && a+b+c>=140) {
            System.out.println("졸업가능");
        }
        else{
            System.out.println("졸업불가");
        }
    }
}
