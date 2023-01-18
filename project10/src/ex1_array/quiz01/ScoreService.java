package quiz01;

import java.util.List;
import java.util.Scanner;

public class ScoreService implements ScoreServiceImpl{
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. ���� ���");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� ����");
		System.out.println("4. ���� ����");
		System.out.println("5. ��ü ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		return sc.nextInt();
	}

	@Override
	public void input(List<Score> scoreList) {
		// TODO Auto-generated method stub
		Score s = new Score();
		System.out.print("�̸� �Է� : ");
		s.setName(sc.next());
		System.out.print("���� �Է� : ");
		s.setNum(sc.nextInt());
		
		scoreList.add(s);
	}

	@Override
	public void output(List<Score> scoreList) {
		// TODO Auto-generated method stub
		for (Score s: scoreList) {
			System.out.println("�̸� : " + s.getName());
			System.out.println("���� : " + s.getNum());
		}
	}

	@Override
	public void modify(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		
		for(Score s: scoreList) {
			if(s.getName().equals(name)) {
				System.out.print("������ ���� �Է� : ");
				s.setNum(sc.nextInt());
				break;
			}
		}
	}

	@Override
	public void delete(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		
		for(Score s: scoreList) {
			if(s.getName().equals(name)) {
				System.out.println(name + "���� ������ �����մϴ�.");
				scoreList.remove(s);
				break;
			}
		}
	}

	@Override
	public void clear(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("��ü ������ �Ͻðڽ��ϱ�? (Y/N)");
		String confirm = sc.next();
		
		if(confirm.equals("Y") || confirm.equals("y")) {
			scoreList.clear();
		} else {
			System.out.println("���� ����մϴ�.");
		}
	}
}
