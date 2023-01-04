package ex2_switch.Quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.입력");
		System.out.println("2.출력");
		System.out.println("3.수정");
		System.out.println("4.삭제");
		
		System.out.print("메뉴를 선택하세요.(숫자 입력)");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("입력 기능을 선택했습니다.");
			break;
		case 2:
			System.out.println("출력 기능을 선택했습니다.");
			break;
		case 3: 
			System.out.println("수정 기능을 선택했습니다.");
			break;
		case 4:
			System.out.println("삭제 기능을 선택했습니다.");
			break;
		default :
			System.out.println("잘못된 기능을 선택했습니다.");
		}
		
	}
}
