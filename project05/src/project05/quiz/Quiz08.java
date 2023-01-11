package project05.quiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score [] = new int[5];
		int rank[] = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("성적 입력 : ");
			score[i] = sc.nextInt();
			rank[i] = 1;
			for(int j=0; j<i ; j++) {
				if(score[j] > score[i]) {
					rank[i]++; // 각 점수를 비교한 뒤 같은 1 rank에서 1, 2등으로 분리
				}
				else if(score[j] < score[i]) {
					rank[j]++;
				}
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println("성적 : " + rank[i] + "등");
		}
	}
}
