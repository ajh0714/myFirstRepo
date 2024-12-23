package j01_basic;

import java.util.Scanner;

public class J15SwitchEx {
    public static void main(String[] args) {
        /*
        [문제] 3과목의 점수를 입력받아 총점,평균,학점을 구하라
        학점을 구할때는 switch문으로 구하라(if문 사용불가)
학점기준
90~100 A
80~89 B
70~79 C
60~69 D
0~59 F

실행
국어점수 = 90
영어점수 = 80
수학점수 = 70
총점 = 240
평균 = 80
학점 = B
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("국어=");
        int a = scan.nextInt();
        System.out.print("영어=");
        int b = scan.nextInt();
        System.out.print("수학=");
        int c = scan.nextInt();

        int score = a+b+c;
        double avg = (a+b+c)/3.0;
        char grade = ' ';

        switch((int)avg/10) {
            case 10:
                grade = 'A';
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("총점="+score);
        System.out.println("평균="+avg);
        System.out.println("학점="+grade);



    }
}
