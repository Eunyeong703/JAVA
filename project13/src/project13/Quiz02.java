package project13;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// �Է��� �ϱ� ���� ��ü
		Scanner sc = new Scanner(System.in);
		// �������� �����ϱ� ���� ��ü 
		Random rand = new Random();
		
		// ���� Ŭ���� ��ü 
		Quiz02Service qs = new Quiz02Service();
		
		// ����, ����, �� �������� �����ϴ� ����
		int com;
		// ����ڰ� �Է��� ����, ����, ���� �����ϴ� ����
		int user;
		// ��, ��, �и� �����ϴ� ���� 
		int win = 0, draw = 0, lose = 0;
		// ���� ���� �����ϴ� ����
		int cnt = 1;
		// ����ۿ��θ� �����ϴ� ����
		String select;
		
		while(true) {
			user = qs.menu(win, draw, lose, cnt);
			
			// ��ǻ�Ͱ� ������ ������(1 ~ 3) ����
			com = rand.nextInt(3) + 1;
			
			switch(user) {
			case 1: // ����ڰ� ���� ����
				switch(com) {
				case 1:  // ��ǻ�Ͱ� ���� ����
					draw += qs.win(2);
					break;
				case 2: // ��ǻ�Ͱ� ���� ����
					lose += qs.win(3);
					break;
				case 3: // ��ǻ�Ͱ� �� ����
					win += qs.win(1);
					break;
				}
				break;
			case 2: // ����ڰ� ���� ����
				switch(com) {
				case 1:  // ��ǻ�Ͱ� ���� ����
					win += qs.win(1);
					break;
				case 2: // ��ǻ�Ͱ� ���� ����
					draw += qs.win(2);
					break;
				case 3: // ��ǻ�Ͱ� �� ����
					lose += qs.win(3);
					break;
				}
				break;
			case 3: // ����ڰ� �� ����
				switch(com) {
				case 1:  // ��ǻ�Ͱ� ���� ����
					lose += qs.win(3);
					break;
				case 2: // ��ǻ�Ͱ� ���� ����
					win += qs.win(1);
					break;
				case 3: // ��ǻ�Ͱ� �� ����
					draw += qs.win(2);
					break;
				}
				break;
			default:
				System.out.println("�߸� ���õǾ����ϴ�.");
			}
			
			if(win == 5) {
				System.out.println("##### ���� ����߽��ϴ� #####");
				
				if(qs.restart()) {
					win = draw = lose = 0;
					cnt = 1;
				} else {
					return;
				}
			} else if (lose == 5) {
				System.out.println("##### ���� �й��߽��ϴ� #####");
				if(qs.restart()) {
					win = draw = lose = 0;
					cnt = 1;
				} else {
					return;
				}
			}
			System.out.println();
		}
		
	}
}


