package project05.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적 입력 인원수 : ");
		int num = sc.nextInt();
		
		String name[] = new String[num];
		int kor[] = new int[num];
		int eng[] = new int[num];
		int math[] = new int[num];
		int sum[] = new int[num];
		double avg[] = new double[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("###" + (i+1) + "번째 ###");
			System.out.print("\n이름 : ");
			name[i] = sc.next();

			System.out.print("국어 점수 : ");
			kor[i] = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			eng[i] = sc.nextInt();
			
			System.out.print("수학 점수 : ");
			math[i] = sc.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = sum[i] / 3.0;
		}
		
		System.out.println("\n");
			System.out.println("이름\t총점\t평균");
			for(int i=0; i<num ;i++) {
				System.out.printf("%s\t%d\t%.2gf\n", name[i], sum[i], avg[i]);
		}
	}
}
