package ex1_if;

import java.util.Scanner;

public class IfExam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하시오.");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하시오.");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수를 입력하시오.");
		int num3 = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		// 중첩 if : if문 안에 if문이 포함되어 있는 제어문
		if (num1>num2 && num1>num3) {
			max= num1;
			if (num2<num3) {
				min=num2;
			} else {
				min=num3; }
		} else if (num2>num1 && num2>num3) {
			max = num2; 
			if (num1<num3) {
				min=num1; }
		 else {
				min=num3; }
			} else if (num3>num1 && num3>num2) {
			max = num3; 
			if (num1<num2) {
				min=num1;
		} else {
				min=num2;
		}
			
			
			
			if(num1>num2) { 
				if(num1>num3) {
					max = num1;
				} else { // num3이 num1보다 크다
					max = num3;
					min = num2;
				}
				
			} else if (num2 > num3) {
				// num2가 무조건 num3보다 크다
				max = num2;
				if (num1 > num3) {
					min = num3;
			}	else {
				min = num1;
			}
			}	else 
				max = num3;
				min = num1; 
			
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	}
	}

