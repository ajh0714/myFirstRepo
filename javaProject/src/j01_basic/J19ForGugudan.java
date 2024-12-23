package j01_basic;

import java.util.Scanner;

public class J19ForGugudan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("단=");
        int a = scan.nextInt();
        int i = 2;
        for(i=2; i<=9 ; i++){
            System.out.println(a+"* "+i+ "= "+a*i);
        }
    }
}
