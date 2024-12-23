package j08_collection;

import j07_exception.CalendarOOP;

public class GenericTestMain {
    public static void main(String[] args) {
        GenericTest gt = new GenericTest();

        //"홍길동"을 gt객체에 셋팅)
        MemberVO v = new MemberVO(1111,"이순신","010-9999-8888");
        //gt.setData(v);


        CalendarOOP oop = new CalendarOOP();
        gt.setData(oop);

        CalendarOOP oop2 =(CalendarOOP)gt.getData();
        oop2.start();
        System.out.println(gt.getData());
        //==============================================
        GenericTest<MemberVO> gt2 = new GenericTest<MemberVO>();
        gt2.setData(v);

        GenericTest<CalendarOOP> gt3 = new GenericTest<>();
        gt3.setData(oop);
        //gt3.setData(y); // CalendarOOP객체가 아니기 때문에 셋팅불가
        CalendarOOP oop3 = gt3.getData();
        oop3.start();
    }
}
