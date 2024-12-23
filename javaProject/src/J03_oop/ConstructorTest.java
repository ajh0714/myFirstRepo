package J03_oop;

public class ConstructorTest {
    int n;// 정수=0, 실수=0.0, 논리=false, 문자형, 객체형=null
    String str;
    public ConstructorTest(){
        this(100,"홍길동");
        //this.n = 100;
        //this.str = "홍길동";
        System.out.println("ConstructorTest()생성자 실행형");
    }
    public ConstructorTest(int n){
        this(n,"이순신");
        //this.n = n;
        //this.str = "이순신";
        System.out.println("ConstructorTest(int)생성자 실행형");
    }
    public ConstructorTest(int n, String str){
        this.n = n;
        this.str = str;
        System.out.println("ConstructorTest(int,String)생성자 실행형");
    }
    public String toString(){
        //this();// this()생성자메소드ㅔ에서만 가능하다
        return"n="+n+", str="+str;
    }

    public static void main(String[] args) {
        ConstructorTest ct1 = new ConstructorTest();
        ConstructorTest ct2 = new ConstructorTest(200);
        ConstructorTest ct3 = new ConstructorTest(300,"세종대왕");

        System.out.println(ct1.toString());
        System.out.println(ct2.toString());
        System.out.println(ct3.toString());
    }
}
