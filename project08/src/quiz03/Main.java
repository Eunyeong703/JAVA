package quiz03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressMain am = new AddressMain();
		PhoneBookMain pbm = new PhoneBookMain();
		
		Address[] address = new Address[3];
		int addIdx = 0;
		
		PhoneBook[] phoneBook = new PhoneBook[3];
		int phoneIdx = 0;
		while(true) {
			System.out.println("1. 주소프로그램");
			System.out.println("2. 전화번호부");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				addIdx = am.start(address, addIdx);
				break;
			case 2:
				phoneIdx = pbm.start(phoneBook, phoneIdx);
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