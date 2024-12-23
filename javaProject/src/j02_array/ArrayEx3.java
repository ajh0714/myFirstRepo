package j02_array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String title[]={"국어","영어","수학"};
        //각 과목의 점수, 총점, 평균
        int jumsu[] = new int[5];

        //점수입력
        for(int i=0; i<title.length; i++) {      //0,1,2
            System.out.print(title[i] + "=");
            jumsu[i] = scan.nextInt();
        }
        //총점구하기
        for(int i=0; i< title.length; i++){
            jumsu[title.length]+= jumsu[i];
        }
        System.out.println("총점="+jumsu[title.length]);
        //평균구하기
        jumsu[title.length+1] = jumsu[title.length]/ title.length;
        System.out.println("평균="+jumsu[title.length+1]);



    }
}
