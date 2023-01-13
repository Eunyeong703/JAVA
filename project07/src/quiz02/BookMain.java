package quiz02;

public class BookMain {
	public static void main(String[] args) {
		// 기능을 사용하기 위해서 BookService 객체 생성
		BookService bs = new BookService();
		
		int bookNum = bs.bookListNum();		
		Book bookList[] = new Book[bookNum];
		int idx = 0;
		
		while(true) {
			int menu = bs.menu();
			
			switch(menu) {
			case 1:
				// 1. 배열 생성 - Book 클래스의 위치를 저장하는 배열 생성
				// 2. 각 인덱스를 초기화 - Book 클래스의 저장하는 위치는 각 인덱스에 저장
				bookList[idx] = bs.input();
				idx++;
				break;
			case 2:
				bs.output(bookList, idx);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
			System.out.println();
		}
	}
}