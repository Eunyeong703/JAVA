package project13;

import java.util.Scanner;

public class Quiz02Service {
	Scanner sc = new Scanner(System.in);
	
	public int menu(int win, int draw, int lose, int cnt) {
		System.out.println("####################");
		System.out.println("### ���� ���� �� ���� ###");
		System.out.println("####################");
		System.out.println("�� : " + win);
		System.out.println("�� : " + draw);
		System.out.println("�� : " + lose);
		System.out.println();
		System.out.println("===== " + cnt++ + " ��° ���� =====");
		
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ��");
		System.out.print("���� : ");
		int user = sc.nextInt();
		return user;
	}
	
	public int win(int con) {
		switch(con) {
		case 1:
			System.out.println("����ڰ� �̰���ϴ�.");
			break;
		case 2:
			System.out.println("�����ϴ�.");
			break;
		case 3:
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			break;
		}		
		return 1;
	}
	
	public boolean restart() {
		String select;
		do {
			System.out.print("������ �ٽ� �����Ͻðڽ��ϱ� (y/n) ? ");
			select = sc.next();
		}while(!(select.equals("Y") || select.equals("y") || select.equals("N") || select.equals("n")));
		switch(select) {
		case "Y":
		case "y":
			System.out.println("===== �ٽ� �����մϴ� =====");
			return true;
		case "N":
		case "n":
			System.out.println("##### ���α׷��� �����մϴ�. #####");
		}
		return false;
	}

}