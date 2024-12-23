package j04_oop2;

import J03_oop.ProtectedTest;

public class ProtectedMain extends ProtectedTest{
    ProtectedMain(){


    }

    public static void main(String[] args) {
        ProtectedMain pm = new ProtectedMain();
        // 생성자가 다른 팩키지일 경우 public 이상의 제한자 이어야 한다.
        // protected는 같은 팩키지에서는 접근허용된다.
        //             다른 팩키지에서는 상속받아 사용해야 한다.
        //ProtectedTest pt = new ProtectedTest();
        System.out.println(pm.type);

        pm.setType(5);
        System.out.println(pm.type);
    }
}
