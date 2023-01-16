package quiz03;

import java.util.Scanner;

public class PhoneBookService {
	Scanner sc = new Scanner(System.in);
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 전화번호 등록");
		System.out.println("2. 전화번호 출력");
		System.out.println("0. 메인메뉴로");
		System.out.print("선택 : ");
		return sc.nextInt();
	}
	public int input(PhoneBook[] phoneBook, int idx) {
		// TODO Auto-generated method stub
		if(idx == 3) {
			System.out.println("더 이상 저장할 수 없습니다.");
		} else {
			phoneBook[idx] = new PhoneBook();
			System.out.print("이름 입력 : ");
			phoneBook[idx].setName(sc.next());
			System.out.print("전화번호 입력 : ");
			phoneBook[idx].setPhoneNum(sc.next());
			idx++;
		}
		return idx;
	}
	public void output(PhoneBook[] phoneBook, int idx) {
		// TODO Auto-generated method stub
		if(idx == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			for(int i=0;i<idx;i++) {
				System.out.println("이름 : " + phoneBook[i].getName());
				System.out.println("전화번호 : " + phoneBook[i].getPhoneNum());
			}
		}
	}

}