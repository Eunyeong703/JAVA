package project11;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] sub = {"국어", "영어", "수학" };
		for(int i=0;i<3;i++) {
			try {

				System.out.print(sub[i] + " 점수 입력 : ");
				int score = sc.nextInt();

				// if문을 예외처리 형태로 만들어 본다.
				if(score < 0 || score > 100) {
					throw new SubException(sub[i]);
				}

				System.out.println(sub[i] + " 점수 : " + score);

			} catch(SubException se) {
				System.out.println(se.getMessage());
			} catch(Exception e) {
				System.out.println("숫자만 가능 합니다.");
			}
		}
	}
}