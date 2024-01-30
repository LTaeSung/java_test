package ch20.oracle_11;

import java.sql.*;

public class TranjectionExample {
    public static void main(String[] args){

        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/xe",
                    "testuser",
                    "test1234"
            );

            conn.setAutoCommit(false);

            String sql1 = "UPDATE account SET balance=balance-? WHERE ano=?";
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setInt(1, 10000);
            pstmt1.setString(2, "111-111-1111");
            int row1 = pstmt1.executeUpdate();
            if(row1 ==1) throw new Exception("출금 x");
            pstmt1.close();

            String sql2 = "UPDATE account SET balance=balance+? WHERE ano=?";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setInt(2, 10000);
            pstmt2.setString(2, "222-222-2222");
            int row2 = pstmt2.executeUpdate();
            if(row2 == 0) throw new Exception("입금 x");
            pstmt2.close();

            conn.commit();
            System.out.println("계좌 이체 성공");

        }catch (Exception e){
            try {
                conn.rollback();
            }catch (SQLException e1){

            }
            System.out.println("계좌 이체 실패");
            e.printStackTrace();
        }finally {
            if(conn != null){
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                }catch (SQLException e){}
            }
        }
    }
}
