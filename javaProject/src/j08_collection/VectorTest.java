package j08_collection;

import j07_exception.CalendarOOP;

import java.util.Random;
import java.util.Vector;

public class VectorTest {
    public VectorTest(){}
    public int[] getArray(){
        int num[] = {5,6,7,8,9};
        String name = "홍길동";
        return num;
    }
    public Vector getVectorData() {
        //vector컬렉션은 : List인터페이스 상속받아 오버라이딩한 클래스
        //                저장순선유지, 중복객체 허용
        int num = 120;
        String name = "세종대왕";
        CalendarOOP calendar = new CalendarOOP();
        Random random = new Random();
        MemberVO member1 = new MemberVO();
        MemberVO member2 = new MemberVO("이순신","010-235-5989");

        Vector v = new Vector();
        v.add(num);
        v.add(name);
        v.add(calendar);
        v.add(random);
        v.add(2,member1);
        v.add(member2);

        return v;
    }
}
