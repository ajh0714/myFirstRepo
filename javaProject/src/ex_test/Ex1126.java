package ex_test;

import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class Ex1126 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar date = Calendar.getInstance();
        System.out.print("년도=");
        int y = scan.nextInt();
        System.out.print("월=");
        int m = scan.nextInt();
        date.set(y,m-1,1);
        System.out.println(  y+"년"+m+"월");
        System.out.println("일  월  화  수  목  금  토");



    }
}
