package ex2_linked.quiz01;

import java.util.List;
import java.util.Scanner;

public class ScoreService {
	Scanner sc = new Scanner(System.in);

	public int menu() {
		System.out.println("1. �������");
		System.out.println("2. �������");
		System.out.println("3. ��������");
		System.out.println("4. ��������");
		System.out.println("5. ��ü����");
		System.out.println("0. ���α׷� ����");
		System.out.print("�޴����� : ");
		return sc.nextInt();
	}

	public int scoreInput(String sub) {
		System.out.print(sub + " ���� �Է� : ");
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
		System.out.print("�̸� �Է� : ");
		s.setName(sc.next());
		s.setKor(scoreInput("����"));
		s.setEng(scoreInput("����"));
		s.setMath(scoreInput("����"));
		s.setSum();
		s.setAvg();
		s.setRank(1);
		scoreList.add(s);

		// ! : ���� - true �� false��, false�� true�� ó��
		if(scoreList.size() != 1) {
			rank(scoreList);
		}

	}

	public void output(List<Score> scoreList) {
		// TODO Auto-generated method stub
		if(scoreList.size() == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		} else {
			for(Score s : scoreList) {
				System.out.println("### " + s.getName() + " ###");
				System.out.println("���� : " + s.getSum());
				System.out.println("��� : " + s.getAvg());
				System.out.println("���� : " + s.getRank());
			}
		}
	}

	public void modify(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();

		for(Score s : scoreList) {
			if(s.getName().equals(name)) {
				s.setKor(scoreInput("����"));
				s.setEng(scoreInput("����"));
				s.setMath(scoreInput("����"));
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
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();

		for(Score s : scoreList) {
			if(s.getName().equals(name)) {
				scoreList.remove(s);
				System.out.println(name + " ���� ������ �����մϴ�.");
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
		System.out.println("��ü���� �Ϸ� �߽��ϴ�.");
		scoreList.clear();
	}
}

