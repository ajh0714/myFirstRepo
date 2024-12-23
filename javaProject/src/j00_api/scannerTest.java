package j00_api;
import java. lang.System;//lang팩키지의 클래스는 컴파일러가 자동으로 import해준다
import java. util.Scanner;//util팩키지는 자동으로 import 안해준다.
public class scannerTest {
    public static void main(String[] args){
        // Scanner 클래스 콘솔에서 점수, 실수 ,문자를 입력받을 수 있다.
        // 콘솔의 값을 문자로 읽어와 원하는 데이터형으로 변경해준다.

        //Scanner클래스로 객체를 만든다.
        Scanner scan = new Scanner(System.in); //생성자메소드

        //문자 , 문자열 입력받기
//        String name = scan.next();
//        scan.nextLine(); // enter키 읽어오기
//        System.out.println("name="+name);
//
//        String addr = scan.nextLine();
//        System.out.println("addr="+addr);

        //숫자 입력받기
        System.out.print("양의 정수입력=>");
        int data = scan.nextInt();
        System.out.println(data+100);

        System.out.print("실수 입력=>");
        double data2 = scan.nextDouble();
        System.out.println(data2+100);

        System.out.print("논리값(true/false)=>");
        boolean data3 = scan.nextBoolean();
        System.out.println();

    }
}
