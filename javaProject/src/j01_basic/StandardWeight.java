package j01_basic;

import java.util.Scanner;

public class StandardWeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("나이");
        int age = scan.nextInt();
        System.out.print("성별(1:남,2:여)=");
        int gender = scan.nextInt();
        System.out.print("키(cm)=");
        int height = scan.nextInt();
        System.out.print("현재체중=");
        int weight = scan.nextInt();

        //표준체중
        double value = 0.90;
        if(gender==2 && age<=35){
            value = 0.85;
        }else if(gender==1 && age>=36){
            value = 0.95;
        }
        double standardWeight = (height-100)*value;

        //표준체중지수
        double standardIndex = (weight/standardWeight) * 100;

        //체형
        String bodyType = "";
        if(standardIndex<=85)
            bodyType = "마른형";
        else if (standardIndex<=95)
            bodyType = "조금 마른형";
        else if (standardIndex<=115)
            bodyType = "표준형";
        else if (standardIndex<=125)
            bodyType = "조금 비만형";
        else
            bodyType = "비만형";

        System.out.println("표준체중="+standardWeight);
        System.out.printf("당신은 표준체중지수는%.2f으로 %s입니다.\n",standardIndex,bodyType);



    }
}
