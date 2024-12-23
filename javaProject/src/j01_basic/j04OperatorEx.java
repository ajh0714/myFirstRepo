package j01_basic;

import java.util.Scanner;

public class j04OperatorEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1.급여입력
        System.out.print("급여입력=");
        int salary = scan.nextInt();
        //2.보너스 계산
        double bonus = (salary >= 100) ? salary * 0.1 : salary * 0.2;
        //3.보너스 출력
        System.out.println("보너스="+bonus);
    }
}
