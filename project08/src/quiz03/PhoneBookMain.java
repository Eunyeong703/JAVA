package quiz03;

public class PhoneBookMain {
	public int start(PhoneBook[] phoneBook, int idx) {
		PhoneBookService pbs = new PhoneBookService();
		
		while(true) {
			int menu = pbs.menu();
			switch(menu) {
			case 1:
				idx = pbs.input(phoneBook, idx);
				break;
			case 2:
				pbs.output(phoneBook, idx);
				break;
			case 0:
				System.out.println("���� �޴��� �̵��մϴ�.");
				return idx;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}
}