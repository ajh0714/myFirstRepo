package j08_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
    public HashMapTest(){}
    public void start(){
        //HashMap은 Map인터페이스를 상속받고 있다.
        //Map은 key와 value를 가진다.
        //key 중복될수 없다.
        HashMap<String, MemberVO> hm = new HashMap<String, MemberVO>();

        hm.put("길동", new MemberVO(111,"홍길동","010-4444-5555"));
        hm.put("순신", new MemberVO(222,"이순신","010-6666-6666"));
        hm.put("감찬", new MemberVO(333,"강감찬","010-1111-2222"));
        hm.put("중근", new MemberVO(444,"안중근","010-8888-9999"));
        hm.put("대왕", new MemberVO(555,"세종대왕","010-0000-1111"));

        //key값을 이용하여 value얻어오기
        MemberVO vo = hm.get("감찬");
        System.out.println(vo.toString());

        Set<String> keyList = hm.keySet();

        Iterator<String> ii = keyList.iterator();
        while ((ii.hasNext()))
            System.out.print(ii.next() + "\t");
            System.out.println();

        //모든 value 얻어오기
        Collection<MemberVO> list = hm.values();
        Iterator<MemberVO> iii = list.iterator();
        while(iii.hasNext()){
            MemberVO vo2 = iii.next();
            System.out.println(vo2.toString());
        }
    }

    public static void main(String[] args) {
        new HashMapTest().start();
    }
}
