package operator_quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int num = sc.nextInt();
		
		String result = ""; 
		
		result = ((num % 2) == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println(result);
	}
}
