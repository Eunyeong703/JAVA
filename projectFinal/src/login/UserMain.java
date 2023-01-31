package login;

import java.sql.SQLException;

public class UserMain {
	public static void main(String[] args) throws SQLException {
		UserService us = new UserService();
		
		while(true) {
			int menu = us.menu();
			
			switch(menu) {
			case 1:
				System.out.println("#### 회원 가입 ####");
				us.joinMember();
				break;
			case 2:
				System.out.println("#### 로그인 ####");
				us.login();
				break;
			case 3:
				System.out.println("#### 회원 수정 ####");
				us.modMember();
				break;
			case 4:
				System.out.println("#### 회원 삭제 ####");
				us.delMember();
				break;
			case 5:
				System.out.println("#### 회원 검색 ####");
				us.selectMember();
				break;
			case 6:
				System.out.println("#### 로그아웃 ####");
				us.logout();
				break;
			case 0:
				System.out.println("#### 프로그램 종료 ####");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
			System.out.println();
		}
	}
}