package process;

import data.DataSet;
import vo.MemberVO;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class MemberStart {
    Scanner scan = new Scanner(System.in);

    public MemberStart() {
        //기본데이터 셋팅
        DataSet.setMember();
    }

    public void start() {

        do {
            //메뉴:1.회원목록,2.회원등록,3.회원수정,4.회원삭제,5.종료
            System.out.print("메뉴[1.회원목록,2.회원등록,3.회원수정,4.회원삭제,5.종료]?");
            String menu = scan.nextLine();
            switch (menu) {
                case "1":
                    memberPrint();
                    break;
                case "2":
                    memberInsert();
                    break;
                case "3":
                    memberEdit();
                    break;//연락처,이메일
                case "4":
                    memberDelete();
                    break;
                case "5":
                    System.exit(0);
            }

        } while (true);

    }

    public void memberPrint() {
        System.out.println("번호\t이름\t\t연락처\t\t\t이메일");
        for (MemberVO vo : DataSet.memberList) {
            System.out.println(vo.getNum() + "\t" + vo.getName() + "\t" + vo.getTel() + "\t" + vo.getEmail());
        }
    }

    //회원등록
    public void memberInsert() {
        // 번호,이름,연락처,이메일 입력받아 MemberVO객체 담기
        MemberVO vo = new MemberVO();
        System.out.print("번호입력=");
        vo.setNum(Integer.parseInt(scan.nextLine()));
        // int num = Integer.parseInt(scan.nextLine());
        System.out.print("이름입력=");
        vo.setName(scan.nextLine());
        //String name = scan.nextLine();
        System.out.print("연락처입력=");
        vo.setTel(scan.nextLine());
        //String tel = scan.nextLine();
        System.out.print("이메일입력=");
        vo.setEmail(scan.nextLine());
        //String email = scan.nextLine();

        //DataSet클래스의 memberList객체에 추가한다.
        DataSet.memberList.add(vo);
        System.out.println(vo.getName() + "회원이 등록되었습니다");
    }

    //회원정보 수정
    //연락처와 이메일을 각각수정하기
    public void memberEdit() {
        //수정할 회원이름
        System.out.print("수정할 회원이름입력=");
        String name = scan.nextLine();

        //연락처,이메일중 수정할 항목선택
        System.out.print("수정할 필드(1.연락처, 2.이메일)를 선택=");
        String field = scan.nextLine();

        //수정할 데이터입력
        if (field.equals("1")) System.out.print("수정할 연락처를 입력=");
        else System.out.println("수정할 이메일을 입력=");
        String editData = scan.nextLine();

        for (int i = 0; i < DataSet.memberList.size(); i++) {//1명 수정할 대상인지 확인
            MemberVO vo = DataSet.memberList.get(i);
            if (vo.getName().equals(name)) { //수정할 회원과 같은지 확인////
                switch (field) {
                    case "1":
                        vo.setTel(editData);
                        break;//연락처수정
                    case "2":
                        vo.setEmail(editData); // 이메일수정
                }
                break; //for
            }
        }
    }

    public void memberDelete() {
        //삭제할 회원명을 입력받아 해당 vo를 지운다.
        System.out.print("삭제할 회원이름입력=");
        String delName = scan.nextLine();

        for (int i = 0; i < DataSet.memberList.size(); i++) {
            if (DataSet.memberList.get(i).getName().equals(delName)) { //입력받은 이름과 같으면
                DataSet.memberList.remove(i);
                System.out.println(delName+"회원을 삭제하였습니다.");
                break;
            }
        }
    }
}
