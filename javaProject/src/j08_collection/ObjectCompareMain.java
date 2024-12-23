package j08_collection;

import java.util.*;

public class ObjectCompareMain {
    public ObjectCompareMain(){


    }
    public void start(){
        //회원의 MemberV0셋팅됨 번호순으로 이름 정렬

        //데이터준비
       List<MemberVO> lst =new ArrayList<MemberVO>();
        lst.add(new MemberVO(333,"홍길동","010-4444-5555"));
        lst.add(new MemberVO(222,"이순신","010-6666-6666"));
        lst.add(new MemberVO(444,"강감찬","010-1111-2222"));
        lst.add(new MemberVO(111,"안중근","010-8888-9999"));
        lst.add(new MemberVO(555,"세종대왕","010-0000-1111"));

        //숫자정렬, 문자열정렬
        System.out.println("=======정렬전=======");
        for(MemberVO vo : lst){
            System.out.println(vo.toString());
        }
        //번호 : 숫자정렬(오름차순)
        //              정렬대상이 되는 컬렉션
        Collections.sort(lst,new CompareNumAsc());
        System.out.println("=======오름차순 정렬후=======");
        for(MemberVO vo : lst) {
            System.out.println(vo.toString());
        }
        //번호 : 숫자정렬(내림차순)
        Collections.sort(lst,new CompareNumDesc());
        System.out.println("=======내림차순 정렬후=======");
        for(MemberVO vo : lst) {
            System.out.println(vo.toString());
        }
        //이름 : 문자정렬(오름차순)
        Collections.sort(lst,new CompareUsernameAsc());
        System.out.println("=======이름을 올림차순 정렬후=======");
        for(MemberVO vo : lst) {
            System.out.println(vo.toString());
        }
        //이름 : 문자정렬(내림차순)
        Collections.sort(lst,new CompareUsernameDesc());
        System.out.println("=======이름을 내림차순 정렬후=======");
        for(MemberVO vo : lst) {
            System.out.println(vo.toString());
        }
    }
    //MemberVO객체내에 있는 NUM의 값을 이용하여 오름차순정렬하는 내부클래스 만든다.
    //Comprator인터페이스를 상속받아 compare()메소드를 오버라이딩

    class CompareNumAsc implements Comparator<MemberVO>{
        //리턴값에 따라 값을 교환한다
        @Override
        public int compare(MemberVO o1, MemberVO o2){
            //양수일 때 왼쪽값이 크므로 교환해준다.
            //0일때 같다
            // 음수일때는 왼쪽값이 작다.
            return (o1.getNum() > o2.getNum())? 1: (o1.getNum()) == o2.getNum()? 0:-1;
        }
    }
    class CompareNumDesc implements Comparator<MemberVO>{
        //리턴값에 따라 값을 교환한다
        @Override
        public int compare(MemberVO o1, MemberVO o2){
            //양수일 때 왼쪽값이 크므로 교환해준다.
            //0일때 같다
            // 음수일때는 왼쪽값이 작다.
            return (o1.getNum() > o2.getNum())? -1: (o1.getNum()) == o2.getNum()? 0:1;
        }
    }
    class CompareUsernameAsc implements Comparator<MemberVO>{
        //리턴값에 따라 값을 교환한다
        @Override
        public int compare(MemberVO o1, MemberVO o2){
            //양수일 때 왼쪽값이 크므로 교환해준다.
            //0일때 같다
            // 음수일때는 왼쪽값이 작다.
            // "A".compareTo("B")  -> -1
            // "C".compareTo("A")  -> +2
            // "A".compareTo("A")  -> 0
            return o1.getUsername().compareToIgnoreCase(o2.getUsername()) ;
        }
    }
    class CompareUsernameDesc implements Comparator<MemberVO>{
        //리턴값에 따라 값을 교환한다
        @Override
        public int compare(MemberVO o1, MemberVO o2){
            //양수일 때 왼쪽값이 크므로 교환해준다.
            //0일때 같다
            // 음수일때는 왼쪽값이 작다.
            // "A".compareTo("B")  -> -1
            // "C".compareTo("A")  -> +2
            // "A".compareTo("A")  -> 0
            return o2.getUsername().compareToIgnoreCase(o1.getUsername()) ;
        }
    }

    public static void main(String[] args) {
        new ObjectCompareMain().start();
    }
}
