package method.quiz;

import java.util.Scanner;

public class Quiz02_1 {
	static Scanner sc = new Scanner(System.in);
	static int idx = 0;
	static int[] score;
	
	public static int spaceInput() {
		System.out.print("������ ���� ���� �Է� : ");
		int scoreNum = sc.nextInt();
		return scoreNum;
	}
	
	public static int menu() {
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� ����");
		System.out.println("4. ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("�޴� ���� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public static void spaceFull() {
		System.out.println("�� �̻� ������ ������ �����ϴ�.");
	}
	
	public static void scoreInput() {
		System.out.print((idx+1) + "��° ���� �Է� :");
		score[idx] = sc.nextInt();
	}
	
	public static void noneScore() {
		System.out.println("�Էµ� ������ �����ϴ�.");
	}
	
	public static void outputScore() {
		for(int i=0;i<idx;i++) {
			System.out.println((i+1)+ "��° ���� : " + score[i]);
		}
	}
	
	public static void modScore() {
		System.out.println("1 ~ " + idx + " ��ġ�� �� ����");
		System.out.print("������ ��ġ�� �Է� : ");
		int modSpace = sc.nextInt();
		
		if(modSpace > idx || modSpace < 1) {
			System.out.println("���õ� ��ġ���� ������ �� �����ϴ�.");
		} else {
			System.out.print("������ ���� �Է� : ");
			score[modSpace-1] = sc.nextInt();
		}
	}
	
	public static void delScore() {
		System.out.println("1 ~ " + idx + " ��ġ�� �� ����");
		System.out.print("������ ��ġ�� �Է� : ");
		int delSpace = sc.nextInt();
		
		if(delSpace > idx || delSpace < 1) {
			System.out.println("���õ� ��ġ���� ������ �� �����ϴ�.");
		} else {
			idx--;
			for(int i=delSpace-1;i<idx;i++) {
				score[i] = score[i+1];
			}
			System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
		}
	}
	
	public static void subTitle(String str) {
		System.out.println("### ���� " + str + " ###");
	}
	
	public static void main(String[] args) {
		int scoreNum = spaceInput();
		score = new int[scoreNum];
		
		while(true) {
			int menu = menu();
			
			switch(menu) {
			case 1:
				// ���� �Է� 
				subTitle("�Է�");
				if(idx == scoreNum) {
					spaceFull();
				} else {
					scoreInput();
					idx++;
				}
				break;
			case 2:
				// ���� ���
				subTitle("���");
				if(idx == 0) {
					noneScore();
				} else {
					outputScore();
				}
				break;
			case 3:
				// ���� ����
				subTitle("����");
				if(idx == 0) {
					noneScore();
				} else {
					modScore();
				}
				break;
			case 4:
				// ���� ����
				subTitle("����");
				if(idx == 0) {
					noneScore();
				} else {
					delScore();
				}
				break;
			case 0:
				// �ݺ��� ���� - while�� ���� ������ return ���� main �޼��带 ����
				System.out.println("���α׷� ����");
				return;
			default:
				// ���� 1,2,3,4,0 �� ���� �̿ܿ� ��� ���� ó��
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
			
			System.out.println();
		}
	}
}
