package j01_basic;

import java.util.Scanner;

public class J24WhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("정수=");
            int inData = scan.nextInt();
            int oddSum = 0, evenSum = 0;
            int i = 0;
            while (i<inData){
                //i++;
                if(++i%2==0) {
                    evenSum += i;
                }else{
                    oddSum += i;
                }

            }System.out.println("홀수의 합="+oddSum);
            System.out.println("짝수의 합="+evenSum);
        }











       /* int a = scan.nextInt();
        int b = 0;
        int c = 0;
        while(a>0){
            if(a%2==0)
                c=c+a;
            else
                b=b+a;
            a--;
        }
        System.out.println("홀수의 합="+b);
        System.out.println("짝수의 합="+c);*/
    }
}
