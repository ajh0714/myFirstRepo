package j04_oop2;

public class Car {
    int speed;//현재속도
    String carColor="white";//차색상
    final int MAX = 200;
    //public Car(){
    //    System.out.println("Car()생성자");
    //}
    public Car(){
        System.out.println("Car()생성자");
        System.out.println("Car.carColor="+carColor);
    }
    public Car(int speed){
        this.speed = speed;
    }
    public void speedUp(){
        speed++;
        if(speed>MAX) speed=MAX;
    }
    public void speedDown(){
        speed--;
        if(speed<0) speed=0;
    }
}
