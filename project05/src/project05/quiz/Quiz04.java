package project05.quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ȣ�� �̸� �Է� : ");
		String hotelName = sc.next();
		
		// ȣ�ڹ��� ���� ����
		System.out.print("ȣ�� ���� ���� �Է� : ");
		int roomNum = sc.nextInt();
		
		// ȣ�ڹ� ���ڸ�ŭ boolean �� �迭 �����
		boolean room[] = new boolean[roomNum];
		
		while(true) {
			System.out.println("#### " + hotelName + " ####");
			System.out.println("1. �Խ�");
			System.out.println("2. ���");
			System.out.println("3. ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("#### �Խ� ####");
				System.out.println("0 ~ " + roomNum + "�� �� �� ����");
				System.out.print("�Խ��Ͻ� �� ��ȣ �Է� : ");
				int checkIn = sc.nextInt();
				
				// checkIn - 1�� �� ������ �ε��� ��ȣ�� 1�� ���� �����̴�.
				if(room[checkIn-1]) { // �Խ� �Ǿ� �ִ� ��
					System.out.println("�Խ� �Ǿ� �ִ� ������ �Խ��� �Ұ��մϴ�.");
				} else { // ��� �Ǿ� �ִ� ��
					System.out.println("�Խ� ó���� �Ϸ�Ǿ����ϴ�.");
					// ����ִ� ���� �Խǵ� ������ ó��
					room[checkIn-1]=true;
				}	
				break;
			case 2:
				System.out.println("#### ��� ####");
				System.out.println("1 ~ " + roomNum + "�� �� �� ����");
				System.out.print("����Ͻ� �� ��ȣ �Է� : ");
				int checkOut = sc.nextInt();
				
				if(room[checkOut-1]) { // �ԽǵǾ� �ִ� ��
					System.out.println("��� ó���� �Ϸ�Ǿ����ϴ�.");
					room[checkOut-1] = false;
				} else { // ��� ó�� �Ǿ��ִ� ��
					System.out.println("��� �Ǿ� �ִ� ������ ����� �Ұ����մϴ�.");
				}
				
				break;
			case 3:
				System.out.println("#### ���� ���� ####");
				for(int i=0; i<roomNum; i++) {
					if(room[i]) {
					System.out.println((i+1) + "�� �� ���� : �Խ� ���� ");
				} else {
					System.out.println((i+1) + "�� �� ���� : ��� ���� ");
				}
			}
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("�߸� ���õ� ��ȣ�Դϴ�.");
			}
		}
	}
}
