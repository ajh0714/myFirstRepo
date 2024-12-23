package data;

import vo.MemberVO;

import java.util.ArrayList;
import java.util.List;

public class MemberData {
    public static List<MemberVO> memberList = new ArrayList<MemberVO>();
    public static void setMember(){
        memberList.add(new MemberVO(1,"홍길동","010-1111-1111","서울특별시"));
        memberList.add(new MemberVO(2,"이순신","010-2222-2222","성남시"));
        memberList.add(new MemberVO(3,"안중근","010-3333-3333","수원시"));
        memberList.add(new MemberVO(4,"이재용","010-4444-4444","서울특별시"));
        memberList.add(new MemberVO(5,"김하나","010-5555-5555","인천광역시"));
        memberList.add(new MemberVO(6,"김덕배","010-6666-6666","천안시"));


    }
}
