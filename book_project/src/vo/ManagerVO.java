package vo;

public class ManagerVO {
    private String id;
    private String pwd;

    public ManagerVO(String id,String pwd){
        this.id = id;
        this.pwd = pwd;

    }
    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setId(String id) {
        this.id = id;
    }
}
