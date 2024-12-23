package vo;

public class MemberVO {
    private int num;
    private String name;
    private String tel;
    private String email;

    public MemberVO(){}
    public MemberVO(int num, String name, String tel, String email){
        this.num = num;
        this.name = name;
        this.tel = tel;
        this.email = email;

    }
    @Override
    public String toString() {
        return num + "\t" + name + "\t" + tel  + "\t" + email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
