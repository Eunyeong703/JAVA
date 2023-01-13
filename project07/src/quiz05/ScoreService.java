package quiz05;

import java.util.Scanner;

public class ScoreService {
	Scanner sc = new Scanner(System.in);
	
	public int scoreNum() {
		System.out.print("입력할 인원 수 입력 : ");
		int scoreNum = sc.nextInt();
		return scoreNum;
	}
	
	public int menu() {
		System.out.println("1. 점수 입력");
		System.out.println("2. 점수 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		
		int menu = sc.nextInt();
		return menu;
	}
	
	public ScoreChild input() {
		ScoreChild s = new ScoreChild();
		System.out.print("이름 입력 : ");
		s.setName(sc.next());
		System.out.print("국어 점수 입력 : ");
		s.setKor(sc.nextInt());
		System.out.print("영어 점수 입력 : ");
		s.setEng(sc.nextInt());
		System.out.print("수학 점수 입력 : ");
		s.setMath(sc.nextInt());
		System.out.print("음악 점수 입력 : ");
		s.setMusic(sc.nextInt());
		s.setSum();
		s.setAvg();
		return s;
	}
	
	public void output(int idx, ScoreChild[] score) {
		for(int i=0;i<idx;i++) {
			System.out.println("### " + score[i].getName() + " ###");
			System.out.println("총점 : " + score[i].getSum());
			System.out.println("평균 : " + score[i].getAvg());
		}
	}
}