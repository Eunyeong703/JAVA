package ex1_if;

import java.util.Scanner;

public class IfExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		
		// if ~ else if ~ else
		// else if는 else와는 달리 조건식을 사용할 수 있음.
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " 이 가장 큰수이다");
		} else if(num2>num3) {
			System.out.println(num2 + " 이 가장 큰수이다");
		} else {
			System.out.println(num3 + " 이 가장 큰 수이다");
		// 결과값은 똑같으나 차이가 있다면 따로 있는 if문을 실행하는 게 아니라 
		// if문 자체가 하나임. 첫번째가 참이면 나머지 else if문을 확인하지 X
			
		}
	}
}

