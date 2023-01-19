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
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ����");
			System.out.println("5. ��ü ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴����� : ");
			menu = sc.nextInt();
		}catch(Exception e) {
			System.out.println("���ڸ� �Է� �ϼ���.");
			sc = new Scanner(System.in);
		}
		return menu;
	}
	
	public int scoreInput(String sub) {
		int score = -1;
		do {
			try {
				System.out.print(sub + " ���� �Է� : ");
				score = sc.nextInt();
			} catch(Exception e) {
				System.out.println("���ڸ� �Է� ���� �մϴ�.");
				sc = new Scanner(System.in);
			}
		} while(score < 0 || score > 100);
		return score;
	}
	@Override
	public void input(Map<String, Score> scoreList) {
		// TODO Auto-generated method stub
		Score s = new Score();
		System.out.print("�̸� �Է� : ");
		s.setName(sc.next());
		s.setKor(scoreInput("����"));
		s.setEng(scoreInput("����"));
		s.setMath(scoreInput("����"));
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
			System.out.println("���� : " + s.getSum());
			System.out.println("��� : " + s.getAvg());
		}
		
//		Set<String> key = scoreList.keySet();
		
//		for(String k : key) {
//			Score s = scoreList.get(k);
//			System.out.println("### " + k + " ###");
//			System.out.println("���� : " + s.getSum());
//			System.out.println("��� : " + s.getAvg());
//		}
//		
//		Set<Map.Entry<String, Score>> entitySet = scoreList.entrySet();
//		for(Map.Entry<String, Score> entity : entitySet) {
//			Score s = entity.getValue();
//			System.out.println("### " + entity.getKey() + " ###");
//			System.out.println("���� : " + s.getSum());
//			System.out.println("��� : " + s.getAvg());
//		}
	}

	@Override
	public void modify(Map<String, Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		
		Score s = scoreList.get(name);
		
		if(s == null) {
			System.out.println("ã���ô� �̸��� �����ϴ�.");
		} else {
			s.setKor(scoreInput("����"));
			s.setEng(scoreInput("����"));
			s.setMath(scoreInput("����"));
			s.setSum();
			s.setAvg();
		}
	}

	@Override
	public void delete(Map<String, Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		
		Score s = scoreList.remove(name);
		
		if(s == null) {
			System.out.println("ã���ô� �̸��� �����ϴ�.");
		} else {
			System.out.println(name + " ���� ������ �����մϴ�.");
		}
	}

	@Override
	public void clear(Map<String, Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.println("��ü �����͸� �����մϴ�.");
		scoreList.clear();
	}
}