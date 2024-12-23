package j01_basic;

import java.util.Random;
import java.util.Scanner;

public class NumberMatcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        //1~100사이의 난수를 생성하는 맞추는 게임
        System.out.println("==== 숫자 맞추는 게임 ====");
        //1.난수
        int ranInt = random.nextInt(100)+1;
        int cnt = 0; // 횟수 저장할 변수
        //2.난수=입력값이 같을 때까지 비고
        do {
           //사용자에게 값입력받기
            System.out.print("1~100사이의 정수입력=");
            int inData = scan.nextInt();
            cnt++; //입력횟수 증가
            if(ranInt==inData){
                System.out.println("맞추었습니다....난수="+ranInt);
                break;//맞춘경우 반복문 중단
            }else if(ranInt>inData){
                System.out.println("더 큰값을 입력하세요....");
            }else{
                System.out.println("더 작은 값을 입력하세요....");
            }
        }while(true);
        //3.출력
        System.out.println(cnt+"번안에 맞추었습니다.");
    }
}
