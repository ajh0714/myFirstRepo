package j00_api;

public class StringBufferTest {
    public StringBufferTest(){
        start();
    }
    public void start(){
        //StringBuffer(동기화), StringBuilder(비동기화)

        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(60);
        StringBuffer sb3 = new StringBuffer("StringBuffer를 이용한 문자열 처리 테스트중");
        //index 6번째 위치에 문자열추가 그 자리의 문자열은 위로 밀린다.
        sb3.insert(6,"스트링버퍼추가(insert)테스트");
        sb3.append("마지막문자열추가");
        // 01234567890
        sb3.delete(6,9);
        System.out.println(sb.capacity()+", "+ sb2.capacity()+". sb3="+ sb3.capacity());
        System.out.println(sb3.toString());


    }
    public static void main(String[] args) {
        new StringBufferTest();
    }
}
