package j02_array;

import java.util.Random;

public class ArrayEx2 {
    public static void main(String[] args) {
        Random random = new Random();
        //1차원배열을 이용하여 총합과 평균구하기
        // 배열에 1~100사이의 값을 22개만들어 난수를 저장하고
        // 생성된 난수의 합과 평균을 구하라.
        int data[] = new int[22];
        for(int i=0; i<data.length; i++){
            data[i] = (int)(Math.random()*100-1+1)+1;
            System.out.print(data[i]);
        }
        int sum = 0;
        for(int i=1; i<data.length; i++){
            sum += data[i];
        }
        int ave = sum / data.length;
        System.out.println("총합="+sum);
        System.out.println("평균="+ave);

    }
}
