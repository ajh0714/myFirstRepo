package ex_test;

import java.util.Scanner;

public class GuGuDan3 {
    public static void main(String[] args) {
        System.out.println("\t   구구단");
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                if(i==0) System.out.printf("%d단\t\t",j);
                else
                    System.out.print(j + "*" + i + "=" + (i * j) + "\t");

            }

            System.out.println();
        }
        for (int i = 0; i <= 9; i++) {
            for (int j = 4; j <= 6; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + " ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 9; i++) {
            for (int j = 7; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }
}
