package j01_basic;

import java.util.Scanner;

public class J21ForEx {
    public static void main(String[] args) {
        //2개의 정수를 입력받아 큰수만 출력하라.
        Scanner scan = new Scanner(System.in);
        for(;;) {
            System.out.print("첫번째 수=");
            int first = scan.nextInt();
            System.out.print("두번째 수=");
            int second = scan.nextInt();
            if (first > second) {
                System.out.println("큰수는" + first);
            } else if(first<second) {
                System.out.println("큰수는" + second);
            }else System.out.println("두수가 같다");
        }
    }
}


/*
실행
첫번째수=5
첫번째수=8
큰수는 8
첫번째수=54
두번째수=21
큰수는 54
첫번째수=
두번째수=
 */
