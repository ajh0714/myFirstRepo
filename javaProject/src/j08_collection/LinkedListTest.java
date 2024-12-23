package j08_collection;

import java.util.LinkedList;

public class LinkedListTest {
    public LinkedListTest(){}
    public void start(){
        //LinkedList는 List, queue, Deque인터페이스를 상속받는다.
        //List : 저장순서를 유지, 중복 데이터 허용
        //queue : 한쪽에서 입력하고 다른쪽에서 출력할수 있다.
        //Deque : 양쪽에서 입력과 출력할 수 있다.
        //Queue와 Deque는 출력하면 컬렉션에서 객체를 지운다.

        LinkedList<String> ll = new LinkedList<String>();
        ll.offer("홍길동"); // ll.lastOffer()마지막에 추가
        ll.offerLast("김연아");
        ll.add("손흥민");
        ll.push("김민재");
        ll.offerFirst("박지성");

        //박지성,손흥민,김연아,김민재,안정환,홍길동
        ll.add(1,"안정환");

        //컬렉션에 객체 꺼내기
        System.out.println("size()=>"+ll.size());
        System.out.println("pop()=>"+ll.pop());
        System.out.println("size()=>"+ll.size());

        while(!ll.isEmpty()){
            System.out.println(ll.pop());
        }                    //isEmpty() : 객체가있으면 false, 없으면 true


    }

    public static void main(String[] args) {
        new LinkedListTest().start();
    }
}
