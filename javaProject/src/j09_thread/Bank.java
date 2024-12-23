package j09_thread;

import java.util.Properties;

public class Bank implements Runnable {
    public int money = 10000; // 잔고

    public Bank(){}

    @Override
    //synchronized는 스레드 동기화 하는것이고
    // 현재실행중 run()의 실행문이 완료되어야 다음 스레드가 시작된다.
    //public synchronized void run() {
        //한번에 1000씩 10번 출금하기
    public void run(){
        synchronized (this){
        for(int i=1; i<=10; i++) {
            getCash(1000); //출금
            // 잔액이 2000이면 스레드 일시정지하기
            if (money % 2000 == 0) {
                try {
                    this.wait();//thread일시정지 : 비동기 해제
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
            } else {
                this.notify();//동기화하기
            }
            //일정한 시간동안 일시정지하기
            try {
                Thread.sleep(2000);
            }catch (InterruptedException ii){}
        }
        }
    }
    //출금메소드
    public void getCash(int cash){
        if(money>=cash){
            money = money - cash;
            System.out.println(Thread.currentThread().getName()+"잔액="+money);
        }else{
            System.out.println("잔액이 부족합니다");
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        //                                     스레드명
        Thread mother = new Thread(bank,"엄마");
        Thread sun = new Thread(bank,"아들");

        mother.start();
        sun.start();
    }
}
