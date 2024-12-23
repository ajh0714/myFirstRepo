package j02_array;

import java.util.*;

public class BubbleSortAsc {
    public static void main(String[] args) {
        Random ran = new Random();
        int arr[] = new int[10]; // 1~100사이 난수

        for(int i=0; i<arr.length; i++){
            arr[i] = ran.nextInt(100)+1;
        }
        System.out.println("==========정렬전===============");
        System.out.println(Arrays.toString(arr)); // [3,6,2]
        //정렬 -> 버블정렬
        for(int j=0; j<arr.length-2; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    //값교환
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("================정렬후=================");
        System.out.println(Arrays.toString(arr));

        System.out.println("============Arrays클래스를 이용한 정렬===========");
        int arr2[] = new int[10];
        for(int i=0; i<arr2.length;i++){
            arr2[i] = ran.nextInt(900)+100; // 100~999 =큰수-작은수+1
        }
        System.out.println("======정렬전======");
        System.out.println(Arrays.toString(arr2));

        //정렬하기
        Arrays.sort(arr2);
        System.out.println("============정렬후================");
        System.out.println(Arrays.toString(arr2));
    }
}
