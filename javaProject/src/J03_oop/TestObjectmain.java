package J03_oop;

public class TestObjectmain {
    public static void main(String[] args) {
        TestObject to = new TestObject();
        TestObject to5 = new TestObject();//

        //to 객체의 멤버변수 num의 값을 1000으로 변경
        System.out.printf("to.num=%d,to5=%d\n", to.num, to5.num);
        to.num=1000;
        System.out.printf("to.num=%d,to5=%d\n", to.num, to5.num);
        int num = 1234;
        //                 객체명 멤버변수
        int result = num+ to.intData;
        System.out.println("result->"+ result);
        System.out.println("이름->"+to.name);


        TestObject2 to2 = new TestObject2();
        System.out.println("age="+ to2.age);
        System.out.println("num="+to.num);

        TestObject to3 = new TestObject(520);
        System.out.println("to3.num="+to3.num);
        TestObject to4 = new TestObject(343,"이순신");
        System.out.printf("to4.num=%d,to4.name=%s\n",to4.num, to4.name);

        //객체명,메소드명()을 이용하여 메소드 호출
        to4.speedUp();
        System.out.println("to4.num="+to4.num+",to3.num="+to3.num);
        // num = 10843
        int res = to4.speedUp(500);
        System.out.println("to4.num="+ to4.num+",res=" +res);

        while(true){
            int a =12345;

        }
    }
}
