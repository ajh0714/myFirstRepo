package j11_mysql_jdbc;

import java.util.Scanner;

public class EmpDelete extends MySqlDBConnection{
    Scanner scan = new Scanner(System.in);
    public EmpDelete(){}
    public void empDeleteStart(){
        //사원명을 입력받아
        //해당사원의 정보를 삭제한다.
        try{
            System.out.print("삭제할 사원명=");
            String ename = scan.nextLine();

            getConnection();

            String sql = "delete from emp where ename=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,ename);

            int result = pstmt.executeUpdate();
            if(result>0){
                System.out.println(ename+"의 사원정보가 삭제되었습니다.");
            }else{
                System.out.println(ename+"의 사원정보를 삭제실패하였습니다.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            setMysqlClose();
        }
    }

//    public static void main(String[] args) {
//        EmpDelete empDelete = new EmpDelete();
//        empDelete.empDeleteStart();
//    }
}
