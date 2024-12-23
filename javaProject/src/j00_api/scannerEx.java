package j00_api;
import java.lang.System;
import java.util.Scanner;
public class scannerEx {
    public static void main(String[] args){
        /*
        콘솔에서 임의의 정수를 입력받아 홀수, 짝수를 구별하여 출력하라

        실행
        정수=5
        5는 홀수입니다.

        정수=8
        8은 짝수입니다.
         */
        // 데이터입력
        Scanner s = new Scanner(System.in);
        System.out.print("정수=>");
        int data = s.nextInt();
        //계산
        //String result = (data%2==0)?"짝수" : "홀수";
        String result = (data/2 == data/2.0)? "짝수":"홀수";
        //출력
        System.out.printf("%d는(은) %s입니다." , data, result);
    }
}
