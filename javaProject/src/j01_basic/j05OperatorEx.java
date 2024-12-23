package j01_basic;

import java.util.Scanner;

public class j05OperatorEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("과일갯수=");
        int fruit = scan.nextInt();
        System.out.print("바구니크기=");
        int size = scan.nextInt();
        int result = (fruit%size==0) ? fruit/size : fruit/size+1;
        System.out.println("바구니수="+result);


    }
}
