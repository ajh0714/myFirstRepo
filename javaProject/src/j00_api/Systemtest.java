package j00_api;

public class Systemtest {
    public static void main(String[] args){
        System.out.println("System 클래스 테스트 중..");

        //프로그램이 종료된다.
        //System.exit( 0 );
        System.out.println("기본 API에 있는 클래스 이며 콘솔에 텍스트 출력한다..");

        //현재시간
        System.out.println("millis->"+System.currentTimeMillis());
        System.out.println("nanoMillis->"+System.nanoTime());

        // println() -> ln -> line
        System.out.println("println()메소드는 한줄단위로 출력하는 기능을 가지고 있다.");
        System.out.println();
        System.out.println(100+4568);

        //print() -> 출력후 줄을 바꾸지 않는다.
        System.out.print(1);
        System.out.print(2);
        System.out.println(3);

        //printf() -> 출력할 공간확보
        int a = 128;
        double b= 523.6587;
        System.out.println("a="+a+",b="+b);
        //                      오른쪽  왼쪽
        System.out.printf("a=%d b=%8d, %-8d, %d",a,100,100,100);

        System.out.printf("b=%10.2f,a=%-10.3f=", b,(double)a);

        String name = "홍길동";
        String tel= "010-1234-5678";
        System.out.printf("이름:%-10s, 연락처=%-16s\n",name,tel);
        System.out.printf("이름:%-10s, 연락처=%-16s\n","hong",tel);

        System.out.printf("8진수=%o, 16진수=%x\n",12,12);

    }
}
