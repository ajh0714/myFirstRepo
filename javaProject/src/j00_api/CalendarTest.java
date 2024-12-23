package j00_api;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class CalendarTest {
    public static void main(String[] args) {
        Date date = new Date();
        Scanner scan = new Scanner(System.in);
        Calendar now = Calendar.getInstance();
        System.out.println(now);
        //set() : now의 현재날짜,시간을 원하는 날짜와 시간으로 변경하기
        now.set(2025,2,10);
        now.set(2023,4,12,10,5);//년월일시분
        now.set(2025,6,2,11,35,13);//년월일시분시
        //년월일시분초중 1개만 변경할때
        now.set(Calendar.YEAR,2026);//년도만 변경
        now.set(Calendar.MONTH,11);//월을 12로 변경
        //년도 얻어오기
        int y = now.get(Calendar.YEAR);
        int m = now.get(Calendar.MONTH)+1;
        int d = now.get(Calendar.DAY_OF_MONTH);
        int h = now.get(Calendar.HOUR_OF_DAY);
        int mi = now.get(Calendar.MINUTE);
        //요일 : 일->1, 월->2,화->3,수->4,목->5,금->6,토->7
        int w = now.get(Calendar.DAY_OF_WEEK);
        String week="";
        switch(w){
            case 1:week="일";break;
            case 2:week="월";break;
            case 3:week="화";break;
            case 4:week="수";break;
            case 5:week="목";break;
            case 6:week="금";break;
            case 7:week="토";
        }
        //2024년 11월 26일 14시 45분 (화)
        System.out.printf("%d년 %d월 %d일 %d시 %d분 (%s)" ,y,m,d,h,mi,week);


    }
}
