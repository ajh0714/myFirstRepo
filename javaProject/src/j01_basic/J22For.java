package j01_basic;

public class J22For {
    public static void main(String[] args) {
        //중첩 for문
        //반복문내의 반복문처리하기

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                //System.out.printf("i=%d, j=%d\n",i,j);
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("-----------------------------------");

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("$ ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");

        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j-- ){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");

        for(int i=1; i<=5; i++){
            //공백출력 i=1->4 i=2->3 i=3
            for(int s=1; s<=5-i; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");

        for(int i=1; i<=5; i++){
            for(int s=1; s<=i-1; s++){
                System.out.print("  ");
            }
            for(int j=5; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        for(int i=1; i<=9; i+=2){
            //공백출력
            for(int s=1; s<=(9-i)/2; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("-----------------------------------");
        for(int i=5; i>=1; i--){
            for(int s=1; s<=5-i;s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
 */
