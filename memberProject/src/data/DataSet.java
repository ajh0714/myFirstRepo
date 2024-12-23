package data;

import vo.MemberVO;

import java.util.ArrayList;
import java.util.List;

public class DataSet {
    //1명의 회원정보 memberVO셋팅
    //MemberV0객체 LIST에 담는다
    public static List<MemberVO> memberList = new ArrayList<MemberVO>();

    //회원정보 초기데이터 셋팅하기
    public static void setMember(){
        memberList.add(new MemberVO(100,"손흥민","010-1111-2222","son@nate.com"));
        memberList.add(new MemberVO(200,"김민재","010-3333-4444","kim@naver.com"));
        memberList.add(new MemberVO(300,"이강인","010-8888-9999","lee@gmail.com"));
        memberList.add(new MemberVO(400,"황희찬","010-7777-5555","hwang@daum.net"));


    }
}
