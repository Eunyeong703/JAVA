package ex3_for.Quiz;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			String name = null;
			int age = 0;
			String tel = null;
		
		for (;;) {		
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 프로그램 종료");
		
			System.out.print("선택 : ");
			int menu = sc.nextInt();
	
		switch(menu) {
		case 1:
			System.out.println("\n### 입력 ###");
			System.out.print("이름 입력 : ");
			name = sc.next();
			System.out.print("나이 입력 : ");
			age = sc.nextInt();
			System.out.print("전화번호 입력 : ");
			tel = sc.next();
			break;
		case 2:
			System.out.println("\n### 출력 ###");
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("전화번호 : " + tel);
			break;
		case 0:
			System.out.println("\n=== 프로그램 종료 ===");
			return;
		default:
			System.out.println("잘못된 입력입니다.");
			}
		System.out.println();
		}
	}
}