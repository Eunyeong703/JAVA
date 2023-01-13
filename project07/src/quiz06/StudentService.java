package quiz06;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	
	public Student input() {
		Student s = new Student();
		System.out.println("### 학생 입력 ###");
		System.out.print("학번 입력 : ");
		s.setDeptId(sc.nextInt());
		System.out.print("이름 입력 : ");
		s.setName(sc.next());
		System.out.print("학과 입력 : ");
		s.setDept(sc.next());
		return s;
	}
	
	public void output(int stuIdx, Student[] stu) {
		System.out.println("### 학생 출력 ###");
		for(int i=0;i<stuIdx;i++) {
			System.out.println("### " + stu[i].getName() + " ###");
			System.out.println("학번 : " + stu[i].getDeptId());
			System.out.println("학과 : " + stu[i].getDept());
		}
	}
}