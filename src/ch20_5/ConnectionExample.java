package ch20_5;

import java.sql.*;

public class ConnectionExample {
    public static void main(String[] args){

        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/xe",
                    "testuser",
                    "test1234"
            );

            System.out.println("연결 성공");

            stmt = conn.createStatement();
            rs =  stmt.executeQuery("select * from student");

            while (rs.next()){
                System.out.println(rs.getString("name") + "\t" + rs.getString("id"));
            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(conn != null){
                try {
                    conn.close();
                    System.out.println("연결 끊기");
                }catch (SQLException e){}
            }
        }
    }
}
