package j01_basic;

public class j06If {
    public static void main(String[] args) {
        /*if문
            조건식이 참일때 조건문 블럭이 실행됨
            if(조건식){
            실행문;
            실행문;
            실행문;
            :
            }
         */
        //값이 1~100사이일때 양수,0,음수를 구별하여 출력하라
        int data = 50;
        String result = "";
        if (data>=1 && data<=100) {
            result = (data > 0) ? "양수" : (data < 0) ? "음수" : "0";
            System.out.println(result);
        }
        System.out.println(result);
        System.out.println("The end..");
    }
}
