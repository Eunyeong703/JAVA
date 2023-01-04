package ex1_if.Quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " 이 가장 큰수이다");
		}
		
		if(num2>num1 && num2>num3) {
			System.out.println(num2 + " 이 가장 큰수이다");
		}
		
		if(num3>num1 && num3>num2){
			System.out.println(num3 + " 이 가장 큰 수이다");
			
			sc.close();
		}
	}
}
