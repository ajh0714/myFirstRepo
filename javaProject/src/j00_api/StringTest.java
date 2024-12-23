package j00_api;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        //String 클래스 : 문자열을 가질 수 있는 클래스이며,
        // 기본데이터형처럼 사용할 수 있는 특수 클래스

        String name1 = "홍길동";
        String name2 = "홍길동";
        if(name1 == name2){
            System.out.println("name1과 name2는 같다");
        }else{
            System.out.println("name1과 name2는 다르다");
        }

        String username1 = new String("세종대왕ABCD");
        String username2 = new String("세종대왕");
        if(username1.equals(username2)){
            System.out.println("username1과 username2는 같다");
        }else{
            System.out.println("username1과 username2는 다르다");
        }

        //charAt(): 문자열에서 특정위치(index)의 문자를 얻어오기
        char r1 = username1.charAt(1);
        System.out.println("charAt()="+r1);
        byte r2[] = username1.getBytes();
        System.out.println("getbytes()="+ Arrays.toString(r2));
        //특정문자의 위치를 확인한다. 있으면 index, 없으면 -1
        int r3 = username1.indexOf("대왕5");
        System.out.println("indexOf()="+r3);
        //문자의 갯수를 구하여 int형으로 리턴한다.
        int r4 = username1. length();
        System.out.println("length()="+ r4);

        String text = "Java Programing Test";
        //"Java"-> "자바"로 변경
        text = text.replaceAll("Java","자바");
        System.out.println("replaceAll="+text);
        //문자열에 일부 문자열을 얻어오기
        // 1 234567890
        // 자바 Programing test
        String r5 = text.substring(3); // index 3의 위치부터 끝까지의 문자열 리턴
        String r6 = text.substring(3,8); // index 3부터 index 8 앞까지의 문자열 리턴
        System.out.println("substring=>"+ r5+","+r6);

        System.out.println("toLowerCase()=>"+ text.toLowerCase());  //대문자 소문자로
        System.out.println("toUpperCase()=>"+ text.toUpperCase());  //소문자 대문자로

        String str = "       Java Class      test       ";
        System.out.println("trim()=>"+str.trim()+"-");  //양쪽의 공백문자 제거한다.

        int n1 =4567;
        String r7 = n1 +""; // 숫자+문자=연결(문자)
        String r8 = String.valueOf(n1);

        String s1 = "홍길동";
        String s2 = "김삿갓";
        //compareTo(): 대소문자 구별함
        //compareToignoreCase() : 대소문자 구별안함
        if(s1.compareToIgnoreCase(s2) > 0){
            System.out.println(s2+"가 작은 글자 이다.");
        }else{
            System.out.println(s1+"가 작은 글자이다.");
        }
    }
}
