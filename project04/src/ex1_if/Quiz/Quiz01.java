package ex1_if.Quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
	
		if(num%2 == 0) {
			System.out.println("짝수이다.");
	}
	
		if(num%2 == 1) {
			System.out.println("홀수이다.");
		}
	}
}
