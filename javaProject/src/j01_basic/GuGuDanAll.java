package j01_basic;

public class GuGuDanAll {
    public static void main(String[] args) {
        System.out.println("\t\t\t구구단");
        for(int startDan=1; startDan<=9; startDan+=3){
            for(int dan= startDan; dan<startDan+3; dan++){
                System.out.print("="+dan+"단=\t");
            }
            System.out.println();
            for(int i=2; i<=9; i++){
                for(int j=startDan; j<startDan+3; j++){
                    int result = j*i;
                    System.out.print(j+"*"+i+"="+result+"\t");
                }
                System.out.println();
            }

        }
    }
}
