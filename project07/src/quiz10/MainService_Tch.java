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
	
	public String stringInput(String sub) {
		System.out.print(sub + " 입력 : ");
		return sc.next();
	}
	
	public int intInput(String sub) {
		System.out.print(sub + " 입력 : ");
		return sc.nextInt();
	}
	public Score input() {
		Score s = new Score();
		
		s.setName(stringInput("이름"));
		s.setAge(intInput("나이"));
		s.setEmail(stringInput("이메일"));
		s.setKor(intInput("국어"));
		s.setEng(intInput("영어"));
		s.setMath(intInput("수학"));
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
						score[i].setAge(intInput("나이"));
						break;
					case 2:
						score[i].setEmail(stringInput("이메일"));
						break;
					case 3:
						score[i].setKor(intInput("국어"));
						break;
					case 4:
						score[i].setEng(intInput("영어"));
						break;
					case 5:
						score[i].setMath(intInput("수학"));
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