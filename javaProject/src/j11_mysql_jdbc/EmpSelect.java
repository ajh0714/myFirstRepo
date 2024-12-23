package j11_mysql_jdbc;

import java.sql.*;

public class EmpSelect {
    public EmpSelect() {
    }

    public void emplist() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //localhost DBserver의 emp에 있는 사원목록 선택
        // localhost, 127.0.01, port:3306, 계정:root, 비번:tiger1234
        try {
            //1.jdbc driver를 로딩(jvm에 등록)
            //경로와 클래스명의 문자열로 대입하면 jvm등록해준다.
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. DB연결(DriverManager)    ip:port/db명
            String url = "jdbc:mysql://localhost:3306/studydb";
            String username = "root";
            String password = "tiger1234";
            conn = DriverManager.getConnection(url, username, password);

            //3. preparedstatement객체
            //   쿼리문을 이용하여 생성
            String sql = "select empno,ename,job,hiredate,sal,comm,deptno " +
                    "from emp where deptno in(20,30) order by ename asc";
            pstmt = conn.prepareStatement(sql);

            //4.쿼리문 실행
            rs = pstmt.executeQuery();
            while (rs.next()) {//레코드가 있으면
                //rs.getInt("empno");    //사원번호
                int empno = rs.getInt(1);
                String ename = rs.getString(2);
                String job = rs.getString(3);
                String hiredate = rs.getString(4);
                double sal = rs.getDouble(5);
                double comm = rs.getDouble(6);
                int deptno = rs.getInt(7);

                System.out.printf("%8d %10s %13s %20s %6.2f %6.2f %5d\n", empno, ename, job, hiredate, sal, comm, deptno);
            }
        } catch (ClassNotFoundException cnfe) {
            System.out.println("드라이브로딩 예외발생...");
            cnfe.printStackTrace();
        } catch (SQLException se) {
            System.out.println("DB연결예외 발생...");
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {}

            }
        }
//        public static void main (String[]args){
//        EmpSelect select = new EmpSelect();
//        select.emplist();
//        }
    }

