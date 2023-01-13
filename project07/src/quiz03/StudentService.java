package quiz03;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	
	public int studentListNum() {
		System.out.print("학생 수 입력 : ");
		int studentNum = sc.nextInt();
		return studentNum;
	}
	
	public int menu() {
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public Student input() { // Student 객체를 넘겨주어야 함
		Student st = new Student();
		System.out.print("학생 이름 : ");
		st.setName(sc.next());
		System.out.print("국어 성적 : ");
		st.setKor(sc.nextInt());
		System.out.print("영어 성적 : ");
		st.setEng(sc.nextInt());
		System.out.print("수학 성적 : ");
		st.setMath(sc.nextInt());
		st.setSum();
		st.setAvg();
		return st;
	}
	
	public void output(Student[] studentList, int idx) {
		for(int i=0; i<idx; i++) {
			System.out.println("### " + studentList[i].getName() + " ###");
			System.out.println("총합 : " + studentList[i].getSum());
			System.out.println("평균 : " + studentList[i].getAvg());
			System.out.println();
		}
	}
}
