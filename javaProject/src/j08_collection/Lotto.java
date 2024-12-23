package j08_collection;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        // 1~45까지 로또번호 만들기
        do{
            //게임수 입력
            System.out.print("게임수 입력=");
            int gameCnt = scan.nextInt();
            //게임수 만큼 로또번호 생성,출력
            for (int cnt = 1; cnt <= gameCnt; cnt++) {
                //1게임
                TreeSet<Integer> ts = new TreeSet<>();
                int lastLotto=0;
                while (ts.size()<7) {
                    lastLotto = random.nextInt(45) + 1;
                    ts.add(lastLotto);
                }
                ts.remove(Integer.valueOf(lastLotto));

                System.out.print(cnt+"게임=");
                Object[] arr = ts.toArray();
                System.out.print(Arrays.toString(arr));
                System.out.println(", bonus="+lastLotto);
                }
            //계속 여부
            System.out.print("계속하시겠습니까(1.예,2.아니오)?");
            int que = scan.nextInt();
            if(que!=1){
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }

        }while (true) ;



    }
}
