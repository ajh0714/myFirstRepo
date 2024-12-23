package j08_collection;

public class MemberVO {
    private int num;
    private String username;
    private String tel;
    public MemberVO(){}
    public MemberVO(String username, String tel){
        this.username = username;
        this.tel = tel;
    }
    public MemberVO(int num, String username, String tel){
        this.num = num;
        this.username = username;
        this.tel = tel;
    }
    //toString() : 메소드 오버라이딩

    @Override
    public String toString() {
        return num+"\t"+username+"\t"+tel;
    }

    //getter : hetUsername(), getTel()


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public static void main(String[] args) {

    }
//setter : setUsername(), setTel()
}
