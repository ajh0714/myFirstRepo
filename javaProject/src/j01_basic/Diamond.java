package j01_basic;

import java.util.Scanner;

public class Diamond {
    //1.멤버변수
    Scanner scan = new Scanner(System.in);

    //2.생성자 메소드 : 객체가 생성될때 한번 실행됨
    public Diamond(){

    }

    //3.메소드
    void startDiamond(){
        int size = getMaxsize();//홀수입력
        System.out.println("size="+size);

        if(size%2==0) size--;//입력값이 짝수이면 홀수로 바꾸기

        diamondPaint(size);
    }
    //다이아몬드 만들기
    void diamondPaint(int size){
        char alpha = 'A';
        int step = 2;
        //삼각형
        for(int i=1; i<=size; i+=2){
            //공백출력
            for(int s=1;s<=(size-i)/2;s++){
                System.out.print(" ");
            }
            //문자출력
            for(int j=1; j<=i; j++){
                System.out.print(alpha++);
                if(alpha>'Z') alpha='A';
            }
            System.out.println();
            if(i>size) step = -2;
        }

        //역삼각형
        for(int i=size-2; i>=1; i-=2){
            //공백
            for(int s=1; s<=(size-i)/2; s++){
                System.out.print(" ");
            }
            //알파벳출력
            for(int j=1; j<=i;j++){
                System.out.print(alpha++);
                if(alpha>'Z') alpha = 'A';
            }
            System.out.println();
        }
    }
    //다이아몬드 최대 글자수
    int getMaxsize(){
        System.out.print("임의의 홀수입력(1~49)=");
        int maxSize = scan.nextInt();
        return maxSize;

    }

    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        diamond.startDiamond();
    }

}