package j01_basic;

import java.util.Map;
import java.util.Scanner;

public class EmailCheck {
    Scanner scan = new Scanner(System.in);
    public EmailCheck(){
        //이메일 유효성검사
        do{
            System.out.print("이메일입력=");
            String email = scan.nextLine();

            int atMark = email.indexOf("@"); // @위치 처음에있는@
            int lastAtMark = email.lastIndexOf("@"); // @위치 마지막에 있는 @
            int dot = email.indexOf(".");
            //.의 갯수
            int dotCnt = 0;
            for(int i=0; i<email.length();i++){
                if(email.charAt(i)=='.') dotCnt++;
            }

            if(atMark==-1 || atMark!=lastAtMark || dotCnt<1|| dotCnt>2|| atMark>dot || Math.abs(atMark=dot)<3){//유효하지 않은 메일을 입력시
                System.out.println(email+"은 잘못된 이메일주소 입니다...");

            }else{//유효한 이메일 입력시
                //문자열의 일부를 얻어오기
                String id = email.substring(0, atMark);
                String domain = email.substring(atMark+1);
                System.out.println("아이디="+id);
                System.out.println("도메인="+domain);

            }

        }while(true);
    }

    public static void main(String[] args) {
        new EmailCheck();

    }
}
