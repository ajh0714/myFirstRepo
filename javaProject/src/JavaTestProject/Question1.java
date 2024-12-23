package JavaTestProject;

import java.util.Arrays;
import java.util.Random;

public class Question1 {
    public static void main(String[] args) {
        Random random = new Random();
        int data[] = new int[10];
        System.out.println("==========정렬전===========");
        for(int i=0; i<=data.length-1; i++){
            data[i] =(int)(Math.random()*100-1+1)-1;
        }
        System.out.println(Arrays.toString(data));
        System.out.println("==========정렬후===========");
        Arrays.sort(data,0,10);
        System.out.print(Arrays.toString(data));
    }
}
