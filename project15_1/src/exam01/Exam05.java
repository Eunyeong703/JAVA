package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("등록 성공");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String pwd = "oracle";
			
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("연결 성공");
		}catch(Exception e) {
			System.out.println("실패");
		}
		
		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery
				("select count(*) from student where name = '" + name + "'");
		
		// rs.next를 해야 다음값을 가져오기 때문에 반드시 처리
		rs.next();
		
		//방법1
		int count = rs.getInt(1);
		
		if(count == 0) {
			System.out.println("찾는 이름이 없습니다.");
			return;
		}
		
		//방법 2
		//try {
		//	String findName = rs.getString(1);
		//} catch (Exception e) {
		//	// TODO: handle exception
		//	System.out.println("찾는 이름이 없습니다.");
		//	return;
		//}
		
		System.out.print("수정할 국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("수정할 영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수정할 수학 점수 입력 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		String sql = "update student set kor="+kor+", eng="+eng+", math="
				+math+", sum="+sum+", avg="+avg+" where name='"+name+"'";
		int result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("수정하지 못했습니다.");
		}
	}
}