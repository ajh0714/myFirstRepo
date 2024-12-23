package J03_oop;

public class StaticTestMain {
    public static void main(String[] args) {
        //static키워드를 표기한 멤버변수는
        //객체를 생성하지 않고 변수를 사용할 수 있다.
        //클래스명,변수명
        System.out.println("StaticTest.num->"+StaticTest.num);

        //static 멤버변수가 아니면 클래스를 객체로 만들어 접근해야 한다.
        //System.out.println("StaticTest.age->"+StaticTest.age)
        StaticTest st = new StaticTest();
        System.out.println("st.age="+st.age);
        System.out.println("st.num="+st.num);
        StaticTest st2 = new StaticTest();
        StaticTest st3 = new StaticTest();

        //객체의 값 변경하기
        st.age = 30;
        st.num = 100;
        StaticTest.num = 200;

        System.out.println("st.nun="+st.num+",st.age="+st.age);
        System.out.println("st2.nun="+st2.num+",st2.age="+st2.age);
        System.out.println("st3.nun="+st3.num+",st3.age="+st3.age);

        // static있는 메소드는 객체생성하지 않고 메소드를 호출
        StaticTest.plus(10,20);
        // static없는 메소드는 객체를 생성해야 호출가능하다.
        st.minus(20,5);

        String txt =new String("자바");
        String txt2 = txt.trim();
        //String.trim(); -> static메소드가 아니므로 클래스명.메소드로 사용할수없다.

        //valueOf()메소드 static메소드이므로 클래스명.메소드로 호출가능하다.
        String txt3 = String.valueOf(100);

    }
}
