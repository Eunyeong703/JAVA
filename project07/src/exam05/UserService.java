package exam05;

import java.util.Scanner;

public class UserService {
	Scanner sc = new Scanner(System.in);
	
	public int userNum(){
		System.out.print("������ ȸ���� �Է� : ");
		int userNum = sc.nextInt();
		return userNum;
	}
	
	public int menu() {
		System.out.println("1. ȸ�� �Է�");
		System.out.println("2. ȸ�� ���");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public User2 user2Input() {
		User2 u = new User2();
		System.out.print("���̵� �Է� : ");
		u.setId(sc.next());
		System.out.print("��ȣ �Է� : ");
		u.setPwd(sc.next());
		System.out.print("�̸� �Է� : ");
		u.setName(sc.next());
		System.out.print("�̸��� �Է� : ");
		u.setEmail(sc.next());
		return u;
	}
	
	public void output(int idx, User2[] u) {
		for(int i=0;i<idx;i++) {
			System.out.println("### " + u[i].getId() + " ###");
			System.out.println("��ȣ : "  + u[i].getPwd());
			System.out.println("�̸� : "  + u[i].getName());
			System.out.println("�̸��� : " + u[i].getEmail());
		}
	}
}