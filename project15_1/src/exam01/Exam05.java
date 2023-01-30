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
			System.out.println("��� ����");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String pwd = "oracle";
			
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("���� ����");
		}catch(Exception e) {
			System.out.println("����");
		}
		
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery
				("select count(*) from student where name = '" + name + "'");
		
		// rs.next�� �ؾ� �������� �������� ������ �ݵ�� ó��
		rs.next();
		
		//���1
		int count = rs.getInt(1);
		
		if(count == 0) {
			System.out.println("ã�� �̸��� �����ϴ�.");
			return;
		}
		
		//��� 2
		//try {
		//	String findName = rs.getString(1);
		//} catch (Exception e) {
		//	// TODO: handle exception
		//	System.out.println("ã�� �̸��� �����ϴ�.");
		//	return;
		//}
		
		System.out.print("������ ���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("������ ���� ���� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("������ ���� ���� �Է� : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		String sql = "update student set kor="+kor+", eng="+eng+", math="
				+math+", sum="+sum+", avg="+avg+" where name='"+name+"'";
		int result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�������� ���߽��ϴ�.");
		}
	}
}