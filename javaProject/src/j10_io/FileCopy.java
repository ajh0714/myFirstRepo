package j10_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public FileCopy(){}
    public void start(){
        // 원본파일 : d://test/01.jpeg
        // 타겟파일 : d://test/a1/natural.jpeg
        try {
            FileInputStream org = new FileInputStream("d://test/123123a.jpg");
            FileOutputStream tar = new FileOutputStream("d://test/a1/natural.jpg");

            while (true){
                int r = org.read();
                if(r==-1) break;
                tar.write(r);
            }
            org.close();
            tar.close();
            System.out.println("파일복사완료");
        }catch(FileNotFoundException fe){
            System.out.println("파일이없다.");
        }catch (IOException ie){
            System.out.println("읽기/쓰기 예외발생..."+ie.getMessage());
        }
    }
    public static void main(String[] args) {
     new FileCopy().start();
    }
}
