package quiz04;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		UserService us = new UserService();
		int userNum = us.userNum();
		
		User1 u1[] = new User1[userNum];
		User2 u2[] = new User2[userNum];
		
		int idx = 0;
		while(true) {
			int menu = us.menu();
			
			switch(menu) {
			case 1:
				u1[idx] = us.user1Input();
				u2[idx] = us.user2Input();
				idx++;
				break;
			case 2:
				us.output(idx, u1, u2);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}