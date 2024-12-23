package j02_array;

public class Array02 {
    public static void main(String[] args) {
        //배열선언시 초기값 설정
        //데이터의 수만큼 배열의 길이가 자동으로 정해짐
        int arr[] = new int[]{23,34,67,89,66};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        double data[] = {12.6, 42.5, 75, 25.8};
        for(int i=0; i<data.length; i++){
            System.out.println(data[i]);
        }

        String colorName[] = {"Red","Blue","노랑","초록"};
        for(int i=0; i<colorName.length; i++){
            System.out.println(colorName[i]);
        }
    }
}
