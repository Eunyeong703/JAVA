package quiz10;

import java.util.Scanner;

public class MainService {
	Scanner sc = new Scanner(System.in);
	
	public int scoreNum() {
		System.out.print("������ ���� ���� �Է� : ");
		int scoreNum = sc.nextInt();
		return scoreNum;
	}
	
	public int menu() {
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� ����");
		System.out.println("4. ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		
		int menu = sc.nextInt();
		return menu;
	}
	
	public Score input() {
		Score s = new Score();
		System.out.print("�̸� �Է� : ");
		s.setName(sc.next());
		System.out.print("���� �Է� : ");
		s.setAge(sc.nextInt());
		System.out.print("�̸��� �Է� : ");
		s.setEmail(sc.next());
		System.out.print("���� ���� �Է� : ");
		s.setKor(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		s.setEng(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		s.setMath(sc.nextInt());
		s.setSum();
		s.setAvg();
		return s;
	}
	
	public void output(int idx, Score[] score) {
		for(int i=0;i<idx;i++) {
			System.out.println("### " + score[i].getName() + " ###");
			System.out.println("���� : " + score[i].getAge());
			System.out.println("�̸��� : " + score[i].getEmail());
			System.out.println("���� : " + score[i].getSum());
			System.out.println("��� : " + score[i].getAvg());
		}
	}
	
	public Score[] mod(int idx, Score[] score) {
		System.out.print("������ �̸� �Է� : ");
		String modName = sc.next();
		
		for(int i=0;i<idx;i++) {
			if(modName.equals(score[i].getName())) {
				while(true) {
					System.out.println("1. ���� ����");
					System.out.println("2. �̸��� ����");
					System.out.println("3. ���� ���� ����");
					System.out.println("4. ���� ���� ����");
					System.out.println("5. ���� ���� ����");
					System.out.println("0. �޴��� ���ư���");
					System.out.print("���� : ");
					int modMenu = sc.nextInt();
					
					switch(modMenu) {
					case 1:
						System.out.print("���� �Է� : ");
						score[i].setAge(sc.nextInt());
						break;
					case 2:
						System.out.print("�̸��� �Է� : ");
						score[i].setEmail(sc.next());
						break;
					case 3:
						System.out.print("���� ���� �Է� : ");
						score[i].setKor(sc.nextInt());
						break;
					case 4:
						System.out.print("���� ���� �Է� : ");
						score[i].setEng(sc.nextInt());
						break;
					case 5:
						System.out.print("���� ���� �Է� : ");
						score[i].setMath(sc.nextInt());
						break;
					case 0:
						System.out.println("���θ޴��� ���ư��ϴ�.");
						score[i].setSum();
						score[i].setAvg();
						return score;
					default:
						System.out.println("���õ� �޴��� �����ϴ�.");
					}
				}
			}							
		}
		System.out.println("ã���ô� �̸��� �����ϴ�.");
		return score;
	}
	
	public Score[] del(int idx, Score[] score, int i, String delName) {
		System.out.println(delName + " ���� ������ �����մϴ�.");
		for(int j=i;j<idx;j++) {
			score[j] = score[j+1];
		}
		return score;
	}
}