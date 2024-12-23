package JavaTestProject;

import java.util.Calendar;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("년도->");
        int year = scan.nextInt();
        System.out.print("월->");
        int month = scan.nextInt();
        System.out.println("\t\t==" + year + "년 " + month + "월==");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        Calendar date = Calendar.getInstance();
        date.set(year, month - 1, 1);
        int week = date.get(Calendar.DAY_OF_WEEK);
        int lastDay = 31;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11: lastDay = 30;
                     break;
            case 2:
                if ((year % 4 == 0) && !(year % 100 == 0) || year % 400 == 0) {
                    lastDay = 29;
                } else {
                    lastDay = 28;
                }
        }
        for (int space = 1; space < week; space++) {
            System.out.print("\t");
        }
        for (int day = 1; day <= lastDay; day++) {
            System.out.print(day + "\t");
            if ((week - 1 + day) % 7 == 0) {
                System.out.println();
            }
        }
    }
}



