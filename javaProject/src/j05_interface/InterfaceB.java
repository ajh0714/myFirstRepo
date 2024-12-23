package j05_interface;
//인터페이스가 인터페이스를 상속받을때는 extends로 상속받고
//1개의 인터페이스만 받을 수 있다.
public interface InterfaceB  extends InterfaceA{
    public int divide(int a, int b);
}
