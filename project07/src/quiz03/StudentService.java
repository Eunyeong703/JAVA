package quiz03;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	
	public int studentListNum() {
		System.out.print("�л� �� �Է� : ");
		int studentNum = sc.nextInt();
		return studentNum;
	}
	
	public int menu() {
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public Student input() { // Student ��ü�� �Ѱ��־�� ��
		Student st = new Student();
		System.out.print("�л� �̸� : ");
		st.setName(sc.next());
		System.out.print("���� ���� : ");
		st.setKor(sc.nextInt());
		System.out.print("���� ���� : ");
		st.setEng(sc.nextInt());
		System.out.print("���� ���� : ");
		st.setMath(sc.nextInt());
		st.setSum();
		st.setAvg();
		return st;
	}
	
	public void output(Student[] studentList, int idx) {
		for(int i=0; i<idx; i++) {
			System.out.println("### " + studentList[i].getName() + " ###");
			System.out.println("���� : " + studentList[i].getSum());
			System.out.println("��� : " + studentList[i].getAvg());
			System.out.println();
		}
	}
}
