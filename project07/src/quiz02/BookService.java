package quiz02;

import java.util.Scanner;

public class BookService {
	Scanner sc = new Scanner(System.in);

	public int bookListNum() {
		System.out.print("������ å ����� �� �Է� : ");
		int bookNum = sc.nextInt();
		return bookNum;
	}
	
	public int menu() {
		System.out.println("1. å ���� �Է�");
		System.out.println("2. å ���� ���");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public Book input() {
		Book b = new Book();
		sc.nextLine();
		System.out.print("å �̸� �Է� : ");
		b.setTitle(sc.nextLine());
		System.out.print("���� �Է� : ");
		b.setWriter(sc.next());
		System.out.print("���� �Է� : ");
		b.setPrice(sc.nextInt());
		return b;
	}
	
	public void output(Book[] bookList, int idx) {
		for(int i=0;i<idx;i++) {
			System.out.println("### " + bookList[i].getTitle() + " ###");
			System.out.println("���� : " + bookList[i].getWriter());
			System.out.println("���� : " + bookList[i].getPrice());
			System.out.println();
		}
	}
}