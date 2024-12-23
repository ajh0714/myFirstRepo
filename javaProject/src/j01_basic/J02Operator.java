package j01_basic;

public class J02Operator{
    public static void main(String[] args) {//psvm
        int a = 10;
        int b = 3;
        //단항연산자 : +,-
        int r1 = -a;
        System.out.println("r1=>"+r1);
        //단항연산자 : ++,--(값을 1씩 증가 또는 감소하는 연산자)
        int c = 5;
        c++;
        System.out.println("c="+c);
        ++c;
        System.out.println("c="+c);
        c = c + 1;// 1증가
        System.out.println("c="+c);
        --c;
        System.out.println("c="+c);

        int r2 = ++c + 2;
        int r3 = c++ + 2;
        System.out.println("r2->"+r2+", r3->"+r3+", c="+c);

        int r4 = c++ + 3 + --c; // 4
        System.out.println("r4="+r4);

        // 산술연산자 : +,-,  <  *,/,%(나머지)
        int r5 = a % b; // 10/3 나머지1
        int r6 = a / b; // 10/3 = 3.333
        double r7 =  a / (double)b ; // 3.33333333
        System.out.println("r5=>"+r5+", r6=>"+r6+",r7=>"+r7);

        String str3 = "JDK" + 10 + 7;
        String str4 = 10 + 7 + "JDK";
        System.out.println(str3);
        System.out.println(str4);

        //비교연산자 : ==, !=, >, <, >=, <=
        // 연산결과는 논리형 데이터로 구해짐
        boolean r8 = a > b; // true
        System.out.println("r8=>"+r8);
        boolean r9 = a < b+3;
        System.out.println("r9=>"+r9);
        int num = 105;
        // num이 1~100 사이면 참이 되는 수식세우기
        boolean r10= num>=1 || num<=100;
        System.out.println("r10=>"+r10);

        int x = 52;
        x += 12;  // x=x+12
        System.out.println("x="+x);
        x *= 2; // x = x*2
        System.out.println("x="+x);
        x %= 3; // x = x % 3
        System.out.println("x="+x);

        int n1 =23;
        int n2 =9;
        int result = (n1*2)%3-(n2/4*n1)*12;
        System.out.println(result);

    }
    }