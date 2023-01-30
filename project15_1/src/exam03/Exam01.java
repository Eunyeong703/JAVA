package exam03;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam01 {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("��� ����");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String pwd = "oracle";
			
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("���� ����");
		}catch(Exception e) {
			System.out.println("����");
		}
		
//		String sql = "insert into student values('"
//				+s.getName()+"',"
//				+s.getKor()+","
//				+s.getEng()+","
//				+s.getMath()+","
//				+s.getSum()+","
//				+s.getAvg()+")";

		String sql = "insert into student values(?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "���缮");
		pstmt.setInt(2, 100);
		pstmt.setInt(3, 100);
		pstmt.setInt(4, 100);
		pstmt.setInt(5, 300);
		pstmt.setDouble(6, 100);
		
		int result = pstmt.executeUpdate();
	}
}