package project13;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// �Է��� �ϱ� ���� ��ü
		Scanner sc = new Scanner(System.in);
		// �������� �����ϱ� ���� ��ü
		Random rand = new Random();
		
		// ���� ���� �� �������� �����ϴ� ����
		int com;
		// ����ڰ� �Է��� ����, ����, ���� �����ϴ� ����
		int user;
		// ��, ��, �и� �����ϴ� ����
		int win = 0, draw = 0, lose = 0;
		// ���� ���� �����ϴ� ����
		int cnt = 1;
		
		while(true) {
			System.out.println("###############");
			System.out.println("### ���� ���� �� ###");
			System.out.println("###############");
			System.out.println("�� : " + win);
			System.out.println("�� : " + draw);
			System.out.println("�� : " + lose);
			
			System.out.println("===" + cnt++ + " ��° ���� ");
			
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ��");
			System.out.print("���� : ");
			user = sc.nextInt();
			
			// ��ǻ�Ͱ� ������ ������(1~3) ����
			com = rand.nextInt(3) + 1;
			
			switch(user) {
			case 1: // ����ڰ� ���� ����
				switch(com) {
				case 1:  // ��ǻ�Ͱ� ���� ����
					System.out.println("�����ϴ�.");
					draw++;
					break;
				case 2: // ��ǻ�Ͱ� ���� ����
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					lose++;
				case 3: // ��ǻ�Ͱ� �� ����
					System.out.println("����ڰ� �̰���ϴ�.");
					win++;
					break;
				}
				break;
			case 2: // ����ڰ� ���� ����
				switch(com) {
				case 1:  // ��ǻ�Ͱ� ���� ����
					System.out.println("����ڰ� �̰���ϴ�.");
					win++;
					break;
				case 2: // ��ǻ�Ͱ� ���� ����
					System.out.println("�����ϴ�.");
					draw++;
				case 3: // ��ǻ�Ͱ� �� ����
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					lose++;
					break;
				}
				break;
			case 3: // ����ڰ� �� ����
				switch(com) {
				case 1:  // ��ǻ�Ͱ� ���� ����
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					lose++;
					break;
				case 2: // ��ǻ�Ͱ� ���� ����
					System.out.println("����ڰ� �̰���ϴ�.");
					win++;
				case 3: // ��ǻ�Ͱ� �� ����
					System.out.println("�����ϴ�.");
					draw++;
					break;
				}
				break;
			default:
				System.out.println("�߸� ���õǾ����ϴ�.");
			}
		}
	}
}
