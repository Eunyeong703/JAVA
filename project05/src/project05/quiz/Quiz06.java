package project05.quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ο� �Է� : ");
		int inwon = sc.nextInt();
		
		// �̸�, ��ȭ��ȣ ���� ���� �迭
		String name[] = new String[inwon];
		String tel[] = new String[inwon];
		
		// �ε��� ��ȣ�� ������ ����
		int idx = 0;
		
		while(true) {
			// �ݺ��� �޴�
			System.out.println("1. ��ȭ��ȣ �Է�");
			System.out.println("2. ��ȭ��ȣ ���");
			System.out.println("3. ��ȭ��ȣ ����");
			System.out.println("4. ��ȭ��ȣ ����");
			System.out.println("5. ��ü ��ȭ��ȣ");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� ����");
			int menu = sc.nextInt();
			
			// ��� ����
			switch(menu) {
			case 1: // ��ȭ��ȣ �Է�
				if(idx==inwon) {
					System.out.println("�� �̻� ������ ������ �����ϴ�.");
				} else {
				System.out.print("�̸� �Է� : ");
				name[idx] = sc.next();
				System.out.print("��ȭ��ȣ �Է� : ");
				tel[idx] = sc.next();
				idx++;
				}
				break;
			case 2: // ��ȭ��ȣ ���
				System.out.println("#### ��ȭ��ȣ ��� ####");
				System.out.print("����� �̸� �Է� : ");
				String findName = sc.next();
				
				for(int i=0;i<idx;i++) {
					if(findName.equals(name[i])) {
						System.out.println("�̸� : " + findName);
						System.out.println("��ȭ��ȣ : " + tel[i]);
						break;
					}
				}
				break;
			case 3: // ��ȭ��ȣ ����
				System.out.println("#### ��ȭ��ȣ ��� ####");
				System.out.print("������ �̸� �Է� : ");
				String modName = sc.next();
				
				for(int i=0;i<idx;i++) {
					if(modName.equals(name[i])) {
						System.out.print("������ ��ȭ��ȣ �Է� : ");
						tel[i] = sc.next();
						break;
					}
				}
				break;
			case 4: // ��ȭ��ȣ ����
				System.out.println("#### ��ȭ��ȣ ���� ####");
				System.out.print("������ �̸� �Է� : ");
				String delName = sc.next();
				
				for(int i=0;i<idx;i++) {
					if(delName.equals(name[i])) {
						idx--;
						for(int j=i;j<idx;j++) {
							name[j] = name[j+1];
							tel[j] = tel[j+1];
						}
						System.out.println(delName + "���� ������ �����մϴ�.");
						break;
					}
				}
				break;
			case 5: // ��ü ��ȭ��ȣ ���
				System.out.println("#### ��ü ��ȭ��ȣ ####");
				for(int i=0;i<idx;i++) {
					System.out.println("==== " + name[i] + " ====");
					System.out.println("��ȭ��ȣ : " + tel[i]);
				}
				break;
			case 0: // ���α׷� ����
				System.out.println("#### ���α׷� ���� ####");
				return;
			default: // ���� �޴� ���ý�
				System.out.println("�߸��� �޴� �����Դϴ�.");
			}
			System.out.println();
		}
	}
}
