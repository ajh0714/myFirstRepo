package ex_test;

public class ItemTest {
     int id;
    public ItemTest(int id){this.id = id;}
    public void updateId(int newId){id = newId;}

    public static void main(String[] args) {
        ItemTest fa = new ItemTest(42);
        fa.updateId(69);
        System.out.println(fa.id);
    }
}
