package j06_innerClass;

public class MethodInnerClass {
    int num = 10;
    String email = "abcd@nate.com";
    public MethodInnerClass(){

    }
    public void memberOutput(){
        System.out.println(num +"-->"+email);
    }
    public void createMethodInner(){
        //내부클래스 생성하기
        class Member{
            int num = 20;
            String name = "안중근";
            Member(){}
            void memberPrint(){
                System.out.println(num + "==>"+name+ "==>"+email);
            }
        }

        Member member = new Member();
        member.memberPrint();
    }

    public static void main(String[] args) {
        MethodInnerClass mic = new MethodInnerClass();
        mic.createMethodInner();
    }
}
