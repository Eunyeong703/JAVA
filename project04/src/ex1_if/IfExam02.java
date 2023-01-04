package ex1_if;

import java.util.Scanner;

public class IfExam02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
	
		// if ~ else문
		// if의 조건이 참이면 if의 중괄호에 해당하는 실행문이 실행
		// if의 조건이 거짓이면 무조건 else문이 실행됨.
		// else문은 조건을 사용할 수 없음 - "그 외"

		if(num%2 == 0) {
			System.out.println("짝수이다.");	
		} else {
			System.out.println("홀수이다.");
		}
	}
}
