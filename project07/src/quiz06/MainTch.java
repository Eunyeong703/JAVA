package quiz06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		System.out.print("������ �����ο� �Է� : ");
		int proNum = sc.nextInt();
		System.out.print("������ �л��ο� �Է� : ");
		int stuNum = sc.nextInt();
		
		Professor pro[] = new Professor[proNum];
		Student[] stu = new Student[stuNum];
		
		ProfessorService ps = new ProfessorService();
		StudentService ss = new StudentService();
		
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
				pro[proIdx] = ps.input();
				proIdx++;
				break;
			case 2:
				ps.output(proIdx, pro);
				break;
			case 3:
				stu[stuIdx] = ss.input();
				stuIdx++;
				break;
			case 4:
				ss.output(stuIdx, stu);
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