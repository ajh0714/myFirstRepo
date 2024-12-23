package j10_io;

import java.io.*;

public class FileReaderTest {
    public FileReaderTest(){}
    public void start(){
      try {
          //파일의 내용을 문자단위 읽어오기
          //            드라이브명, 폴더, 파일명
          // FileReader(String filename)
          FileReader fr = new FileReader("d://test/Bank.java");
          while (true){
              int charCode = fr.read();
              if(charCode==-1) break;
              System.out.print((char)charCode);
          }
          System.out.println("\t============================================");
          //---파일의 내용을 버퍼에 담아 1줄씩 읽어오기

          BufferedReader br = new BufferedReader(fr);

          while(true){
              String inData =br.readLine(); // enter가 읽을 범위를 말한다. enter는 내용에 포함되지않는다.
              if(inData==null) break;
              System.out.println(inData);
          }
          System.out.println("==================한번에읽어오기===========================");
          File f = new File("d://sql/mysql08 dml.sql");
          char[] readData = new char[(int)f.length()];
          FileReader fr2 = new FileReader(f);
          int size = fr2.read(readData);
          System.out.println(new String(readData));
      } catch (FileNotFoundException fnfe){
          System.out.println("파일이 없어요");
      }catch (IOException ie){
          System.out.println("입력 예외 발생");
      }
    }

    public static void main(String[] args) {
        new FileReaderTest().start();
    }
}
