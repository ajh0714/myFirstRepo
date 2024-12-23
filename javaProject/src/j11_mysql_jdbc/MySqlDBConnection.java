
package j11_mysql_jdbc;

import java.sql.*;

public class MySqlDBConnection {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ce) {
            System.out.println("드라이브 로딩 예외발생 =" + ce.getMessage());
        }

    }
    //멤버변수
    Connection conn=null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    String url ="jdbc:mysql://localhost:3306/studydb";
    String username ="root";
    String password ="tiger1234";


    public MySqlDBConnection(){}
    //DB연결메소드
    public void getConnection(){
        try {
            conn=DriverManager.getConnection(url,username,password);
        }catch (SQLException se){
            System.out.println("mysql DB연결 예외 발생->"+se.getMessage());
        }

    }
    //DB닫기메소드
    public void setMysqlClose(){
        try {
            if(rs != null) rs.close();
            if(pstmt != null) pstmt.close();
            if(conn != null) conn.close();
        }catch (Exception e){}
    }
}