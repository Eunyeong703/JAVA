package project11.quiz;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ScoreServiceImpl implements ScoreService {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		int menu = 6;
		try {
			System.out.println("1. 점수 입력");
			System.out.println("2. 점수 출력");
			System.out.println("3. 점수 수정");
			System.out.println("4. 점수 삭제");
			System.out.println("5. 전체 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴선택 : ");
			menu = sc.nextInt();
		}catch(Exception e) {
			System.out.println("숫자만 입력 하세요.");
			sc = new Scanner(System.in);
		}
		return menu;
	}
	
	public int scoreInput(String sub) {
		int score = -1;
		do {
			try {
				System.out.print(sub + " 점수 입력 : ");
				score = sc.nextInt();
			} catch(Exception e) {
				System.out.println("숫자만 입력 가능 합니다.");
				sc = new Scanner(System.in);
			}
		} while(score < 0 || score > 100);
		return score;
	}
	@Override
	public void input(Map<String, Score> scoreList) {
		// TODO Auto-generated method stub
		Score s = new Score();
		System.out.print("이름 입력 : ");
		s.setName(sc.next());
		s.setKor(scoreInput("국어"));
		s.setEng(scoreInput("영어"));
		s.setMath(scoreInput("수학"));
		s.setSum();
		s.setAvg();
		
		scoreList.put(s.getName(), s);
	}

	@Override
	public void output(Map<String, Score> scoreList) {
		// TODO Auto-generated method stub
		Collection<Score> value = scoreList.values();
		
		for(Score s : value) {
			System.out.println("### " + s.getName() + " ###");
			System.out.println("총점 : " + s.getSum());
			System.out.println("평균 : " + s.getAvg());
		}
		
//		Set<String> key = scoreList.keySet();
		
//		for(String k : key) {
//			Score s = scoreList.get(k);
//			System.out.println("### " + k + " ###");
//			System.out.println("총점 : " + s.getSum());
//			System.out.println("평균 : " + s.getAvg());
//		}
//		
//		Set<Map.Entry<String, Score>> entitySet = scoreList.entrySet();
//		for(Map.Entry<String, Score> entity : entitySet) {
//			Score s = entity.getValue();
//			System.out.println("### " + entity.getKey() + " ###");
//			System.out.println("총점 : " + s.getSum());
//			System.out.println("평균 : " + s.getAvg());
//		}
	}

	@Override
	public void modify(Map<String, Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();
		
		Score s = scoreList.get(name);
		
		if(s == null) {
			System.out.println("찾으시는 이름이 없습니다.");
		} else {
			s.setKor(scoreInput("국어"));
			s.setEng(scoreInput("영어"));
			s.setMath(scoreInput("수학"));
			s.setSum();
			s.setAvg();
		}
	}

	@Override
	public void delete(Map<String, Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.next();
		
		Score s = scoreList.remove(name);
		
		if(s == null) {
			System.out.println("찾으시는 이름이 없습니다.");
		} else {
			System.out.println(name + " 님의 정보를 삭제합니다.");
		}
	}

	@Override
	public void clear(Map<String, Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.println("전체 데이터를 삭제합니다.");
		scoreList.clear();
	}
}