package exam01;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	public void input() {
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3.0;
	}
	
	public void output() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}
}
