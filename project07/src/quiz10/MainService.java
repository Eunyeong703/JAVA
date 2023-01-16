package quiz10;

import java.util.Scanner;

public class MainService {
	Scanner sc = new Scanner(System.in);
	
	public int scoreNum() {
		System.out.print("저장할 점수 갯수 입력 : ");
		int scoreNum = sc.nextInt();
		return scoreNum;
	}
	
	public int menu() {
		System.out.println("1. 점수 입력");
		System.out.println("2. 점수 출력");
		System.out.println("3. 점수 수정");
		System.out.println("4. 점수 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		
		int menu = sc.nextInt();
		return menu;
	}
	
	public Score input() {
		Score s = new Score();
		System.out.print("이름 입력 : ");
		s.setName(sc.next());
		System.out.print("나이 입력 : ");
		s.setAge(sc.nextInt());
		System.out.print("이메일 입력 : ");
		s.setEmail(sc.next());
		System.out.print("국어 점수 입력 : ");
		s.setKor(sc.nextInt());
		System.out.print("영어 점수 입력 : ");
		s.setEng(sc.nextInt());
		System.out.print("수학 점수 입력 : ");
		s.setMath(sc.nextInt());
		s.setSum();
		s.setAvg();
		return s;
	}
	
	public void output(int idx, Score[] score) {
		for(int i=0;i<idx;i++) {
			System.out.println("### " + score[i].getName() + " ###");
			System.out.println("나이 : " + score[i].getAge());
			System.out.println("이메일 : " + score[i].getEmail());
			System.out.println("총점 : " + score[i].getSum());
			System.out.println("평균 : " + score[i].getAvg());
		}
	}
	
	public Score[] mod(int idx, Score[] score) {
		System.out.print("수정할 이름 입력 : ");
		String modName = sc.next();
		
		for(int i=0;i<idx;i++) {
			if(modName.equals(score[i].getName())) {
				while(true) {
					System.out.println("1. 나이 수정");
					System.out.println("2. 이메일 수정");
					System.out.println("3. 국어 점수 수정");
					System.out.println("4. 영어 점수 수정");
					System.out.println("5. 수학 점수 수정");
					System.out.println("0. 메뉴로 돌아가기");
					System.out.print("선택 : ");
					int modMenu = sc.nextInt();
					
					switch(modMenu) {
					case 1:
						System.out.print("나이 입력 : ");
						score[i].setAge(sc.nextInt());
						break;
					case 2:
						System.out.print("이메일 입력 : ");
						score[i].setEmail(sc.next());
						break;
					case 3:
						System.out.print("국어 점수 입력 : ");
						score[i].setKor(sc.nextInt());
						break;
					case 4:
						System.out.print("영어 점수 입력 : ");
						score[i].setEng(sc.nextInt());
						break;
					case 5:
						System.out.print("수학 점수 입력 : ");
						score[i].setMath(sc.nextInt());
						break;
					case 0:
						System.out.println("메인메뉴로 돌아갑니다.");
						score[i].setSum();
						score[i].setAvg();
						return score;
					default:
						System.out.println("선택된 메뉴가 없습니다.");
					}
				}
			}							
		}
		System.out.println("찾으시는 이름이 없습니다.");
		return score;
	}
	
	public Score[] del(int idx, Score[] score, int i, String delName) {
		System.out.println(delName + " 님의 정보를 삭제합니다.");
		for(int j=i;j<idx;j++) {
			score[j] = score[j+1];
		}
		return score;
	}
}