package project11;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("입력 기능입니다.");
				try {
					// try ~ catch문 안에 try ~ catch문을 사용할 수 있다.
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case 2:
				System.out.println("출력 기능입니다.");
				break;
			case 3:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
				}
			} catch(Exception e) {
				//System.out.println("숫자만 입력 가능합니다."); // 고객용
				e.printStackTrace(); // 개발자 디버그용
				sc = new Scanner(System.in); // 무한 반복을 피하기 위해서 반드시 만들기
			}
		}
	}
}
