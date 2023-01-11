package project05.quiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score [] = new int[5];
		int rank[] = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("���� �Է� : ");
			score[i] = sc.nextInt();
			rank[i] = 1;
			for(int j=0; j<i ; j++) {
				if(score[j] > score[i]) {
					rank[i]++; // �� ������ ���� �� ���� 1 rank���� 1, 2������ �и�
				}
				else if(score[j] < score[i]) {
					rank[j]++;
				}
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println("���� : " + rank[i] + "��");
		}
	}
}
