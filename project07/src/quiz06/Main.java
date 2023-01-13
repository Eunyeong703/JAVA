package quiz06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("저장할 교수인원 입력 : ");
		int proNum = sc.nextInt();
		System.out.print("저장할 학생인원 입력 : ");
		int stuNum = sc.nextInt();
		
		Professor pro[] = new Professor[proNum];
		Student[] stu = new Student[stuNum];
		
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
				Professor p = new Professor();
				System.out.println("### 교수 입력 ###");
				System.out.print("학과 입력 : ");
				p.setDept(sc.next());;
				System.out.print("교수명 입력 : ");
				p.setName(sc.next());
				
				pro[proIdx] = p;
				proIdx++;
				break;
			case 2:
				System.out.println("### 교수 출력 ###");
				for(int i=0;i<proIdx;i++) {
					System.out.println("### " + pro[i].getName() + " ###");
					System.out.println("학과 : " + pro[i].getDept());
				}
				break;
			case 3:
				Student s = new Student();
				System.out.println("### 학생 입력 ###");
				System.out.print("학번 입력 : ");
				s.setDeptId(sc.nextInt());
				System.out.print("이름 입력 : ");
				s.setName(sc.next());
				System.out.print("학과 입력 : ");
				s.setDept(sc.next());
				
				stu[stuIdx] = s;
				stuIdx++;
				break;
			case 4:
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