package quiz06;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	
	public Student input() {
		Student s = new Student();
		System.out.println("### �л� �Է� ###");
		System.out.print("�й� �Է� : ");
		s.setDeptId(sc.nextInt());
		System.out.print("�̸� �Է� : ");
		s.setName(sc.next());
		System.out.print("�а� �Է� : ");
		s.setDept(sc.next());
		return s;
	}
	
	public void output(int stuIdx, Student[] stu) {
		System.out.println("### �л� ��� ###");
		for(int i=0;i<stuIdx;i++) {
			System.out.println("### " + stu[i].getName() + " ###");
			System.out.println("�й� : " + stu[i].getDeptId());
			System.out.println("�а� : " + stu[i].getDept());
		}
	}
}