package exam04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentService {
	private Scanner sc = new Scanner(System.in);
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	public StudentService() {
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
	}
	
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ��������");
		System.out.println("4. ��������");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		int menu = sc.nextInt();
		return menu;
	}

	public void insert() throws SQLException {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.print("�̸� �Է� : ");
		s.setName(sc.next());
		System.out.print("���� ���� �Է� : ");
		s.setKor(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		s.setEng(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		s.setMath(sc.nextInt());
		s.setSum();
		s.setAvg();
		
		String sql = "insert into student values(?,?,?,?,?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, s.getName());
		pstmt.setInt(2, s.getKor());
		pstmt.setInt(3, s.getEng());
		pstmt.setInt(4, s.getMath());
		pstmt.setInt(5, s.getSum());
		pstmt.setDouble(6, s.getAvg());
		
		int result = pstmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("���� �Է��� �Ϸ� �Ǿ����ϴ�.");
		} else {
			System.out.println("���� �Է��� �����߽��ϴ�.");
		}
	}

	public void select() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from student order by name asc";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String name = rs.getString("name");
			int sum = rs.getInt("sum");
			double avg = rs.getInt("avg");
			
			System.out.println("#### " + name + " ####");
			System.out.println("���� : " + sum + " ��");
			System.out.println("��� : " + avg + " ��");
		}
	}

	public void update() throws SQLException {
		// TODO Auto-generated method stub
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		
		String sql = "select count(*) from student where name = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		rs = pstmt.executeQuery(sql);
		
		rs.next();
		int result = rs.getInt(1);
		
		if(result == 0) {
			System.out.println("ã���ô� �̸��� �����ϴ�.");
			return;
		}
		
		System.out.print("������ ���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("������ ���� ���� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("������ ���� ���� �Է� : ");
		int math = sc.nextInt();
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		sql = "update student set kor=?, eng=?, math=?,sum=?,avg=?,where name = ?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, kor);
		pstmt.setInt(2, eng);
		pstmt.setInt(3, math);
		pstmt.setInt(4, sum);
		pstmt.setDouble(5, avg);
		pstmt.setString(6, name);
		
		result = pstmt.executeUpdate();
		
		if(result >= 1) {
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("������ �����߽��ϴ�.");
		}
	}

	public void delete() throws SQLException {
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		
		String sql = "delete from student where name = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		int result = pstmt.executeUpdate(sql);
		
		if(result>= 1) {
			System.out.println("������ �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �����߽��ϴ�.");
		}
		// TODO Auto-generated method stub
		
	}
}