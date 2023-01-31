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
			System.out.println("오라클 연결 성공");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오라클 연결 실패");
		}
	}

	public int menu() {
		// TODO Auto-generated method stub
		if(loginCheck) {
			System.out.println(loginId + "님 환영합니다.");
		}
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		if(loginCheck) {
			System.out.println("3. 회원수정");
			System.out.println("4. 회원삭제");
			System.out.println("5. 회원검색");
			System.out.println("6. 로그아웃");
		}
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
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
			System.out.print("아이디 입력 : ");
			u.setId(sc.next());
			
			String sql = "select count(*) from test_user where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, u.getId());
			
			rs = pstmt.executeQuery();
			
			rs.next();
			result = rs.getInt(1);
			
			if(result >= 1) {
				System.out.println("중복된 아이디가 존재합니다. 다시 입력하세요\n");
			}
		} while(result != 0);
		System.out.print("암호 입력 : ");
		u.setPwd(sc.next());
		System.out.print("이름 입력 : ");
		u.setName(sc.next());
		System.out.print("이메일 입력 : ");
		u.setEmail(sc.next());
		
		String sql = "insert into test_user values(?,?,?,?,sysdate)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, u.getId());
		pstmt.setString(2, u.getPwd());
		pstmt.setString(3, u.getName());
		pstmt.setString(4, u.getEmail());
		
		result = pstmt.executeUpdate();
		
		if(result >= 1) {
			System.out.println("회원가입에 성공했습니다.");
		} else {
			System.out.println("회원가입에 실패했습니다.");
		}
	}

	public void login() throws SQLException {
		// TODO Auto-generated method stub
		System.out.print("로그인 아이디 : ");
		String id = sc.next();
		System.out.print("로그인 암호 : ");
		String pwd = sc.next();
		
		String sql = "select count(*) from test_user where id=? and pwd=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		
		rs = pstmt.executeQuery();
		
		rs.next();
		int result = rs.getInt(1);
		
		if(result == 1) {
			System.out.println("로그인 성공");
			loginCheck = true;
			loginId = id;
		} else {
			System.out.println("로그인 실패");
		}
	}

	public void modMember() throws SQLException {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1. 암호 변경");
			System.out.println("2. 이름 변경");
			System.out.println("3. 이메일 변경");
			System.out.println("0. 메뉴로 돌아가기");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			int result = 0;
			String sql = null;
			switch(menu) {
			case 1:
				System.out.print("변경할 암호 : ");
				String pwd = sc.next();
				
				sql = "update test_user set pwd=? where id=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, pwd);
				pstmt.setString(2, loginId);
				
				result = pstmt.executeUpdate();
				break;
			case 2:
				System.out.print("변경할 이름 : ");
				String name = sc.next();
				
				sql = "update test_user set name=? where id=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, loginId);
				
				result = pstmt.executeUpdate();
				break;
			case 3:
				System.out.print("변경할 이메일 : ");
				String email = sc.next();
				
				sql = "update test_user set email=? where id=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, email);
				pstmt.setString(2, loginId);
				
				result = pstmt.executeUpdate();
				break;
			case 0:
				System.out.println("메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
			
			if(result >= 1) {
				System.out.println("수정이 완료 되었습니다.");
			} else {
				System.out.println("수정 하는데 문제가 발생했습니다.");
			}
			System.out.println();
		}
	}

	public void delMember() throws SQLException {
		// TODO Auto-generated method stub
		System.out.print("삭제할 아이디 입력 : ");
		String id = sc.next();
		
		String sql = "delete from test_user where id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		
		int result = pstmt.executeUpdate();
		
		if(result >= 1) {
			System.out.println(id + "님의 정보를 삭제했습니다.");
			loginCheck = false;
			loginId = null;
		} else {
			System.out.println(id + "님의 정보를 찾을 수 없습니다.");
		}
	}

	public void selectMember() throws SQLException {
		// TODO Auto-generated method stub
		System.out.print("검색할 아이디 입력 : ");
		String id = sc.next();
		
		String sql = "select * from test_user where id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			System.out.println("아이디 : " + rs.getString(1));
			System.out.println("암호 : " + rs.getString(2));
			System.out.println("이름 : " + rs.getString(3));
			System.out.println("이메일 : " + rs.getString(4));
			System.out.println("가입일자 : " + rs.getString(5));
		} else {
			System.out.println("찾으시는 아이디가 없습니다.");
		}
	}

	public void logout() {
		// TODO Auto-generated method stub
		System.out.println(loginId + "님이 로그아웃하셨습니다.");
		loginCheck = false;
		loginId = null;
	}
}

