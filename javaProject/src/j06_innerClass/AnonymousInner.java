package j06_innerClass;

public class AnonymousInner {
    String name = "이순신";
    public AnonymousInner(){
        //익명(클래스명)의 내부 만들어 사용하기
        //(클래스명)obj;
        new Employee(){
            //오버라이딩 메소드 기술
            public void output(){
                System.out.println("name--->"+name);
            }
        }.output();
    }

    public static void main(String[] args) {
        new AnonymousInner();
    }
}

/*

 */