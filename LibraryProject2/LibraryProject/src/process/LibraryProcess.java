package process;

import dao.*;
import data.BookDB;
import data.UserDB;

import java.util.Scanner;

public class LibraryProcess {
    Scanner scan;

    public LibraryProcess() {
        this.scan = new Scanner(System.in);
        UserDB.setUser();
        BookDB.setBook();
    }

    public void start(){
        System.out.println("==========================도서관리 프로그램===========================");
        new Login().processLogin();
        String op="";
        do {
            try {
                System.out.println("===================================================================");
                op = new Join().JoinProcess();
                switch (op) {
                    //옵션에 따른 동작 구현
                }
            } catch (Exception e) {
                System.out.println("올바른 값을 입력해주세요..");
            }
        } while(true);
    }
}
