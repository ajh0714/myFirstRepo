package J03_oop;

public class FinalTest {
    //Final은 멤버변수, 메소드 , 클래스에 표기할 수 있다.
    //멤버변수는 데이터를 왼쪽에 표시,한번 값이 대입되면 다른 값으로 변경할 수 없다.
    //메소드는 반환형 왼쪽에 표시,오버라이딩 불가
    //클래스는 class키워드 왼쪽에 표시, 상속불가

    final int MAX = 100;
    final int MIN = 50;
    int middle = 5;
    public FinalTest(){
        //MAX = 200;
        middle = 15;

        int a =521;
        //오토박싱 : int형 데이터를 Integer클래스로 변환하여 대입해준다.
        Integer a2 = a; //

        //오토언박싱 : Integer형 데이터를 int형으로 변환하여 대입해준다.
        int b = a2;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(a2.MAX_VALUE);
        //System.out.println(b.MAX_VALUE);

        String c = "1234"; // -->정수 ,실수
        String d = a+"";

        //int e = Integer.valueOf(c);  //int a = Ineger.
        int e = Integer.parseInt(c);
        System.out.println(e+1000);
        System.out.println(Integer.reverse(e+1000));
    }
    public static void main(String[] args) {
        new FinalTest();
    }
}
