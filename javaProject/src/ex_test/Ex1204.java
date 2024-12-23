package ex_test;
/*
import java.util.Scanner;

public class Ex1204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("단=");
        int dan = scan.nextInt();
        for(int i=2; i<=9; i++ ) {
            if (dan != 1 && dan != 9) x(i,dan-1,dan+1);
            else if(dan == 1) x(i,dan,dan+1);
            else if(dan == 9) x(i,dan-1,dan);
            System.out.println();
        }
    }
 (int i, int start,    static void xint end) {
        for (int j = start; j <= end; j++) {
            int result = j * i;
            System.out.print(j + "*" + i + "=" + result + "\t");
        }
    }
}*/

import java.util.Scanner;

public class Ex1204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("단=");
        int dan = scan.nextInt();
        for(int i=2; i<=9; i++ ) {
            if (dan != 1 && dan != 9){
                for (int j = dan - 1; j <= dan + 1; j++) {
                    int result = j * i;
                    System.out.print(j + "*" + i + "=" + result + "\t");
                }
            }else if(dan==1){
                for (int j = dan; j <= dan + 1; j++) {
                    int result = j * i;
                    System.out.print(j + "*" + i + "=" + result + "\t");
                }
            }else if(dan==9){
                for (int j = dan-1; j <= dan ; j++) {
                    int result = j * i;
                    System.out.print(j + "*" + i + "=" + result + "\t");
                }
            }System.out.println();
        }
    }
}
