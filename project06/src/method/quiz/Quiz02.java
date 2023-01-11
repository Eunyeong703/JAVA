package method.quiz;

import java.util.Scanner;

public class Quiz02 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("������ ���� ���� �Է� : ");
		int scoreNum = sc.nextInt();
		
		int[] score = new int[scoreNum];
		
		// ������ ��ġ���� ���� ���� �ʿ�
		int idx = 0;
		// �ݺ��Ǿ�� �� ����
		while(true) {
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				// ���� �Է�
				System.out.println("### ���� �Է� ###");
				// �ε��� ��ȣ�� ������� ��ġ ���� �������� ������ �߻��ϴµ�, �װ� �����ϱ� ���ؼ� if�� ����
				if(idx == scoreNum) {
					System.out.println("�� �̻� ������ ������ �����ϴ�.");
				} else {
				System.out.print((idx +1) + "��° ���� �Է� : ");
				score[idx] = sc.nextInt();
				// �Է� �� ���� ���� ��ġ�� �ε������� ������Ų��.
				idx++;
				}
				break;
			case 2:
				System.out.println("### ���� ��� ###");
				// �Էµ� ������ ���� ��쿡 ����ڰ� ������ �ȳ����� ������ �˼� ���� ������ ������ִ� ���� ����.
				if(idx == 0) {
					System.out.println("�Էµ� ������ �����ϴ�.");
				} else {
				// �ִ�ġ�� idx�� ���� ���� : �Էµ� �� ��ŭ�� ����ϱ� ���ؼ�
				for(int i=0; i<idx; i++) {
					System.out.println((i+1) + "��° ���� : " + score[i]);
					}
				}
				break;
			case 3:
				// ���� ����
				System.out.println("### ���� ���� ###");
				if(idx == 0) {
					System.out.println("�Էµ� ���� �����ϴ�.");
				} else {
					// scoreNum = �ִ� ������ �� �ִ� ����
					// idx = ���� ����� ����
				System.out.println("1 ~ " + idx + " ��ġ�� �� ����");
				System.out.print("������ ��ġ�� �Է� : ");
				int modSpace = sc.nextInt();
				
				// �Է¹��� ��ġ���� ����� ������ ���ų� 1���� ������ ���� ó��
				if(modSpace > idx || modSpace < 1) {
					System.out.println("���õ� ��ġ���� ������ �� �����ϴ�.");
				} else {
				// modSpace -1 ó���� ������ �Է��� 1���� �ޱ� ������ �����.
				System.out.print("������ ���� �Է� : ");
				score[modSpace - 1] = sc.nextInt();
					}
				}
				break;
			case 4:
				// ���� ����
				System.out.println("### ���� ���� ###");
				// ������ �����Ͱ� ������ ������ �ʿ䰡 ���� ������ if�� ���
				if(idx == 0) {
					System.out.println("�Էµ� �����Ͱ� �����ϴ�.");
				} else {
					System.out.println("1 ~ " + idx + " ��ġ�� �� ����");
					System.out.print("������ ��ġ�� �Է� : ");
					int delSpace = sc.nextInt();
					
					if(delSpace > idx || delSpace < 1) {
						System.out.println("���õ� ��ġ���� ������ �� �����ϴ�.");
					} else {
						// idx�� -1ó���� ������ ���� ���� ���� ������ �� �ֱ� �����̴�.
						idx --;
						for(int i=delSpace-1;i<idx;i++) {
							score[i] = score[i+1];
						}
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					}
				}
				break;
			case 0:
				// �ݺ��� ���� - while���� �����ص� ������ return���� main �޼��� ���� ����
				System.out.println("���α׷� ����");
				return;
			default:
				// ���� 1,2,3,4,0�� ���� �̿ܿ� ��� ���� ó��
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}
}
