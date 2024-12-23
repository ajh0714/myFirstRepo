package j00_api;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        //0~100
        //randon 클래스 : 난수 전용 클래스 , 정수, 실수 ,논리형
        //객체생성하여 사용한다.
        Random random = new Random();
        for(int i=1;i<=1000;i++){
            //int r = random.nextInt(); // Math.random()*int형 크기의 값
            //int r = random.nextInt(52-31+1)+31; //31~52 52-31+1
            //double r = random.nextDouble();//math.random()
            boolean r = random.nextBoolean();
            System.out.print(r+"\t");
            if(i%7==0) System.out.println();
      }
    }
}
