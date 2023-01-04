package operator_quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		System.out.println("성인 여부 : " + (num >= 20));
		
	}

}
