package quiz01;

import java.util.Scanner;

public class GroupMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("�Է��� �׷� �� �Է� : ");
		int groupNum = sc.nextInt();
			
		Group group[] = new Group[groupNum];
		int idx = 0;
			
		while(true) {
			System.out.println("1. �Է�");
			System.out.println("2. ���");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
				
			int menu = sc.nextInt();
				
			switch(menu) {
			case 1:
				if(idx==groupNum) {
					System.out.println("������ ������ �����ϴ�.");
				} else {
				group[idx] = new Group();
				System.out.print("�׷� �̸� �Է� : ");
				group[idx].setgName(sc.next());
				System.out.print("�׷� �ο� �Է� : ");
				group[idx].setMember(sc.nextInt());
				System.out.print("�׷� ��ǥ�� �Է� : ");
				group[idx].setSong(sc.next());
				idx++; 
				}
				break;
			case 2:
				for(int i=0;i<idx;i++) {
					System.out.println("### " + group[i].getgName() + " ###");
					System.out.println("�ο��� : " + group[i].getMember());
					System.out.println("��ǥ�� : " + group[i].getSong());
				}
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}
}
