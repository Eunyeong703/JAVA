package login;

import java.sql.SQLException;

public class UserMain {
	public static void main(String[] args) throws SQLException {
		UserService us = new UserService();
		
		while(true) {
			int menu = us.menu();
			
			switch(menu) {
			case 1:
				System.out.println("#### ȸ�� ���� ####");
				us.joinMember();
				break;
			case 2:
				System.out.println("#### �α��� ####");
				us.login();
				break;
			case 3:
				System.out.println("#### ȸ�� ���� ####");
				us.modMember();
				break;
			case 4:
				System.out.println("#### ȸ�� ���� ####");
				us.delMember();
				break;
			case 5:
				System.out.println("#### ȸ�� �˻� ####");
				us.selectMember();
				break;
			case 6:
				System.out.println("#### �α׾ƿ� ####");
				us.logout();
				break;
			case 0:
				System.out.println("#### ���α׷� ���� ####");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
			System.out.println();
		}
	}
}