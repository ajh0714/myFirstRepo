package j08_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public TreeSetTest(){}
    public void start(){
        //TreeSet클래스는 set, SortedSet 인터페이스를 상속받음
        //중복허용불가, 순서유지하지않음, 정렬된다.

        int num[] = {43,2,65,13,22,98,34,43,43,43,44,2};

        TreeSet<Integer> ts = new TreeSet<>();
        for(int n:num){
            ts.add(n);
        }
        //오름차순
        Iterator<Integer> asc = ts.iterator();
        while(asc.hasNext()){
            System.out.print(asc.next()+"\t");
        }
        System.out.println();
        //내림차순
        Iterator<Integer> desc = ts.descendingIterator();
        while(desc.hasNext()){
            System.out.print(desc.next()+"\t");
        }

    }

    public static void main(String[] args) {
       TreeSetTest tt = new TreeSetTest();
    }
}
