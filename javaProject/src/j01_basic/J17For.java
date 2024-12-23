package j01_basic;

public class J17For {
    public static void main(String[] args) {
        //반복문 : for
        //a+=2 : a의값이 2증가
        for(int a=2 ;a<=10 ;a+=2){
            System.out.println("반복문 테스트"+a);
        }
        //감소
        for(int b=10;b>=1 ; b--){
            System.out.println("b="+b);
        }
        int b=10;
        for(b=10; b>=1; b-=2)
            System.out.println("b="+b);
    }
}
