package quiz05;

import java.util.Scanner;

public class ScoreService {
	Scanner sc = new Scanner(System.in);
	
	public int scoreNum() {
		System.out.print("�Է��� �ο� �� �Է� : ");
		int scoreNum = sc.nextInt();
		return scoreNum;
	}
	
	public int menu() {
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		
		int menu = sc.nextInt();
		return menu;
	}
	
	public ScoreChild input() {
		ScoreChild s = new ScoreChild();
		System.out.print("�̸� �Է� : ");
		s.setName(sc.next());
		System.out.print("���� ���� �Է� : ");
		s.setKor(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		s.setEng(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		s.setMath(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		s.setMusic(sc.nextInt());
		s.setSum();
		s.setAvg();
		return s;
	}
	
	public void output(int idx, ScoreChild[] score) {
		for(int i=0;i<idx;i++) {
			System.out.println("### " + score[i].getName() + " ###");
			System.out.println("���� : " + score[i].getSum());
			System.out.println("��� : " + score[i].getAvg());
		}
	}
}