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
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}
}	