package j02_array;

public class Array01 {
    public static void main(String[] args) {
        //배열형 변수 선언하기
        //1차원배열, 2차원배열, 3차원배열
        //정수 10개를 저장할수 있는 배열선언
        //같은데이터형의 변수를 여러개 필요할 때 선언
        //배열은 생성된후 배열의 크기를 변경할 수 없다.
        // 정수=0, 실수=0.0, 문자=null, 논리=false
        int arr[] = new int[5];
        arr[3] = 89;
        System.out.println(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        String name[] = new String[10];
        name[2] = "홍길동";
        for(int i = 0; i<name.length; i++){
            System.out.println(name[i]);
        }
    }
}
