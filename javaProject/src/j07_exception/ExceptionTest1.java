package j07_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
    Scanner scan =new Scanner(System.in);
    public ExceptionTest1(){}
    public void start(){
        //try:예외발생가능한 코드와 예외발생할 가능성이 없는 코드를 기술한다.
        try {
            System.out.print("정수1=");
            int a = scan.nextInt(); // InputMismatchException
            System.out.print("정수2=");
            int b = scan.nextInt(); // InputMismatchException
            int result = divide(a, b);
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println("arr=>" + arr[arr.length]); // ArrayIndexOutOfBoundsException
        }catch(InputMismatchException ime){
            //문자를 입력하는경우 예외 발생
            System.out.println("InputMismatchException->"+ime.getMessage());
            System.out.println("정수를 입력하지 않았습니다/");
        }catch (ArithmeticException ae){
            System.out.println("ArithmeticException-->"+ae.getMessage());
            System.out.println("0으로 어떤수를 나눌수 없습니다.");
        }catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println("ArrayIndexOutOfBoundsException==>"+aiobe.getMessage());
            System.out.println("배열의 index가 잘못 지정되었습니다.");
        }finally {
            System.out.println("finally : 예외발생과 상관없이 무조건 실행됨.");
        }
    }
    public int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        new ExceptionTest1().start();
    }
}
