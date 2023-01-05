package ex6_program.score;

import java.util.Scanner;

public class ScoreTeacher {
	public static void main(String[] args) {
		// 입력 객체
		Scanner sc = new Scanner(System.in);
		
		// 데이터 저장 변수
		String name = null; // 이름 저장
		int kor = 0; // 국어 점수 저장
		int eng = 0; // 영어 점수 저장
		int math = 0; // 수학 점수 저장
		int sum = 0; // 총점 저장
		double avg = 0; // 평균 저장
		char grade = ' '; // 학점 저장
		
		while(true) { 
			// 메뉴 보기
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			System.out.println("0. 프로그램 종료");
			
			// 메뉴 선택 입력
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: // 성적 입력
				System.out.println("\n### 성적 입력 ###");
				System.out.print("이름 입력 : ");
				name = sc.next();
				
				// 0~100 점 사이만 입력되도록 구현
				
				do {
				System.out.print("국어 점수 입력 :");
				kor = sc.nextInt();
				} while(kor>100 || kor <0);
				
				do {
				System.out.print("영어 점수 입력 : ");
				eng = sc.nextInt();
				} while(eng>100 || eng <0);
				
				do {
				System.out.print("수학 점수 입력 : ");
				math = sc.nextInt();
				} while(math>100 || math <100);
				
				break;
			case 2: // 성적 출력
				// 성적이 없으면 출력이 되지 않도록 구현
				if(name==null) {
					System.out.println("\n저장된 데이터가 없습니다.");
				} else {
				
				// 총점, 평균, 학점을 한 번만 연산하기 위해서 출력에서 진행함.
				sum = kor + eng + math;
				avg = sum / 3.0;
				
				if(avg < 0 || avg > 100) {
					grade = 'X';
				} else if (avg >= 90) {
					grade = 'A';
				} else if (avg >= 80) {
					grade = 'B';
				} else if (avg >= 70) {
					grade = 'C';
				} else if (avg >= 60) {
					grade = 'D';
				} else {
					grade = 'F';
				}
				
				System.out.println("\n### 성적 출력 ###");
				System.out.println("이름\t총점\t평균\t학점");
				System.out.printf("%s\t%d\t%.2f\t%c\n",name,sum,avg,grade);
				}
				break;
			case 3:
				System.out.println("\n### 성적 수정 ###");
				
				sub:while(true) {
					// 수정하고자 하는 부분만 수정할 수 있도록 구현
					System.out.println("1. 국어 점수 수정");
					System.out.println("2. 영어 점수 수정");
					System.out.println("3. 수학 점수 수정");
					System.out.println("0. 메뉴로 돌아가기");
					System.out.println("메뉴 선택 : ");
					
					// 부분 메뉴 저장 변수
					int subMenu = sc.nextInt(); // 위에 이미 변수로 지정되어 있기 때문에.
					
					switch(subMenu) {
					case 1:
						do {
						System.out.print("수정할 국어 점수 입력 :");
						kor = sc.nextInt();
						} while(kor>100 || kor<0);
						break;
					case 2:
						do {
						System.out.print("수정할 영어 점수 입력 : ");
						eng = sc.nextInt();
						} while(eng>100 || eng<0);
						break;
					case 3:
						do {
						System.out.print("수정할 수학 점수 입력 : ");
						math = sc.nextInt();
						} while(math>100 || math<0);
						break;
					case 0:
						System.out.println("메인 메뉴로 돌아갑니다.");
						break sub; // 레이블 sub를 사용함
					default :
						System.out.println("잘못된 메뉴 선택입니다.");
					}
				}

				break;
			case 4:
				System.out.println("\n### 성적 삭제 ###");
				System.out.println("성적이 삭제되었습니다.");
				name = null;
				kor = eng = math = 0;
				break;
			case 0:
				System.out.println("\n=== 프로그램 종료 ===");
				return;
			default:
				System.out.println("잘못된 메뉴 선택입니다.");	
			}
			System.out.println();
		}
	}
}
