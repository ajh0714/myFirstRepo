package j11_mysql_jdbc;

import java.nio.DoubleBuffer;
import java.util.Scanner;

public class EmpUpdate extends MySqlDBConnection{
    Scanner scan = new Scanner(System.in);
    public EmpUpdate(){}
    public void empUpdateStart(){
        //사원명을 입력받아 입력받은 사원의 담당업무 또는 급여수정하는 프로그램을 작성한다.
        try{
            System.out.print("수정할 사원명=");
            String ename = scan.nextLine();
            System.out.print("수정할 항목(필드)을[1.담당업무, 2.급여]입력=");
            String field = scan.nextLine();

            String data=null;
            if(field.equals("1")){ //담당업무를수정
                System.out.print("수정할 담당업무를 입력=");
                data = scan.nextLine();
            }else { //급여수정
                System.out.print("수정할 급여를 입력=");
                data = scan.nextLine();
            }
            String sql = "update emp set ";
            if(field.equals("1"))sql += "job";
            else sql += "sal";
            sql += "=? where ename=?";
            System.out.println("sql->"+sql);
            getConnection();
            pstmt = conn.prepareStatement(sql);

            if(field.equals("1"))pstmt.setString(1,data);
            else pstmt.setDouble(1, Double.parseDouble(data));

            pstmt.setString(2,ename);

            int result = pstmt.executeUpdate();
            if(result>0) System.out.println("사원정보가 수정되었습니다.");
            else System.out.println("사원정보를 수정하지 못하였습니다.");
        } catch (Exception e) {
            System.out.println("수정예외 발생..."+e.getMessage());
        }finally {
            setMysqlClose();
        }
    }

//    public static void main(String[] args) {
//        new EmpUpdate().empUpdateStart();
//    }
}
