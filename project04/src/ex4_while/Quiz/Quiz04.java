package ex4_while.Quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("하나의 정수를 입력하세요. : ");
		int num = sc.nextInt();
		// 자릿수를 카운트 할 변수
		int cnt = 0;
		// 총합 계산할 변수
		int sum = 0;
		
		while(num!=0) {
			// sum = sum + (num%10);
			sum += num%10;
			// num = num / 10;
			num /= 10;
			// 자릿수 카운트
			cnt++;
		}
		System.out.println("자릿수 : " + cnt);
		System.out.println("총합 : " + sum);
		}
	}
}
