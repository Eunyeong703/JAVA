package ex3_for.Quiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("별 입력 갯수 : ");
		int star = sc.nextInt();
		
		for(int i=0;i<star;i++) {
			for(int j=i; j<star; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
//		System.out.println("\n");
//		
//		int col = star;
//		for(int i=0;i<star;i++) {
//			for(int j=i; j<star; j++) {
//				System.out.print("☆");
//			}
//			col--;
//			System.out.println();
		}
		
	}

