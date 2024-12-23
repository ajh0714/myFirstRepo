package j01_basic;

import java.util.Scanner;

public class J26DoWhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("임의의 정수=");
        int Data = scan.nextInt();
        int sum = 0;
        /*for(int i=1 ; ;i++){
            sum+=i;;
            if(sum>=Data){
                System.out.println("1~"+i+"까지의 합은"+sum);
                break;
            }



        }*/
        /*int i=1;
        while (true){
            sum += i;
            if(sum>=Data){
                System.out.println("1~"+i+"까지의 합은"+sum);
                break;

            }
            i++;

        } */
        int i = 0;
        do {
            i++;
            sum += i;
            if (sum >= Data) {
                System.out.println("1~" + i + "까지의 합은" + sum);
                break;
            }
        }while(true);


    }
}
