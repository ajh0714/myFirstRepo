package j09_thread;
// Runnable 인터페이스를 상속받아 run()메소드 오버라이딩한다.
// 현재클래스를 객체생성하여, 현재클래스 객체를 매개변수하는 Thread객체를 생성한다.
public class ThreadTest2 implements Runnable{
    String title;
    public ThreadTest2(){}
    public ThreadTest2(String title){
        this.title=title;
    }
    @Override
    public void run(){
        for(int i=1;      ;i++){
            System.out.println(title+"---->"+i);
        }
    }
    public static void main(String[] args) {
     ThreadTest2 tt1 = new ThreadTest2("First");
     ThreadTest2 tt2 = new ThreadTest2("Second");

     Thread t1 = new Thread(tt1);
     Thread t2 = new Thread(tt2);

     t1.start();
     t2.start();
    }
}
