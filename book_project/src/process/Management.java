package process;
import data.BookData;
import data.LoginData;
import data.MemberData;
import vo.BookVO;
import vo.MemberVO;

import java.util.Scanner;

public class Management {
    Scanner scan = new Scanner(System.in);

    public Management() {
        MemberData.setMember();
    }


    public void start() {
        do {
            System.out.print("아이디 입력=");
            String id = scan.nextLine();
            System.out.print("비밀번호 입력=");
            String pwd = scan.nextLine();
            if (LoginData.manager.getId().equals(id) && LoginData.manager.getPwd().equals(pwd)) {
                break;
            } else {
                System.out.println("프로그램이 종료되었습니다.");
                System.exit(3);
            }


        } while (true);
        do {
            System.out.print("메뉴[1.회원관리,2.도서관리,3.시스템종료]?");
            String menu = scan.nextLine();
            switch (menu) {
                case "1":
                    do {
                        System.out.print("메뉴[1.회원목록,2.회원등록,3.회원수정,4.회원삭제,5.종료]?");
                        String menu2 = scan.nextLine();
                        switch (menu2) {
                            case "1":
                                memberPrint();
                                break;
                            case "2":
                                memberInsert();
                                break;
                            case "3":
                                memberEdit();
                                break;
                            case "4":
                                memberDelete();
                                break;
                            case "5":
                                System.exit(0);
                        }

                    } while (true);

                case "2":
                    do {
                        System.out.print("메뉴[1.도서목록,2.도서등록,3.도서별대여확인,4.대여수정,5.도서삭제,6.종료]?");
                        String menu3 = scan.nextLine();
                        switch (menu3) {
                            case "1":
                                bookPrint();
                                break;
                            case "2":
                                bookInsert();
                                break;
//                            case "3":
//                                bookRent();
//                                break;
//                            case "4":
//                                bookEdit();
//                                break;
//                            case "5":
//                                bookDelete();
//                                break;
                            case "6":
                                System.exit(0);
                        }
                    } while (true);
            }


        } while (true);

    }

    public void memberPrint() {
        System.out.println("번호\t이름\t\t연락처\t\t\t주소");
        for (MemberVO vo : MemberData.memberList) {
            System.out.println(vo.getNum() + "\t" + vo.getName() + "\t" + vo.getTel() + "\t" + vo.getAddr());
        }
    }

    public void memberInsert() {
        MemberVO vo = new MemberVO();
        System.out.print("번호입력=");
        vo.setNum(Integer.parseInt(scan.nextLine()));
        System.out.print("이름입력=");
        vo.setName(scan.nextLine());
        System.out.print("연락처입력=");
        vo.setTel(scan.nextLine());
        System.out.print("주소입력=");
        vo.setAddr(scan.nextLine());
        MemberData.memberList.add(vo);
        System.out.println(vo.getName() + "회원이 등록되었습니다");
    }

    public void memberEdit() {
        System.out.print("수정할 회원이름입력=");
        String name = scan.nextLine();

        System.out.print("수정할 필드(1.연락처, 2.주소)를 선택=");
        String field = scan.nextLine();

        if (field.equals("1")) System.out.print("수정할 연락처를 입력=");
        else System.out.println("수정할 주소를 입력=");
        String editData = scan.nextLine();

        for (int i = 0; i < MemberData.memberList.size(); i++) {
            MemberVO vo = MemberData.memberList.get(i);
            if (vo.getName().equals(name)) {
                switch (field) {
                    case "1":
                        vo.setTel(editData);
                        break;
                    case "2":
                        vo.setAddr(editData);
                }
                break;
            }
        }
    }

    public void memberDelete() {
        System.out.print("삭제할 회원이름입력=");
        String delName = scan.nextLine();

        for (int i = 0; i < MemberData.memberList.size(); i++) {
            if (MemberData.memberList.get(i).getName().equals(delName)) {
                MemberData.memberList.remove(i);
                System.out.println(delName + "회원을 삭제하였습니다.");
                break;
            }
        }
    }

    public void bookPrint() {
        System.out.println("번호\t도서\t\t\t\t대여일자\t\t\t대여자");
        for (BookVO vo : BookData.bookList) {
            System.out.println(vo.getNum() + "\t" + vo.getName() + "\t" + vo.getLentaldate() + "\t" + vo.getLentaler());
        }
    } public void bookInsert() {
        BookVO vo = new BookVO();
        System.out.print("번호 입력=");
        vo.setNum(Integer.parseInt(scan.nextLine()));
        System.out.print("도서제목 입력=");
        vo.setName(scan.nextLine());
        BookData.bookList.add(vo);
        System.out.println("도서가 등록되었습니다");
    }
}