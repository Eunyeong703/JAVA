package operator_quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 A를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 B를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("정수 C를 입력하세요 : ");
		int num3 = sc.nextInt();
		

		int max = num1 > num2 ? (num1>num3 ? num1 : num3) 
				: (num2>num3 ? num2 : num3); 
		
		System.out.println("가장 큰 값 : " + max);
	}

}
