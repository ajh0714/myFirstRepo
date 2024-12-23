package J03_oop;

public class StaticTest {
    //static은 멤버변수, 메소드에 기술한다.
    static int num=10;
    int age=20;

    //멤버영역에 실행문을 기술하기위해서는 static{}블럭에 길술한다.
    static {
        for(int i=1; i<=5;i++){
            System.out.println("i="+i);
        }
    }
    public StaticTest(){
        System.out.println("StaticTest()");
    }
    static void plus(int a, int b){
        //static으로 호출된 메소드가 객체생성안된 멤버변수를
        //접근할수 없다.
        //System.out.println(num+", "+age);
        System.out.printf("%d + %d =%d\n",a,b,a+b);


    }
    void minus(int a, int b){
        System.out.printf("%d - %d =%d\n",a,b,a-b);


    }

}
