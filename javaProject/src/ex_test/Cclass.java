package ex_test;

class Bclass extends Aclass {
    public Bclass(int a){super(a);}

}
public class Cclass
{
    public static void main(String[] args) {
        Bclass ob = new Bclass(420);
        System.out.println(ob.a);
    }
}

