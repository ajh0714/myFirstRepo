package j04_oop2;
//                 car클라스 상속받기
public class Truck extends Car{
    int door = 4;
    // 상위클래스 car에 있는 같은 이름의 변수 하위클래스에서 선언할수 있다.

    String carColor = "red";
    public Truck(){
        //상위 클래스의 int매개변수를 가진 생성자가 실행되도록 호출하기
        super(20);
        //하위 클래스 truck()생성자로 객체로 만들면
        //상위 클래스인 Car클래스의 생성자가 먼저 호출된다.
        System.out.println("speed="+speed);
        System.out.println("carColor="+carColor);
        System.out.println("MAX="+MAX);
        System.out.println("door="+door);

        //상위클래스의 변수에 접근하기
        //this, this()
        //super: 상위클래스
        //super(): 상위클래스의 생성자 메소드
        System.out.println("Car.carColor==>"+ super. carColor);
    }
    public void speedUp(){
        speed=10;
        if(speed>MAX) speed=MAX;
    }


    public void speedDown(){
        speed=10;
        if(speed<0) speed=0;
    }


    public static void main(String[] args) {
        new Truck();
    }
}
