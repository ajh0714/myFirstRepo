package j08_collection;

import java.util.Random;
import java.util.Stack;

public class StackTest {
    public StackTest(){}
    public void start(){
        //Stack은(FILO,LIFO) 먼저 저장된 데이터가 마지막에 출력된다.
        Random ran = new Random();

        Stack<Integer>stack = new Stack<>();

        for(int i=1; i<=10; i++) {
            int n = (ran.nextInt(100)); // 0~99
            stack.push(n);
            System.out.print(n+"\t");
        }
        System.out.println();

        while (!stack.empty()) { //stack객체가 있으면 false, 없으면 true
            //pop() : 꺼낸후 스택의 객체를 지운다.
            //peek() : 꺼낸후 스택의 지우지 않는다.
            System.out.print(stack.pop()+"\t");
        }
    }

    public static void main(String[] args) {
        new StackTest().start();
    }
}
