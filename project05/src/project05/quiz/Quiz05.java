package project05.quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� ���� �� : ");
		int num = sc.nextInt();
		int carNum = 0;
		
		boolean space[] = new boolean[num];

		while(true) {
		System.out.println("\n#### ������ ������ ####");
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ���� ����");
		System.out.println("4. ���α׷� ����");
		
		System.out.print("�Է� : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("\n#### ���� ####");
			System.out.println("0 ~ " + num + "�� ���� �� ����");
			System.out.print("�����Ͻ� ���� ��ȣ �Է� : ");
			int checkIn = sc.nextInt();
			
			System.out.print("�����Ͻ� ���� ��ȣ �Է� : ");
			carNum = sc.nextInt();
			
			if(space[checkIn-1]) {
				System.out.println("�̹� ������ �����Դϴ�.");
			} else {
				System.out.println("���� ó���� �Ϸ�Ǿ����ϴ�.");
				space[checkIn-1] = true;
			}
			break;
		case 2:
			System.out.println("\n#### ���� ####");
			System.out.println("1 ~ " + num + "�� ���� �� ����");
			System.out.print("�����Ͻ� ���� ��ȣ �Է� : ");
			int checkOut = sc.nextInt();
			
			System.out.print("�����Ͻ� ���� ��ȣ �Է� : ");
			carNum = sc.nextInt();
			
			if(space[checkOut-1]) {
				System.out.println("���� ó���� �Ϸ�Ǿ����ϴ�.");
				space[checkOut-1] = false;
			} else {
				System.out.println("���� ó���� �Ϸ�� ������ ������ �Ұ����մϴ�.");
			}
			break;
		case 3:
			System.out.println("\n#### ���� ���� ���� ####");
			for(int i=0; i<num; i++) {
				if(space[i]) {
					System.out.println((i+1) + "�� ������ : ����, ���� ��ȣ : " + carNum);
				} else {
					System.out.println((i+1) + "�� ������ : ����");
				}
			}
			break;
		case 4:
			System.out.println("\n���α׷� ����");
			return;
		default:
			}
		}
	}
}
