package quiz05;

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		ScoreService ss = new ScoreService();
		int scoreNum = ss.scoreNum();
		ScoreChild[] score = new ScoreChild[scoreNum];
		int idx = 0;
		
		while(true) {
			int menu = ss.menu();

			switch(menu) {
			case 1:
				if(idx == scoreNum) {
					System.out.println("�� �̻� ������ �� �����ϴ�.");
				} else {
					score[idx] = ss.input();
					idx++;
				}
				break;
			case 2:
				ss.output(idx, score);
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}
}
