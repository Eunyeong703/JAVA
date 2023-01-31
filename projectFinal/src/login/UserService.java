package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserService {
	Scanner sc = new Scanner(System.in);
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	boolean loginCheck;
	String loginId;
	
	public UserService() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String pass = "oracle";
			
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("����Ŭ ���� ����");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����Ŭ ���� ����");
		}
	}

	public int menu() {
		// TODO Auto-generated method stub
		if(loginCheck) {
			System.out.println(loginId + "�� ȯ���մϴ�.");
		}
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		if(loginCheck) {
			System.out.println("3. ȸ������");
			System.out.println("4. ȸ������");
			System.out.println("5. ȸ���˻�");
			System.out.println("6. �α׾ƿ�");
		}
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		int menu = sc.nextInt();
		
		if(loginCheck == false){
			if(menu >= 3 && menu <= 6) {
				menu = 100;
			}
		}
		return menu;
	}

	public void joinMember() throws SQLException {
		// TODO Auto-generated method stub
		User u = new User();
		int result = 0;
		do {
			System.out.print("���̵� �Է� : ");
			u.setId(sc.next());
			
			String sql = "select count(*) from test_user where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, u.getId());
			
			rs = pstmt.executeQuery();
			
			rs.next();
			result = rs.getInt(1);
			
			if(result >= 1) {
				System.out.println("�ߺ��� ���̵� �����մϴ�. �ٽ� �Է��ϼ���\n");
			}
		} while(result != 0);
		System.out.print("��ȣ �Է� : ");
		u.setPwd(sc.next());
		System.out.print("�̸� �Է� : ");
		u.setName(sc.next());
		System.out.print("�̸��� �Է� : ");
		u.setEmail(sc.next());
		
		String sql = "insert into test_user values(?,?,?,?,sysdate)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, u.getId());
		pstmt.setString(2, u.getPwd());
		pstmt.setString(3, u.getName());
		pstmt.setString(4, u.getEmail());
		
		result = pstmt.executeUpdate();
		
		if(result >= 1) {
			System.out.println("ȸ�����Կ� �����߽��ϴ�.");
		} else {
			System.out.println("ȸ�����Կ� �����߽��ϴ�.");
		}
	}

	public void login() throws SQLException {
		// TODO Auto-generated method stub
		System.out.print("�α��� ���̵� : ");
		String id = sc.next();
		System.out.print("�α��� ��ȣ : ");
		String pwd = sc.next();
		
		String sql = "select count(*) from test_user where id=? and pwd=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		
		rs = pstmt.executeQuery();
		
		rs.next();
		int result = rs.getInt(1);
		
		if(result == 1) {
			System.out.println("�α��� ����");
			loginCheck = true;
			loginId = id;
		} else {
			System.out.println("�α��� ����");
		}
	}

	public void modMember() throws SQLException {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1. ��ȣ ����");
			System.out.println("2. �̸� ����");
			System.out.println("3. �̸��� ����");
			System.out.println("0. �޴��� ���ư���");
			System.out.print("���� : ");
			int menu = sc.nextInt();
			int result = 0;
			String sql = null;
			switch(menu) {
			case 1:
				System.out.print("������ ��ȣ : ");
				String pwd = sc.next();
				
				sql = "update test_user set pwd=? where id=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, pwd);
				pstmt.setString(2, loginId);
				
				result = pstmt.executeUpdate();
				break;
			case 2:
				System.out.print("������ �̸� : ");
				String name = sc.next();
				
				sql = "update test_user set name=? where id=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, loginId);
				
				result = pstmt.executeUpdate();
				break;
			case 3:
				System.out.print("������ �̸��� : ");
				String email = sc.next();
				
				sql = "update test_user set email=? where id=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, email);
				pstmt.setString(2, loginId);
				
				result = pstmt.executeUpdate();
				break;
			case 0:
				System.out.println("�޴��� ���ư��ϴ�.");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
			
			if(result >= 1) {
				System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
			} else {
				System.out.println("���� �ϴµ� ������ �߻��߽��ϴ�.");
			}
			System.out.println();
		}
	}

	public void delMember() throws SQLException {
		// TODO Auto-generated method stub
		System.out.print("������ ���̵� �Է� : ");
		String id = sc.next();
		
		String sql = "delete from test_user where id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		
		int result = pstmt.executeUpdate();
		
		if(result >= 1) {
			System.out.println(id + "���� ������ �����߽��ϴ�.");
			loginCheck = false;
			loginId = null;
		} else {
			System.out.println(id + "���� ������ ã�� �� �����ϴ�.");
		}
	}

	public void selectMember() throws SQLException {
		// TODO Auto-generated method stub
		System.out.print("�˻��� ���̵� �Է� : ");
		String id = sc.next();
		
		String sql = "select * from test_user where id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			System.out.println("���̵� : " + rs.getString(1));
			System.out.println("��ȣ : " + rs.getString(2));
			System.out.println("�̸� : " + rs.getString(3));
			System.out.println("�̸��� : " + rs.getString(4));
			System.out.println("�������� : " + rs.getString(5));
		} else {
			System.out.println("ã���ô� ���̵� �����ϴ�.");
		}
	}

	public void logout() {
		// TODO Auto-generated method stub
		System.out.println(loginId + "���� �α׾ƿ��ϼ̽��ϴ�.");
		loginCheck = false;
		loginId = null;
	}
}

