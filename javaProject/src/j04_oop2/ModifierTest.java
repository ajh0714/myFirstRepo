package j04_oop2;


import J03_oop.ModeNum;

public class ModifierTest {
    public static void main(String[] args) {
        ModeNum mn = new ModeNum();
        mn.start();
        System.out.println(mn.data);

        PrivateTest pt = new PrivateTest();

        pt.add(50,100);
        //System.out.println(pt.sum);
        //sum의 값을 2000변경하기
        pt.setSum(2000);
        System.out.println(pt.getSum());
    }
}
