package j07_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
    // 1~100 사이의 값을 입력받아 그 수까지의 합을 구하라.
    public MyExceptionTest(){}
    public void start(){
        Scanner scan = new Scanner(System.in);
        try{
        System.out.print("정수입력(1~100사이)=");
        int num = scan.nextInt();
        if(num<1 || num>100){
            throw new MyException("정수중 1에서 100사이의 값이 아닙니다");
        }
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        System.out.println("1~"+num+"까지의 합은"+sum);
    }catch(InputMismatchException ie) {
            System.out.println("숫자를 입력하세요");
        }catch (MyException me){
            System.out.println(me.getMessage());
        }
        }

    public static void main(String[] args) {
        new MyExceptionTest().start();
    }
}
