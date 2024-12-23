package JavaTestProject;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수입력=");
        int inData = scan.nextInt();
        int oddSum = 0, evenSum = 0;
        int sum = 0;
        int i = 0;
        if(inData<0 || inData>1000) {
            System.out.println("잘못된 값입니다");
        }else{while (i < inData) {
            sum += i + 1;
            if (++i % 2 == 0) {
                evenSum += i;
            } else if (i % 2 == 1) {
                oddSum += i;
            }
        }
            System.out.println("1~" + inData + "까지의 홀수의 합은" + oddSum);
            System.out.println("1~" + inData + "까지의 짝수의 합은" + evenSum);
            System.out.println("1~" + inData + "까지의 합은" + sum);
        }
    }
}


