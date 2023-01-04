package ex1_if.Quiz;

import java.util.Scanner;

public class Quiz06 {
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
		
		// 큰수 찾기
		if (num1>num2 && num1>num3) {
			max = num1;
		} else if (num2>num1 && num2>num3) {
			max = num2;
		} else if (num3>num1 && num3>num2) {
			max = num3;
		}
		
		// 작은수 찾기
		if (num1<num2 && num1<num3) {
			min = num1;
		} else if (num2<num1 && num2<num3) {
			min = num2;
		} else if (num3<num1 && num3<num2) {
			min = num3;
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}

		
//		
//		
//		if (num1>num2 && num1>num3 && num2>num3)
//		{System.out.print("최대값 : " + num1 + " 최솟값 : " + num3);}
//		else if (num1>num2 && num1>num3 && num3>num2)
//		{System.out.print("최대값 : " + num1 + " 최솟값 : " + num2);}
//		
//		else if (num2>num1 && num2>num3 && num1>num3)
//		{System.out.print("최대값 : " + num2 + " 최솟값 : " + num3);}
//		else if (num2>num1 && num2>num3 && num3>num1)
//		{System.out.print("최대값 : " + num2 + " 최솟값 : " + num1);}
//		
//		else if (num3>num1 && num3>num2 && num2>num1)
//		{System.out.print("최대값 : " + num3 + " 최솟값 : " + num1);}
//		else if (num3>num1 && num3>num2 && num1>num2)
//		{System.out.print("최대값 : " + num3 + " 최솟값 : " + num2);}
//		
//	}
//}
