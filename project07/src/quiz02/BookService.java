package quiz02;

import java.util.Scanner;

public class BookService {
	Scanner sc = new Scanner(System.in);

	public int bookListNum() {
		System.out.print("저장할 책 목록의 수 입력 : ");
		int bookNum = sc.nextInt();
		return bookNum;
	}
	
	public int menu() {
		System.out.println("1. 책 정보 입력");
		System.out.println("2. 책 정보 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public Book input() {
		Book b = new Book();
		sc.nextLine();
		System.out.print("책 이름 입력 : ");
		b.setTitle(sc.nextLine());
		System.out.print("저자 입력 : ");
		b.setWriter(sc.next());
		System.out.print("가격 입력 : ");
		b.setPrice(sc.nextInt());
		return b;
	}
	
	public void output(Book[] bookList, int idx) {
		for(int i=0;i<idx;i++) {
			System.out.println("### " + bookList[i].getTitle() + " ###");
			System.out.println("저자 : " + bookList[i].getWriter());
			System.out.println("가격 : " + bookList[i].getPrice());
			System.out.println();
		}
	}
}