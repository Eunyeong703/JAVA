package method.quiz;

import java.util.Scanner;

public class Quiz02_1 {
	static Scanner sc = new Scanner(System.in);
	static int idx = 0;
	static int[] score;
	
	public static int spaceInput() {
		System.out.print("저장할 성적 갯수 입력 : ");
		int scoreNum = sc.nextInt();
		return scoreNum;
	}
	
	public static int menu() {
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public static void spaceFull() {
		System.out.println("더 이상 저장할 공간이 없습니다.");
	}
	
	public static void scoreInput() {
		System.out.print((idx+1) + "번째 점수 입력 :");
		score[idx] = sc.nextInt();
	}
	
	public static void noneScore() {
		System.out.println("입력된 성적이 없습니다.");
	}
	
	public static void outputScore() {
		for(int i=0;i<idx;i++) {
			System.out.println((i+1)+ "번째 성적 : " + score[i]);
		}
	}
	
	public static void modScore() {
		System.out.println("1 ~ " + idx + " 위치값 중 선택");
		System.out.print("수정할 위치값 입력 : ");
		int modSpace = sc.nextInt();
		
		if(modSpace > idx || modSpace < 1) {
			System.out.println("선택된 위치값은 수정할 수 없습니다.");
		} else {
			System.out.print("수정할 성적 입력 : ");
			score[modSpace-1] = sc.nextInt();
		}
	}
	
	public static void delScore() {
		System.out.println("1 ~ " + idx + " 위치값 중 선택");
		System.out.print("삭제할 위치값 입력 : ");
		int delSpace = sc.nextInt();
		
		if(delSpace > idx || delSpace < 1) {
			System.out.println("선택된 위치값은 삭제할 수 없습니다.");
		} else {
			idx--;
			for(int i=delSpace-1;i<idx;i++) {
				score[i] = score[i+1];
			}
			System.out.println("삭제가 완료 되었습니다.");
		}
	}
	
	public static void subTitle(String str) {
		System.out.println("### 성적 " + str + " ###");
	}
	
	public static void main(String[] args) {
		int scoreNum = spaceInput();
		score = new int[scoreNum];
		
		while(true) {
			int menu = menu();
			
			switch(menu) {
			case 1:
				// 성적 입력 
				subTitle("입력");
				if(idx == scoreNum) {
					spaceFull();
				} else {
					scoreInput();
					idx++;
				}
				break;
			case 2:
				// 성적 출력
				subTitle("출력");
				if(idx == 0) {
					noneScore();
				} else {
					outputScore();
				}
				break;
			case 3:
				// 성적 수정
				subTitle("수정");
				if(idx == 0) {
					noneScore();
				} else {
					modScore();
				}
				break;
			case 4:
				// 성적 삭제
				subTitle("삭제");
				if(idx == 0) {
					noneScore();
				} else {
					delScore();
				}
				break;
			case 0:
				// 반복문 종료 - while을 종료 되지만 return 으로 main 메서드를 종료
				System.out.println("프로그램 종료");
				return;
			default:
				// 위의 1,2,3,4,0 번 숫자 이외에 모든 값을 처리
				System.out.println("선택된 메뉴가 없습니다.");
			}
			
			System.out.println();
		}
	}
}
