package j04_oop2;

public class School extends Student{
    String name ="이순신";
    public School(){
    }
    //오버라이딩
    public String getName(){
        return super.name+"님";
    }
    public  void print(){
        System.out.println("school에 있는 메소드");
    }

    public static void main(String[] args) {
        School sch = new School();
        System.out.println(sch.getName()+", "+sch.getBan());
        sch.print();

        Student stu = new School();
        System.out.println(stu.getName()+", "+sch.getBan());
        // 하위클래스의 메소드이므로 상위클래스타입에 변수에서 접근할수없다.
        //stu.print();

        Object obj = new School();

        School sch2 = (School)obj;
        System.out.println(sch2.getName());
        System.out.println(sch2.getBan());
        sch2.print();

    }
}
