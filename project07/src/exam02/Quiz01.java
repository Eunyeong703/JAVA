package exam02;

import java.util.Scanner;

import exam01.Student;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("저장할 클래스 수 입력 : ");
		int classNum = sc.nextInt();
		
		// Student의 위치값을 저장하는 배열을 생성한 것이다
		Student[] stu = new Student[classNum];
		
		int idx = 0;
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				// 각 인덱스에 객체를 생성해주는 역할을 함
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
			System.out.println("프로그램 종료");
				return;
				
			}
		}
	}
}
