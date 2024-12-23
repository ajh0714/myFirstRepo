package j07_exception;
//사용자 정의 예외 클래스 만들기
//반드시 Exception클래스를 상속받아 생성한다.
//1~100 사이의 값이 아닐때 예외발생시킬 클래스 사용할 것임.
public class MyException extends Exception {
    public MyException(){
        //상위 클래스의 생성자 메소드를 호출하여 예외메시지를 셋팅해준다.
        super("1~100의 값을 입력하지 않았습니다.");
    }
    public MyException(String message){
        super(message);
    }
}
