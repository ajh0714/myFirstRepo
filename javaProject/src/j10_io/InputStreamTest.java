package j10_io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamTest {
    public InputStreamTest(){}
    public void start() {
        //InputStream: byte 단위를 입력한다.
        //InputStream은 추상클래스이므로 상속받아 오버라이딩해야 한다.
        //이미 객체생성해 놓은 System.in 사용한다.
        try {
            InputStream is = System.in;
//            do {
//                int data = is.read();
//                System.out.println(data+",입력한값=" + (char) data);
//            }while(true);
            byte[] a =new byte[10];
            int c = is.read(a);
            System.out.println(c);
            System.out.println(Arrays.toString(a));
            System.out.println(new String(a,0,c-1));
        }catch (IOException i){
            System.out.println("예외발생-->"+i.getMessage());
        }
    }

    public static void main(String[] args) {
        new InputStreamTest().start();
    }
}
