package operator;

public class OperatorExam05 {
	public static void main(String[] args) {
		// 논리 연산자
		
		int num1 = 10;
		int num2 = 10;
		int num3 = 5;
		int num4 = 5;
		
		// ﻿AND : 두 개의 조건이 모두 만족할 때만 참
		// true and true = true
		// true and false = false
		// false and true = false
		// false and false = false

		// && : AND 연산자
		
		System.out.println(num1==num2 && num3==num4);
		System.out.println(num1>num2 && num3==num4);
		System.out.println(num1==num2 && num3>num4);
		System.out.println(num1>num2 && num3>num4);
		
		// OR : 두 개의 조건이 모두 거짓일 때만 거짓
		// true or true = true
		// true or false = true
		// false or true = true
		// false or false = false
		
		// || : OR 연산자

		System.out.println(num1==num2 || num3==num4);
		System.out.println(num1>num2 || num3==num4);
		System.out.println(num1==num2 || num3>num4);
		System.out.println(num1>num2 || num3>num4);
	}

}
