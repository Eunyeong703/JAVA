package ex7_review;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요.");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		while(true) {
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		
		System.out.print("\n원하는 연산을 고르세요 .");
		int select = sc.nextInt();
		
		if(select==1) {
			System.out.println("더하기 : " + (num1 + num2));
		} 
		else if(select==2) {
			System.out.println("빼기 : " + (num1 - num2));
		}
		else if(select==3) {
			System.out.println("곱하기 : " + (num1 * num2));
		}
		else if(select==4) {
			System.out.println("나누기 : " + (num1 / (double)num2));
		}
		
		switch(select) {
		case 1:
			System.out.println("더하기 : " + (num1 + num2));
			break;
		case 2:
			System.out.println("빼기 : " + (num1 - num2));
			break;
		case 3:
			System.out.println("곱하기 : " + (num1 * num2));
			break;
		case 4:
			System.out.println("나누기 : " + (num1 / (double)num2));
			break;
		}
		}
	}
}
