package ex3_for.Quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
			System.out.printf(j + " ");
			}
			System.out.println();
		}
	}
}
