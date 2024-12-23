package j04_oop2;
//private 접근제한자
// 생성자 메소드,멤버변수,메소드
class PrivateTest {
    //멤버변수 private접근제한자를 붙히면 객체를 통하여 변수에 접근할수 없다.
    private int sum;
    //생성자에 private 접근제한자는 객체생성불가이다.
    //private privateTest(){}
    PrivateTest(){

    }
    //메소드에 프라이빗접근제한자는 객체를 통하여 호출할수없다.
    void add(int a, int b){
        sum =a+b;
    }
    void minus(int a, int b){
        sum = a-b;
    }
    //캡슐화된 변수 sum에 접근할수있는 메소드를 생성해준다.
    //값 변경이 가능한 메소드
    void setSum(int sum){
        this.sum = sum;
    }
    //값을 얻을수 있는 메소드를
    int getSum(){
        return sum;
    }
}
