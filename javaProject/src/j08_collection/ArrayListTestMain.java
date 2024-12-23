package j08_collection;

import java.util.ArrayList;

public class ArrayListTestMain {
    public ArrayListTestMain(){}
    public void start(){
        ArrayListTest at = new ArrayListTest();
        ArrayList<MemberVO> list = at.getMemberAll();

        list.remove(2);

        for(int i=0; i< list.size() ; i++){
           MemberVO m =list.get(i);

            System.out.println(m.getUsername()+"\t"+m.getTel());
        }
        System.out.println("======형성된 for문=========");
        for(MemberVO m: list){
            System.out.println(m.getUsername()+"\t"+m.getTel());
        }
    }

    public static void main(String[] args) {
        new ArrayListTestMain().start();
    }
}
