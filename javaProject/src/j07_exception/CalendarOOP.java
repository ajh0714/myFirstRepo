package j07_exception;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarOOP {
    public CalendarOOP(){

    }
    public void start(){
        int year = inData("년도");
        int month = inData("월");
        if(month>=1 && month<=12){
            titlePrint(year,month);
             int week = spaceOutput(year,month);
             int lastday = getLastDay(year,month);
            System.out.println(lastday);
        }else{
            System.out.println("월은 1월~12월까지 입니다");
        }
    }
    //년도월일입력(숫자입력)
    public int inData(String msg) {
        Scanner s = new Scanner(System.in);
        do {
            try {
                System.out.print(msg + "=");
                int intData = Integer.parseInt(s.nextLine());
                return intData;
            } catch (NumberFormatException nfe) {
                System.out.println(msg + "은 숫자를 입력하여야 합니다.");
            }

        }while(true);
    }
    //년월을 입력하여 제목을 출력하는 메소드
    public void titlePrint(int y,int m){
        System.out.println("\t=="+y+"년 "+m+"월==");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
    }
    //날짜출력전에 공백출력
    public int spaceOutput(int y, int m){
        Calendar now = Calendar.getInstance();
        now.set(y,m-1,1);
        int w =now.get(Calendar.DAY_OF_WEEK);
        for(int i=1; i<w; i++){
            System.out.print("\t");
        }
        return w;
    }

    public int getLastDay(int y, int m){
        Calendar date = Calendar.getInstance();
        date.set(y,m-1,1);
        return date.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    //날짜출력하기
    public void dayPrint(int space, int lastDay){
        for(int i=1; i<=lastDay; i++){
            System.out.print(i+"\t");
            if((i+space)%7==0) System.out.println();
        }
    }
    //public static void main(String[] args) {
      //  new CalendarOOP().start();
   // }
}
