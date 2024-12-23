package j10_io;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public InputStreamReaderTest(){}
    public void start(){

        InputStreamReader isr = new InputStreamReader(System.in);
        try {
            while(true) {
//                int c = isr.read();
//                System.out.println(c + "->" + (char) c + "," + String.valueOf(c));
            char[] cArr = new char[10];
            int cnt = isr.read(cArr,2,5);
            System.out.println(cnt + "-->" + new String(cArr));
            }
        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }


    }

    public static void main(String[] args) {
        new InputStreamReaderTest().start();
    }
}
