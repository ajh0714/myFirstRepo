package j01_basic;

public class J03Operator {
    public static void main(String[] args){
        //삼항연산자 : (조건식) ? 참일때 : 거짓일때

        // 정수 : 1 ~100사이의 정수
        //         60보다 크면 통과
        //         60보다 작으면 실패
        int jumsu =105;
        //
       //   String result = (jumsu>=60)? "통과" : "실패";

        // 1~100사이 일때
       String result = (jumsu>=0 && jumsu<=100)? (jumsu>=60)? "통과":"실패" :"잘못된 값 입니다" ;
        System.out.println("result=>"+result);

        int num = 0;
        //num 변수의 값을 양수, 음수, 0으로 구별하여 출력하라.
        String result2 = (num==0)? "0" : (num>0)?"양수" : "음수";
        System.out.println("result2=>"+result2);

        int n1 = 10;
        int n2 = 6;

        int r1 = n1 & n2;
        System.out.println("r1="+r1);
        int r2 = n1|n2;
        System.out.println("r2="+r2);
        int r3 = n1^n2;
        System.out.println("r3="+r3);
        int r4 = ~n2; //bit의 부정
        System.out.println("r4="+r4);
        int r5 = n2>>>2;
        System.out.println("r5="+r5);



}

}
