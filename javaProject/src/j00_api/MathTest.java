package j00_api;

public class MathTest {
    public static void main(String[] args) {
        //math클래스 : 수학관련기능을 만들어 놓은 클래스
        // math.PI
        System.out.println("abs()=>"+Math.abs(-20)); // abs> 절대치
        System.out.println("ceil()=>"+Math.ceil(2.31)+", "+Math.ceil(-9.2)); // 소수이하 올림
        System.out.println("flor()=>"+Math.floor(53.9)+", "+Math.floor(-6.5));// 소수이하 내림
        System.out.println("round()=>"+Math.round(56.6)); // 반올림
        System.out.println("max()=>"+Math.max(56,24)+"min()=>"+Math.min(56,24));
        System.out.println("sqrt()=>"+Math.sqrt(2));
        System.out.println("pow()=>"+Math.pow(4,5));

        //random() : 난수 생성하기
        //           0.0~0.99999999999
        for (int i=1; i<=1000; i++){
            // int ran = (int)(Math.random()*10)+1;
            int ran = (int)(Math.random()*(45-25+1))+25;
            System.out.print(ran +"\t");
            if(i%9==0) System.out.println();
            //25~45
            //(정수화)(난수*(큰수-작은수+1))+작은수
        }
    }
}
