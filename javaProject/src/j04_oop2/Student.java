package j04_oop2;

//final : 클래스, 멤버변수, 메소드
//클래스 : final클래스는 상속되지 않는다.
public class Student {
    String name = "홍길동";
    int ban = 3;

    public Student(){}

    public String getName(){
        return name;
    }
    public  int getBan(){
        return ban;
    }
}
