package J03_oop;

//소스코드는 한 파일에 여러개의 클래스를 정의할수있다.


import javax.crypto.spec.PSource;
import java.util.Calendar;
import java.util.Scanner;

class ObjectClass {


}

public class TestObject{
    //class영역 = 멤버영역 = 전역
    //1.멤버변수
    int intData = 5678;//멤버변수, 전역변수
    String name = "홍길동";

    //객체생성 = reference변수, 인스턴스
    Scanner s = new Scanner(System.in);
    Calendar date = Calendar.getInstance();
    //실행문은 멤버영역에 표기할 수 없다. 반드시 메소드내에 사용해야 함.
    //System.out.println("테스트"); // 실행문
    int num = intData+100;
    //2.생성자메소드
    //생성자 메소드명은 클래스명과 같아야 한다. 반환형이 없다.
    //매개변수가 없는 생성자: 기술안하면 컴파일러(javac.exe)가 추가
    //객체생성시 한번 실행된다.
    public TestObject(){
        num = num+5;
    }
    public TestObject(int num){
       //this : 현재 클래스
        this.num = num;
    }
    public TestObject(int num, String name){
        this.num = num;
        this.name = name;
        int addr = 5;
    }
    //3. 메소드
    // 메소드명은 소문자로 시작
    //()가 있다.
    // 반환형이 있어야 한다.
    // int a = r.nextInt(100)
     void speedUp(){
        // 변수 선언, 수식, 실행문(if,for,while,switch.....)
         num += 10000;
    }
    int speedUp(int step) {
        num += step;
        return 9999;
    }
    //4. 내부 클래스
    class AAAA{}

    }

class TestObject2{
    int age =32;


}