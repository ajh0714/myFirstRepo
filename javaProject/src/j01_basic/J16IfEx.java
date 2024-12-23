package j01_basic;

import java.util.Scanner;

public class J16IfEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //데이터 년도 입력
        System.out.print("년도=");
        int year = scan.nextInt();
        //처리
        String result = "평년";
        //윤년일경우만 result의 값을 "윤년"으로 변경
        if(year%4==0 && !(year%100==0)|| year%400==0){
            result = "윤년";
        }
        //출력
        System.out.println(year+"년도는"+result+"입니다.");
    }
}
