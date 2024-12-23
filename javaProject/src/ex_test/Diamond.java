package ex_test;

import java.util.Arrays;
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("임의의 홀수입력(1~49)=");
        int odd = scan.nextInt();
        int x=0;
        char arr[] = new char[26];
        for(int i=0; i<26;i++) {
            arr[i]=(char)('A'+i);
        }
        for(int i=1; i<=odd; i+=2){

            for(int s=1; s<=odd-i; s+=2){
                System.out.print(" ");
            }
            for(int s=1; s<=i; s++){
                if(x==26) x=0;
                System.out.print(arr[x]);
                x++;
            }
            System.out.println();

        }
        for(int i=odd-2; i>=1; i-=2){

            for(int s=i+1; s<=odd; s+=2){
                System.out.print(" ");
            }
            for (int s=i; s>=1 ;s--){
                if(x==26) x=0;
                System.out.print(arr[x]);
                x++;
            }
            System.out.println();
        }

    }
}

