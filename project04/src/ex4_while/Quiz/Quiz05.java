package ex4_while.Quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean b = false;
		
		int kor = 0;
		do {
			if(b) {
				System.out.println("점수는 0~100점 사이 입니다.");
			}
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
			b = true;
		} while(kor <=-1 || kor > 100);
	
		int math = 0;
		do {
			System.out.print("수학 점수 : ");
			math = sc.nextInt();
		} while(math <=-1 || math > 100);
		
		int eng = 0;
		do {
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
		} while(eng <=-1 || eng > 100);
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
