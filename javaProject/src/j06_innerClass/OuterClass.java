package j06_innerClass;
//내부클래스
//1. 클래스영역에 선언한 클래스
//2. 메소드영역에 선언한 클래스
//3. 익명의 내부클래스
public class OuterClass {
    int num = 1000;
    String name = "홍길동";
    String addr = "서울시 성동구 아차산로";
    public OuterClass(){
        //output();
        //내부클래스 객체생성
        InnerClass ic2 = new InnerClass();
        ic2.output();
    }
    public void print(){
        System.out.println("name="+name);
        System.out.println("addr="+addr);
    }
    //내부 클래스
    class InnerClass{
        int num = 2000;
        String name ="이순신";
        String tel ="010-1234-5678";
        InnerClass(){}
        void output(){
            System.out.println(num+", "+name+", "+tel+", "+addr);
            print();
        }
    }


    public static void main(String[] args) {
        //내부 클래스 객체 생성하는 방법
        OuterClass oc = new OuterClass();
        InnerClass ic = oc.new InnerClass();


        ic.output();
    }
}
