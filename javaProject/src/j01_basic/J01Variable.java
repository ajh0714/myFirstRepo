package j01_basic;

public class J01Variable {
    public static void main(String args[]){
        // 변수 :변수는 값을 보관하는 이름
        int age = 10;
        int carBodyColor;  // 256
        int staticNum;

        int score;
        score = 20;
        int score2 = 90;

        int a=30, b=40, c=50;

        int result = score * 2;//40
        int result2 = score2 * 2;//180
        int result3 = a+b+c+score2;
        System.out.println(result); // sout
        System.out.println(result2);
        System.out.println(result3);

        int eng = 50;
        double kor = 60.2;
        boolean pass = true; // false

        byte num = (byte)130;

        int mat = (int)kor;

        System.out.println(num);
        System.out.println(mat);

        byte x = 40;
        // 4byte 1byte
        int y = x;
        double z = eng;

        long data = 22222222224645645L;
        float data2 = 5678.44f;

        char c1 = '홍'; // 1개의 문자만 저장 가능
        char c2 = 'A';

        //문자열
        //String은 특수 클래스이고 기본 변수처럼 사용가능
        String name = "홍길동";
        char c3 = (char)(c1 + 1);

        String name2 = name + "입니다.";
        System.out.println(name2);
        
    }
}
