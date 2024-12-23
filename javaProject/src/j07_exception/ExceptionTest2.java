package j07_exception;

import java.util.Scanner;

public class ExceptionTest2 {
    public ExceptionTest2() {

    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("정수1=");
            int a = scan.nextInt();
            System.out.print("정수2=");
            int b = scan.nextInt();
            int result = divide(a, b);
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println("arr=>" + arr[arr.length - 1]);
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("배열의 첨자 값이 잘못되었습니다");
        }catch (Exception e){
            System.out.println("0보다 큰값을 입력하여야 합니다.");
        }
    }
    public int divide(int a, int b) {
        return a / b;
    }
        public static void main (String[]args){
            new ExceptionTest2().start();
        }
    }
