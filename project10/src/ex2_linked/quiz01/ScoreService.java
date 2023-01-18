package ex2_linked.quiz01;

import java.util.List;
import java.util.Scanner;

public class ScoreService {
	Scanner sc = new Scanner(System.in);

	public int menu() {
		System.out.println("1. 점수등록");
		System.out.println("2. 점수출력");
		System.out.println("3. 점수수정");
		System.out.println("4. 점수삭제");
		System.out.println("5. 전체삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴선택 : ");
		return sc.nextInt();
	}

	public int scoreInput(String sub) {
		System.out.print(sub + " 점수 입력 : ");
		return sc.nextInt();
	}

	public void rank(List<Score> scoreList) {
		for(int i=0;i<scoreList.size();i++) {
			scoreList.get(i).setRank(1);
		}
		
		for(int i=0;i<scoreList.size()-1;i++) {
			for (int j=i+1;j<scoreList.size();j++) {
				if(scoreList.get(i).getSum() > scoreList.get(j).getSum()) {
					int rank = scoreList.get(j).getRank();
					scoreList.get(j).setRank(++rank);
				}
				if(scoreList.get(i).getSum() < scoreList.get(j).getSum()) {
					int rank = scoreList.get(i).getRank();
					scoreList.get(i).setRank(++rank);
				}
			}	
		}
	}

	public void input(List<Score> scoreList) {
		// TODO Auto-generated method stub
		Score s = new Score();
		System.out.print("이름 입력 : ");
		s.setName(sc.next());
		s.setKor(scoreInput("국어"));
		s.setEng(scoreInput("영어"));
		s.setMath(scoreInput("수학"));
		s.setSum();
		s.setAvg();
		s.setRank(1);
		scoreList.add(s);

		// ! : 반전 - true 면 false로, false면 true로 처리
		if(scoreList.size() != 1) {
			rank(scoreList);
		}

	}

	public void output(List<Score> scoreList) {
		// TODO Auto-generated method stub
		if(scoreList.size() == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			for(Score s : scoreList) {
				System.out.println("### " + s.getName() + " ###");
				System.out.println("총점 : " + s.getSum());
				System.out.println("평균 : " + s.getAvg());
				System.out.println("순위 : " + s.getRank());
			}
		}
	}

	public void modify(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();

		for(Score s : scoreList) {
			if(s.getName().equals(name)) {
				s.setKor(scoreInput("국어"));
				s.setEng(scoreInput("영어"));
				s.setMath(scoreInput("수학"));
				s.setSum();
				s.setAvg();
				s.setRank(1);
				rank(scoreList);
				break;
			}
		}
	}

	public void delete(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.next();

		for(Score s : scoreList) {
			if(s.getName().equals(name)) {
				scoreList.remove(s);
				System.out.println(name + " 님의 정보를 삭제합니다.");
				s.setKor(0);
				s.setEng(0);
				s.setMath(0);
				s.setSum();
				rank(scoreList);
				break;
			}
		}
	}

	public void clear(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.println("전체삭제 완료 했습니다.");
		scoreList.clear();
	}
}

