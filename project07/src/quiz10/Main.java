package quiz10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MainService ms = new MainService();
		
		int scoreNum = ms.scoreNum();
		
		Score[] score = new Score[scoreNum];
		int idx = 0;
		
		while(true) {
			int menu = ms.menu();
			
			sub:switch(menu) {
			case 1:
				System.out.println("===== ���� �Է� =====");
				if(idx == scoreNum) {
					System.out.println("�� �̻� ������ ������ �����ϴ�.");
				} else {
					score[idx] = ms.input();
					idx++;
				}
				break;
			case 2:
				System.out.println("===== ���� ��� =====");
				if(idx == 0) {
					System.out.println("����� �����Ͱ� �����ϴ�.");
				} else {
					ms.output(idx, score);
				}
				break;
			case 3:
				System.out.println("===== ���� ���� =====");
				if(idx == 0) {
					System.out.println("����� �����Ͱ� �����ϴ�.");
				} else {
					score = ms.mod(idx, score);
				}
				break;
			case 4:
				System.out.println("===== ���� ���� =====");
				if(idx == 0) {
					System.out.println("����� �����Ͱ� �����ϴ�.");
				} else {
					System.out.print("������ �̸� �Է� : ");
					String delName = sc.next();
					
					for(int i=0;i<idx;i++) {
						if(delName.equals(score[i].getName())) {
							idx--;
							score = ms.del(idx, score, i, delName);
							break sub;
						}
					}
				}
				System.out.println("ã���ô� �̸��� �����ϴ�.");
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
			System.out.println();
		}
	}
}