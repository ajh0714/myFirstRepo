package j01_basic;

public class Exercise2 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);

        char ch = 'A';
        ch = (char)(ch + 2);

        float f = 3.0f / 2.0f;
        long l = 3000*3000*3000L;
        float f2 = 0.1f;
        double d = 0.1;

        boolean result = d== f2;

        System.out.println("c="+c); //30
        System.out.println("ch="+ch); // C
        System.out.println("f="+f); // 1.5
        System.out.println(f2 +". "+d);
        System.out.println("l="+l); // 27000000000L
        System.out.println("result="+result); //
    }
}
