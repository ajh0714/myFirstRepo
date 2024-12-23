package JavaTestProject;

public class SportCar extends Car {
    public SportCar(){
        System.out.println("brand :"+brand);
        System.out.println("color :"+color);
        System.out.println("maxSpeed :"+maxSpeed);
        System.out.println("speed :"+speed);
    }
    @Override
    public void speedUp() {
        super.speedUp();
        speed += 2;
    }
    public void speedDown(){
        speed--;
        if(speed<0) speed=maxSpeed;
    }

}
