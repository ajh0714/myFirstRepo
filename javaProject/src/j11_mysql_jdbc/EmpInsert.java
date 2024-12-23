package j11_mysql_jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmpInsert extends MySqlDBConnection{
    Scanner scan = new Scanner(System.in);
    public EmpInsert(){}
    public void empInsertStart(){
       try {
           //추가할 사원정보 입력받기
           System.out.print("사원번호=");
           int empno = Integer.parseInt(scan.nextLine());
           System.out.print("사원명=");
           String ename = scan.nextLine();
           System.out.print("담당업무=");
           String job = scan.nextLine();
           System.out.print("입사일[예)2024-10-21]=");
           String hiredate = scan.nextLine();
           System.out.print("급여=");
           double sal = Double.parseDouble(scan.nextLine());
           System.out.print("부서번호[" + getDeptnoAll() + "]");
           int deptno = Integer.parseInt((scan.nextLine()));

           //1.드라이브로딩
           //2.DB연결
           getConnection();
           //3.PreparedStatment생성
           String sql = "insert into emp(empno, ename, job" +
                   ",hiredate,sal,deptno) values(?,?,?,?,?,?)";
           pstmt = conn.prepareStatement(sql);
           //?에 값 셋팅하기
           pstmt.setInt(1, empno);
           pstmt.setString(2, ename);
           pstmt.setString(3, job);
           pstmt.setString(4, hiredate);
           pstmt.setDouble(5, sal);
           pstmt.setInt(6, deptno);

           //4.실행
           // 0:insert실패, 1:insert등록성공
           int result = pstmt.executeUpdate();
           if (result > 0) {
               System.out.println(ename + "사원이 등록되었습니다.");
           } else {
               System.out.println(ename + "사원 등록실패하였습니다");
           }

       }catch (SQLException sqe){

           //5.연결종료
       } catch (Exception e) {
           System.out.println("정보를 잘못입력하였습니다.");
       }finally {
           setMysqlClose();
       }
    }
    // 부서번호 목록을 구하여 String으로 리턴
    public String getDeptnoAll(){
        String deptnoList ="";
        try {
            getConnection();
            String sql = "select deptno from dept order by deptno";
            pstmt = conn.prepareStatement(sql);
           rs = pstmt.executeQuery();
           while (rs.next()){
               deptnoList += rs.getInt(1)+",";
           }
        }catch (Exception e){

        }finally {
            setMysqlClose();
        }
        return deptnoList;
    }
//    public static void main(String[] args) {
//        EmpInsert empInsert = new EmpInsert();
//        empInsert.empInsertStart();
//    }
}
