package exam02;

import java.util.Scanner;

import exam01.Student;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ŭ���� �� �Է� : ");
		int classNum = sc.nextInt();
		
		// Student�� ��ġ���� �����ϴ� �迭�� ������ ���̴�
		Student[] stu = new Student[classNum];
		
		int idx = 0;
		while(true) {
			System.out.println("1. �Է�");
			System.out.println("2. ���");
			System.out.println("0. ����");
			System.out.print("���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				// �� �ε����� ��ü�� �������ִ� ������ ��
				stu[idx] = new Student();
				stu[idx].input();
				idx++;
				break;
			case 2:
				for(int i=0; i<idx; i++) {
					stu[i].output();
				}
				break;
			case 0:
			System.out.println("���α׷� ����");
				return;
				
			}
		}
	}
}
