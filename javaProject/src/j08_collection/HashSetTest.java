package j08_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public HashSetTest(){}
    public void start(){
        // set 인터페이스상속
        // 저장순서를 유지하지않는다. 중복데이터를 허용하지 않는다.

        HashSet<Integer> hs = new HashSet<Integer>();

        int[] data = {43,67,34,43,54,34,65,76,65,65};

        //배열의 값을 Hashset컬렉션 객체 추가
        for(int a : data){
            hs.add(a);
        }


        Iterator<Integer> ii = hs.iterator();

        //hasNext()로 Iterator객체에 데이터가 있는지 확인하고 next()로 꺼낸다.
        while (ii.hasNext()){
            int NextData = ii.next();
            System.out.print(NextData+"\t");
        }



        /// ///////////////////
        String name[] = {"손흥민","황희찬","김민재","이강인","박지성","안정환","황희찬","김민재","이강인"};
        HashSet<String> hs2 = new HashSet<>();

        for(String n:name){
            hs2.add(n);
        }

        Iterator<String> iii = hs2.iterator();
        while(iii.hasNext()){
            System.out.println(iii.next()+"\t");
        }
    }

    public static void main(String[] args) {
        new HashSetTest().start();
    }
}
