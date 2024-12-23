package ex_test;

import java.util.Random;
import java.util.Scanner;

public class Ex1129 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자맞추기게임");
        Random random = new Random();
        int b = random.nextInt(100-1+1)+1;
        int c = 0;
        for(;;){
            c+=1;
            System.out.print("1~100사이의 정수를 입력하세요.?=");
            int data = scan.nextInt();
            if(b==data){
                System.out.println("맞추었습니다..난수="+data);
                System.out.println(c+"번만에 맞추었습니다...");
                break;
            }else if(b>data){
                System.out.println("더 큰값을 입력하세요...");
            }else{
                System.out.println("더 작은값을 입력하세요...");
            }


        }
    }
}
