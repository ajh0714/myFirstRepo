package j10_io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {
    public FileTest(){}
    public void start(){
        //File : 드라이브명, 경로, 파일명등으로 객체를 생성하면
        //       파일크기, 마지막저장 날짜, 파일의 경로, 파일명등
        //       파일에 대한 정보를 얻을 수 있다.

        File f1 = new File("d://");
        File f2 = new File("d://test");
        File f3 = new File("d://test/Bank.java");
        File f4 = new File(f2,"mysql_02_select.sql");
        File f5 = new File("d://test","bank.java");

        long bytes = f3.length();
        System.out.println("length()="+bytes);

        File f6 = new File("d://test/a1/b1");
        boolean result = f6.mkdirs();
        System.out.println("result="+result);

        //파일존재 유무
        System.out.println("exists()->"+f5.exists()); // 있으면 true, 없으면 false
        //마지막 수정일
        long lastModified = f5.lastModified();
        System.out.println("마지막 수정일 :"+lastModified);

        Calendar date = Calendar.getInstance();
        date.setTimeInMillis(lastModified);

        SimpleDateFormat frm = new SimpleDateFormat("MM월dd일 HH시mm분 a");
                String dateResult=frm.format(date.getTime());
        System.out.println("마지막 수정일:" +dateResult);

        File f7 = new File("C://");

        File list[] = f7.listFiles();
        for(File l : list){
           String name = l.getName();
           String path = l.getPath();

           if(l.isFile()) {
               System.out.println(path + "[파일]");
           }else{
               System.out.println(path+ "[폴더]");
           }
           if(l.isHidden()) System.out.println("[숨김파일]");
           else System.out.println();
        }
        //현재컴퓨터 드라이브 목록을 구한다.
       File[] drive = File.listRoots();
        for(File d : drive){
            System.out.println(d.getPath());
        }

        //파일삭제
        f4.delete();
    }

    public static void main(String[] args) {
        new FileTest().start();
    }
}
