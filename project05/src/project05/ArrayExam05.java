package project05;

import java.util.Scanner;

public class ArrayExam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적 입력 인원수 : ");
		int num = sc.nextInt();
		
		String name[] = new String[num];
		int score[][] = new int[num][4];
		double avg[] = new double[num];
		String subject[] = {"국어", "영어", "수학", "총점"};
		
		for(int i=0; i<num; i++) {
			System.out.println("###" + (i+1) + "번째 ###");
			System.out.print("\n이름 : ");
			name[i] = sc.next();

			
			for(int j=0;j<3;j++) { // 3인 이유는 총점은 자동 연산되므로.
			System.out.print(subject[j]+" 점수 입력 : ");
			score[i][j] = sc.nextInt(); // j는 국어 영어 수학 총점
			score[i][3] += score[i][j]; // 총점 값
			
			}
			avg[i] = score[i][3] / 3.0;
		}
		
		System.out.println("\n");
			System.out.println("이름\t총점\t평균");
			for(int i=0; i<num ;i++) {
				System.out.printf("%s\t%d\t%.2f\n", name[i], score[i][3], avg[i]);
			
		}
	}
}
