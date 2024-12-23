package j01_basic;

import java.util.Scanner;

public class J11IfElseEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
               임의의 수를 입력받아 입력받은 수가 양수이거나 음수이면 양수로 만들어 100을 곱하여 출력하고
               0이면 1로 변경하여 100을 곱하여 출력하라
         */
        System.out.print("임의의 수=");
        int num = scan.nextInt();
        if(num>0) {
            int result = num * 100;
            System.out.println(result);
        }else if(num<0) {
            int result = -num * 100;
            System.out.println(result);
        }else if(num == 0) {
            int result = (num+1) * 100;
            System.out.println(result);
        }

    }
}
