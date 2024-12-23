package j01_basic;

import java.util.Scanner;

public class j08IfEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("원하는 메뉴를 선택(1.사각형의 넓이, 2.원의 넓이)");
        int menu = scan.nextInt();

        if(menu==1){
            System.out.print("가로(밑변)=");
            int w = scan.nextInt();
            System.out.print("세로(높이)=");
            int h = scan.nextInt();
            int rect = w * h;
            System.out.println("사각형의 넓이="+rect);
        }
        if(menu==2){
            System.out.print("반지름=");
            int radius = scan.nextInt();
            double triangle = radius * radius * Math.PI;
            System.out.println("원의 넓이="+triangle);

        }
    }
}
