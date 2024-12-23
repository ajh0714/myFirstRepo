package j07_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest3 {
    public ExceptionTest3(){

}

public void plus(int a, int b){
    System.out.println(a+"+"+b+"="+(a+b));
    minus(a,b);
}
public void minus(int a, int b){
    System.out.println(a+"-"+b+"="+(a-b));
    multiple(a,b);
}
public void multiple(int a, int b) {
    System.out.println(a + "*" + b + "=" + (a * b));
    divide(a, b);
}
public void divide(int a, int b) {
    System.out.println(a + "/" + b + "=" + (a / b));
}
public static void main(String[] args) {
    Scanner s = new Scanner((System.in));
    do {
        try {
            System.out.print("수1=");
            String t1 = s.nextLine();
            int a = Integer.parseInt(t1);
            System.out.print("수2=");
            int b = Integer.parseInt(s.nextLine());
            new ExceptionTest3();
        }catch(ArithmeticException ae){
            System.out.println("============================");
        }catch(NumberFormatException ie){
            System.out.println("1이상의 정수를 입력하세요.");


        }
    }while (true);
}


}