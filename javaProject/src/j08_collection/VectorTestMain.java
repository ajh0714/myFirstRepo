package j08_collection;

import j07_exception.CalendarOOP;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class VectorTestMain {
    public VectorTestMain(){}
    public void start(){
        VectorTest vt = new VectorTest();
        int data[] = vt.getArray();
        System.out.println(Arrays.toString(data));
        //배열을 이용한 데이터 가져오기
        Vector vec = vt.getVectorData();
        int num2 = (Integer)vec.get(0);
        System.out.println("num="+num2);
        String name2 = (String)vec.get(1);
        System.out.println("name2="+name2);

        CalendarOOP cal = (CalendarOOP)vec.get(3);
        cal.start();

        Random ran= (Random)vec.get(4);
        System.out.println("ran="+ran.nextBoolean());

        MemberVO m1= (MemberVO)vec.get(2);
        System.out.println("m1->"+m1.getUsername()+", "+m1.getTel());

        MemberVO m2 = (MemberVO)vec.get(5);
        System.out.println();
    }

    public static void main(String[] args) {
        new VectorTestMain().start();
    }
}
