package quiz01;

public class UserMain {
	public static void main(String[] args) {
		User[] user = new User[5];
		UserService us = new UserService();
		
		int idx = 0;
		while(true) {
			int menu = us.menu();
			
			switch(menu) {
			case 1:
				idx = us.input(user, idx);
				break;
			case 2:
				us.output(user, idx);
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