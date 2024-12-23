package j01_basic;

public class J18For {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        for(i=1;i<=100;i++){
            sum += i;
        }
        //System.out.println("1-"+(i-1)+"까지의 합은"+sum);
        //1~100까지의 짝수의 합
        int j=1;
        int evenSum = 0;
        for(j=1; j<=100; j+=2){
            evenSum += j;
        }
        System.out.println("홀수의 합="+evenSum);

    }
}
