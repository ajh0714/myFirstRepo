package j01_basic;

import java.util.Scanner;

public class j07IfEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 수=");
        int num1 = scan.nextInt();
        System.out.print("두번째 수=");
        int num2 = scan.nextInt();

        if(num1>0 && num2>0){
            int plus = num1 + num2;
            int minus = num1 - num2;
            int multiple = num1 * num2;
            double divide = num1 / (double)num2;

            System.out.printf("%d+%d=%d\n", num1, num2,plus);
            System.out.printf("%d-%d=%d\n",num1 , num2, minus);
            System.out.printf("%d*%d=%d\n", num1, num2, multiple);
            System.out.printf("%d/%d=%f\n", num1, num2, divide);

        }
    }
}
