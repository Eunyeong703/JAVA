package quiz06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �����ο� �Է� : ");
		int proNum = sc.nextInt();
		System.out.print("������ �л��ο� �Է� : ");
		int stuNum = sc.nextInt();
		
		Professor pro[] = new Professor[proNum];
		Student[] stu = new Student[stuNum];
		
		int proIdx = 0;
		int stuIdx = 0;
		
		while(true) {
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. �л� �Է�");
			System.out.println("4. �л� ���");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				Professor p = new Professor();
				System.out.println("### ���� �Է� ###");
				System.out.print("�а� �Է� : ");
				p.setDept(sc.next());;
				System.out.print("������ �Է� : ");
				p.setName(sc.next());
				
				pro[proIdx] = p;
				proIdx++;
				break;
			case 2:
				System.out.println("### ���� ��� ###");
				for(int i=0;i<proIdx;i++) {
					System.out.println("### " + pro[i].getName() + " ###");
					System.out.println("�а� : " + pro[i].getDept());
				}
				break;
			case 3:
				Student s = new Student();
				System.out.println("### �л� �Է� ###");
				System.out.print("�й� �Է� : ");
				s.setDeptId(sc.nextInt());
				System.out.print("�̸� �Է� : ");
				s.setName(sc.next());
				System.out.print("�а� �Է� : ");
				s.setDept(sc.next());
				
				stu[stuIdx] = s;
				stuIdx++;
				break;
			case 4:
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