package j04_oop2;

import java.io.InputStream;
import java.util.Scanner;

public class AbstractTestMain extends AbstractTest{
    public AbstractTestMain(){}

    //추상메소드를 오버라이딩
    public int multiple(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        if(b==0) b=1;
        int result = a/b; // 0/5
        return result;
    }
    public static void main(String[] args) {
        //추상클래스인 AbstractTest클래스의 메소드 호출
        //추상클래스를 상속받아 모든 추상메소드를 오버라이딩해야한다.
        AbstractTestMain atm = new AbstractTestMain();
        System.out.println(atm.plus(30,40));
        System.out.println(atm.minus(10,20));
        System.out.println(atm.multiple(10,5));
        System.out.println(atm.divide(10,0));

        //추상클래스는 객체를 생성하여 사용할 수 없다.
        //AbstractTest at = new AbstractTest(){};
        //new Scanner(System.in);
        // InputStream 클래스는 추상클래스이다.
        // 그러므로 객체를 생성할수없다.
        //new InputStream();
        AbstractTest at = new AbstractTestMain();
        System.out.println(at.multiple(20,70));
    }
}
