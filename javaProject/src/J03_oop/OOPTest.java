package J03_oop;

import j02_array.ModeNum;

public class OOPTest {
    public static void main(String[] args) {
        LottoOOP lotto = new LottoOOP();
        ModeNum mn = new ModeNum();
        do {
            int choice = lotto.getInput("메뉴를 선택하세요(1.최빈수, 2.로또번호생성)?");
            // 1을 입력받으면 최빈수구하기
            if (choice == 2) lotto.startlotto();
            // 2를 입력받으면 로또번호생성하기
        }while(true);
    }

}
