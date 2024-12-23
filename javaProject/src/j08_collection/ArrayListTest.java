package j08_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public ArrayListTest(){

    }
    public ArrayList<MemberVO> getMemberAll(){
        //List 인터페이스 상속, 저장순서 유지
        MemberVO m1 = new MemberVO();
        m1.setUsername("홍길동");
        m1.setTel("010-1111-2222");

        MemberVO m2 = new MemberVO("이순신","010-8888-9999");

        ArrayList<MemberVO> al = new ArrayList<MemberVO>();
        List<MemberVO> lst = new ArrayList<MemberVO>();
        al.add(m1);// 0
        al.add(m2);// 1

        al.add(new MemberVO("안중근","010-3333-4444"));
        al.add(new MemberVO("김삿갓","010-5555-6666"));

        al.add(1,new MemberVO("gildong","02-3333-5555"));
        al.set(1,new MemberVO("세종대왕", "010-9999-9999"));
        return al;
    }
}
