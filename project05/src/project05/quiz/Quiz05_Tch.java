package project05.quiz;

import java.util.Scanner;

public class Quiz05_Tch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ���� ��� �Է� : ");
		int carNum = sc.nextInt();
		
		// ���� ���� �迭
		int parking[] = new int[carNum];
		
		while(true) {
			// �ݺ��Ǵ� �޴��� �޴� ���� �Է�
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ���� ��Ȳ");
			System.out.println("0. ���α׷� ����");
			System.out.print(">>> ");
			int menu = sc.nextInt();
			
			// �� ��� ����
			switch(menu) {
			case 1:
				System.out.println("\n#### ���� ####");
				System.out.println("1 ~ " + carNum + " �� ����");
				System.out.print("������ �ڸ� ��ȣ �Է� : ");
				int carParkNum = sc.nextInt();
				
				if(carParkNum > carNum || carParkNum<1) {
					System.out.println("�ش� ��ȣ�� �ڸ� ��ȣ�� �ƴմϴ�.");
				} else if(parking[carParkNum-1] == 0) {
					System.out.print("������ ���� ��ȣ �Է� : ");
					parking[carParkNum-1] = sc.nextInt();
					System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
				} else {
					System.out.println("���� ��ġ���� ������ �����մϴ�.");
				}
				break;
			case 2:
				System.out.println("\n#### ���� ####");
				System.out.print("������ ���� ��ȣ �Է� : ");
				int carOutNum = sc.nextInt();
				
				boolean check = true;
				for(int i=0;i<carNum;i++) {
					if(carOutNum == parking[i]) {
						System.out.println(carOutNum + " ������ �����մϴ�.");
						parking[i] = 0;
						System.out.println("���� �Ϸ� �߽��ϴ�.");
						check = false;
						break;
					} 
				}
				
				if(check) {
					System.out.println("ã���ô� ������ �������� �ʽ��ϴ�.");
				}
				break;
			case 3:
				System.out.println("\n���� ��Ȳ");
				for(int i=0;i<parking.length;i++) {
					// parking �ȿ� 0�̸� ������ �ȵǾ� �ִ� ����
					if(parking[i] !=0) {
						System.out.println((i+1) + "��° �ڸ� : " + parking[i]);
					} else {
						System.out.println((i+1) + "��° �ڸ� : ���� ����");
					}
				}
				break;
			case 0:
				System.out.println("\n���α׷� ����");
				return;
			default:
				System.out.println("\n�߸��� �޴� �����Դϴ�.");
			}
		}
	}
}
