package quiz02;

public class BookMain {
	public static void main(String[] args) {
		// ����� ����ϱ� ���ؼ� BookService ��ü ����
		BookService bs = new BookService();
		
		int bookNum = bs.bookListNum();		
		Book bookList[] = new Book[bookNum];
		int idx = 0;
		
		while(true) {
			int menu = bs.menu();
			
			switch(menu) {
			case 1:
				// 1. �迭 ���� - Book Ŭ������ ��ġ�� �����ϴ� �迭 ����
				// 2. �� �ε����� �ʱ�ȭ - Book Ŭ������ �����ϴ� ��ġ�� �� �ε����� ����
				bookList[idx] = bs.input();
				idx++;
				break;
			case 2:
				bs.output(bookList, idx);
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
			System.out.println();
		}
	}
}