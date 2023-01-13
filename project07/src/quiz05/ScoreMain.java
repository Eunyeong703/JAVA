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
					System.out.println("더 이상 저장할 수 없습니다.");
				} else {
					score[idx] = ss.input();
					idx++;
				}
				break;
			case 2:
				ss.output(idx, score);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}
