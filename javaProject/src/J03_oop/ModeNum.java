package J03_oop;

public class ModeNum {
    int ranNum[];//난수 1000개를 보관할 배열
    public int data = 500;
    public ModeNum(){
        start();
    }
    public void start(){
        createRandom();
        int count[] = ModeCount();
        maxSearch(count);
    }
    //1~100사이의 난수 1000개를만들어 배열에 담는 메소드
    void createRandom(){
        ranNum = new int[1000];
        for(int i=0; i<ranNum.length; i++){
            ranNum[i] = (int)(Math.random()*(100-1+1))+1;
        }
    }
    //배열 ranNum의 값을 갯수를 구한다.
    int[]ModeCount(){
        //갯수를 카운트할 배열
        int cnt[] = new int[101];
        for(int i=0; i<ranNum.length; i++){
            ++cnt[ranNum[i]];
        }
        return cnt;
    }
    //최빈수 구하기 >> 제일 큰값을 가진 index를 구하면 최빈수가 된다.
    void maxSearch(int data[]) {
        int searchIndex = 1;
        for (int i = 2; i < data.length; i++) {// 2,2,3,4,5,....100
            if (data[searchIndex] <= data[i]) {
                searchIndex = i;
            }

        }
        //최빈수 출력
        for (int i = 0; i < data.length; i++) {
            System.out.print("data["+i+"]="+data[i]+"\t");
            if(i%10==0) System.out.println();
        }
        System.out.println("\n최빈수="+searchIndex);
    }
    //public static void main(String[] args) {
     //   new ModeNum();
   // }
}
