package ex6_program.score;

import java.util.Scanner;

public class ScoreMe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = null;
		int kor = 0;
		int eng = 0;
		int math = 0; 
		
		while(true) {
		System.out.println("\n1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("5. 프로그램 종료\n");

		System.out.print("원하는 메뉴 선택 : ");
		int menu = sc.nextInt();
		
		
		switch(menu) {
		case 1: 
			System.out.print("\n이름 입력 : ");
			name = sc.next();
			System.out.print("국어 점수 입력 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수 입력 : ");
			eng = sc.nextInt();
			System.out.print("수학 점수 입력 : ");
			math = sc.nextInt();
			break;
			
		case 2:
			int sum = kor + eng + math;
			double avg = sum / 3.0 ;
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
			if(avg >= 90) {
				System.out.println("A 학점입니다.\n");
			} else if(avg >= 80) {
				System.out.println("B 학점입니다.\n");
			} else if(avg >= 70) {
				System.out.println("C 학점입니다.\n");
			} else if(avg >= 60) {
				System.out.println("D 학점입니다.\n");
			} else {
				System.out.println("F 학점입니다.\n");
			}
			break;
			
			
		case 3:
			System.out.print("국어 점수 수정 : ");
			int kornum = sc.nextInt();
			kor = kornum ;
			
			System.out.print("영어 점수 수정 : ");
			int engnum = sc.nextInt();
			eng = engnum ;
			
			System.out.print("수학 점수 수정 : ");
			int mathnum = sc.nextInt();
			math = mathnum ;
			break;
			
		
		case 4:
			System.out.print("이름을 초기화 하시겠습니까? 1.예 2.아니오");
			int rename = sc.nextInt();
			if(rename==1) {
				name = null;
			}
			
			System.out.print("국어 점수를 초기화 하시겠습니까? 1.예 2.아니오");
			int rekor = sc.nextInt();
			if(rekor==1) {
				kor = 0;
			}
			System.out.print("영어 점수를 초기화 하시겠습니까? 1.예 2.아니오");
			int reeng = sc.nextInt();
			if(reeng==1) {
				eng = 0;
			}
			
			System.out.print("수학 점수를 초기화 하시겠습니까? 1.예 2.아니오");
			int remath = sc.nextInt();
			if(remath==1) {
				math = 0;
				
			}
			break;
			
			
		case 5:
			System.out.println("프로그램을 종료합니다.");
		return;	
			}
		}
	}
}
