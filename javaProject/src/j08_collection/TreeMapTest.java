package j08_collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    public TreeMapTest(){}
    public void start(){
        //TreeMap은 Key를 기준으로
        TreeMap<String,MemberVO> tm = new TreeMap<>();

        tm.put("길동", new MemberVO(333,"홍길동","010-4444-5555"));
        tm.put("순신", new MemberVO(222,"이순신","010-6666-6666"));
        tm.put("감찬", new MemberVO(444,"강감찬","010-1111-2222"));
        tm.put("중근", new MemberVO(111,"안중근","010-8888-9999"));
        tm.put("대왕", new MemberVO(555,"세종대왕","010-0000-1111"));

        Set<String> key = tm.keySet();
        Iterator<String> i = key.iterator();
        while(i.hasNext()){
            String k = i.next();
            MemberVO vo = tm.get(k);
            System.out.println("["+k+"]\t"+vo.toString());
        }
    }

    public static void main(String[] args) {
        new TreeMapTest().start();
    }
}
