package j02_array;

import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {
        //2차원배열의 행마다 다른 칸의 수로 배열 생성하기

        //2차원을 생성하는데 행의 있고 열의 수는 없는 배열을 생성한다.
        int arr[][] = new int[3][];
        //각행마다 열의 수를 생성한다.
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        arr[1][3] = 9;
        arr[2][0] = 3;

        for(int a[]: arr){
            System.out.println(Arrays.toString(a));
        }
       int data[][] = new int[10][10];
        for(int r=0; r<data.length; r++){
            for(int c=0; c<data[r].length; c++){
                if(r==c || r+c==data.length-1){
                    data[r][c] = 1;
                }
            }
        }
        for(int d[]:data){
            String txt = Arrays. toString(d);
            System.out.println(txt.substring(1, txt.length()-1));
        }
    }
}
