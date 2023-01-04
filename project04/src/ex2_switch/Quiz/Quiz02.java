package ex2_switch.Quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요.");
		int num = sc.nextInt();
		
		// switch 값에 의해서 실행되는 실행문을 결정
		switch(num%2) {
		case 0: 
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		}
	}
}
