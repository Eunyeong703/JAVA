package ex1_if.Quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요.");
		int score1 = sc.nextInt();
		System.out.print("영어 점수를 입력하세요.");
		int score2 = sc.nextInt();
		System.out.print("수학 점수를 입력하세요.");
		int score3 = sc.nextInt();
		
		double avg = (score1 + score2 + score3) / 3.0;
		
		if (score1 > 100 || score1 <0) {
			System.out.println("국어 점수가 잘못 입력되었습니다.");
		} else if (score2 > 100 || score2 <0) {
			System.out.println("영어 점수가 잘못 입력되었습니다.");
		} else if (score3 > 100 || score3 <0) {
			System.out.println("수학 점수가 잘못 입력되었습니다.");
		} else if (avg >= 90)
			{System.out.println("A 학점입니다.");
		} else if (avg >= 80) 
			{System.out.println("B 학점입니다.");
		} else if (avg >= 70) 
			{System.out.println("C 학점입니다.");
		} else if (avg >= 60) 
			{System.out.println("D 학점입니다.");
		} else 
			{System.out.println("F 학점입니다.");
	}
}
}