package j02_array;

public class ArrayEx {
    public static void main(String[] args) {
        //1 ~ 1000 사이의 난수를 100개 만들어 배열해 저장하고
        // 생성된 난수중 최대값, 최소값을 구하여 출력하라.
        int data[] = new int[100];
        //난수를 배열에 대입하기
        for(int i=0; i<data.length; i++) { // i= 0,1,2,3,4,5
            //큰수-작은수+1
           data[i]=(int)(Math.random()*(1000-1+1)) +1;
        }
        //------------------------------------
        int max = data[0];// 최대값변수
        int min = data[0];// 최소값변수

        for(int i=1; i<data.length; i++){
            if(data[i]>max) max = data[i];//최대값구하기
            if(data[i]<min) min = data[i];
        }
        System.out.println("최대값="+max);
        System.out.println("최소값="+min);
    }

}
