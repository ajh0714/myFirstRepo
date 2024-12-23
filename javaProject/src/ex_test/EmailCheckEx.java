package ex_test;

import java.util.Scanner;

public class EmailCheckEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email;
        System.out.print("이메일 입력=");
        String emailid = scan.next();
        if (emailid.equals("ajh970714@naver.com")) {
            String id = "ajh970714";
            String domain = "naver.com";
            System.out.println("아이디=" + id);
            System.out.println("도메인=" + domain);
        } else
            System.out.println(emailid + "는 잘못입력된 메일입니다...");

    }
}