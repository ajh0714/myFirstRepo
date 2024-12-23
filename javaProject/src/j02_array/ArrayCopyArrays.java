package j02_array;

import java.util.Arrays;

public class ArrayCopyArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] tar = Arrays.copyOfRange(arr, 0, 9);

        for(int i=0; i<tar.length; i++){
            System.out.println("tar["+i+"]="+tar[i]);
        }

    }
}
