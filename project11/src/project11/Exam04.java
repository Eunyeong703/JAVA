package project11;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
			System.out.println("1. �Է�");
			System.out.println("2. ���");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("�Է� ����Դϴ�.");
				try {
					// try ~ catch�� �ȿ� try ~ catch���� ����� �� �ִ�.
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case 2:
				System.out.println("��� ����Դϴ�.");
				break;
			case 3:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
				}
			} catch(Exception e) {
				//System.out.println("���ڸ� �Է� �����մϴ�."); // ����
				e.printStackTrace(); // ������ ����׿�
				sc = new Scanner(System.in); // ���� �ݺ��� ���ϱ� ���ؼ� �ݵ�� �����
			}
		}
	}
}
