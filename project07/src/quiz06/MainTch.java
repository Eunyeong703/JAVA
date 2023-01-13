package quiz06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		System.out.print("저장할 교수인원 입력 : ");
		int proNum = sc.nextInt();
		System.out.print("저장할 학생인원 입력 : ");
		int stuNum = sc.nextInt();
		
		Professor pro[] = new Professor[proNum];
		Student[] stu = new Student[stuNum];
		
		ProfessorService ps = new ProfessorService();
		StudentService ss = new StudentService();
		
		int proIdx = 0;
		int stuIdx = 0;
		
		while(true) {
			System.out.println("1. 교수 입력");
			System.out.println("2. 교수 출력");
			System.out.println("3. 학생 입력");
			System.out.println("4. 학생 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
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
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
		
	}
}