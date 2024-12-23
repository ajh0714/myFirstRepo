package j01_basic;

public class J27BreakContinue {
    public static void main(String[] args) {
        //반복문 중지
        for(int i=1; i<=100; i++){
            System.out.println(i);
            if(i%10==0){
                break;
            }
        }
        //continue : 한번 건너띄기
        for(int i =1;i<=100; i++){
            //i의 값이 3의 배수일때만 출력
            if(i%3==0)
                continue;
            System.out.println(i);
        }
    }
}
