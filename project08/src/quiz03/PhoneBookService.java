package quiz03;

import java.util.Scanner;

public class PhoneBookService {
	Scanner sc = new Scanner(System.in);
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. ��ȭ��ȣ ���");
		System.out.println("2. ��ȭ��ȣ ���");
		System.out.println("0. ���θ޴���");
		System.out.print("���� : ");
		return sc.nextInt();
	}
	public int input(PhoneBook[] phoneBook, int idx) {
		// TODO Auto-generated method stub
		if(idx == 3) {
			System.out.println("�� �̻� ������ �� �����ϴ�.");
		} else {
			phoneBook[idx] = new PhoneBook();
			System.out.print("�̸� �Է� : ");
			phoneBook[idx].setName(sc.next());
			System.out.print("��ȭ��ȣ �Է� : ");
			phoneBook[idx].setPhoneNum(sc.next());
			idx++;
		}
		return idx;
	}
	public void output(PhoneBook[] phoneBook, int idx) {
		// TODO Auto-generated method stub
		if(idx == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		} else {
			for(int i=0;i<idx;i++) {
				System.out.println("�̸� : " + phoneBook[i].getName());
				System.out.println("��ȭ��ȣ : " + phoneBook[i].getPhoneNum());
			}
		}
	}

}