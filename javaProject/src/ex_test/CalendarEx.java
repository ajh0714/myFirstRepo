package ex_test;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalendarEx {
    Scanner scan = new Scanner(System.in);
    int year; int month;
    public CalendarEx(){
        setYear();
        setMonth();
        yearPrint(year,month);
        Calendar date = Calendar.getInstance();
        date.set(year, month-1,1);
        int week = date.get(Calendar.DAY_OF_WEEK);
        int lastDay = 31;
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11: lastDay = 30; break;
            case 2:
                if((year%4==0) && !(year%100==0) || year%400==0){
                    lastDay=29;
                }
                else {
                    lastDay = 28;
                }
        }
        for(int space=1; space<week; space++) {//1,2
            System.out.print("\t");
        }
        for(int day=1 ; day<=lastDay ;  day++){
            System.out.print(day+"\t");
            if((week-1+day)%7==0){
                System.out.println();
            }
        }
    }

    public void setYear() {
        do {
            try {
                System.out.print("년도=");
                year = scan.nextInt();
                if (year <= 0) {
                    System.out.println("년도를 다시 입력해주세요");
                } else break;
            }catch(Exception e) {
                System.out.println("년도를 다시 입력해주세요");
                scan.next();

            }
        }while (true);
    }
    public void setMonth(){
        do {
            try {
                System.out.print("월=");
                month = scan.nextInt();
                if (month <= 0 || month > 12) {
                    System.out.println("월을 다시 입력해주세요");
                }else break;
            }catch(Exception e) {
                scan.next();
                System.out.println("월을 다시 입력해주세요");
            }
        }while (true);
    }
    public void yearPrint(int year, int month) {
        System.out.println("\t\t" + year + "년 " + month + "월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
    }


    public static void main(String[] args) {
        new CalendarEx();
    }
}
