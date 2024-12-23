package vo;

public class BookVO {
    private int num;
    private String name;
    private String lentaldate;
    private String lentaler;

    public BookVO() {}
    public BookVO(int num, String name, String lentaldate, String lentaler) {
        this.num = num;
        this.name = name;
        this.lentaldate=lentaldate;
        this.lentaler=lentaler;


    }

    @Override
    public String toString() {return num + "\t" + name + "\t" + lentaldate  + "\t" + lentaler;}

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLentaldate() {
        return lentaldate;
    }

    public void setLentaldate(String lentaldate) {
        this.lentaldate = lentaldate;
    }

    public String getLentaler() {
        return lentaler;
    }

    public void setLentaler(String lentaler) {
        this.lentaler = lentaler;
    }



}
