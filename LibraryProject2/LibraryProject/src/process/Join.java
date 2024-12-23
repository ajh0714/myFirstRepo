package process;

import java.util.Scanner;

public class Join {
    Scanner scan = new Scanner(System.in);

    private String op="";

    public Join(){}

    public String JoinProcess(){
        System.out.print("[1.회원관리, 2.도서관리, 3.로그아웃, 4.종료]=");
        op = scan.nextLine();
        switch(op) {
            //옵션에 따른 동작 구현
        }
        return op;
    }
}
