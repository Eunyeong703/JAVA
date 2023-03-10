package project11.quiz;

import java.util.HashMap;
import java.util.Map;

public class ScoreMain {
	public static void main(String[] args) {
		Map<String, Score> scoreList = new HashMap<String, Score>();
		ScoreService ss = new ScoreServiceImpl();
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 1:
				ss.input(scoreList);
				break;
			case 2:
				ss.output(scoreList);
				break;
			case 3:
				ss.modify(scoreList);
				break;
			case 4:
				ss.delete(scoreList);
				break;
			case 5:
				ss.clear(scoreList);
				break;
			case 6:
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