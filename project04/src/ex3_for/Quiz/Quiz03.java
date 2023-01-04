package ex3_for.Quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		main : for(;;) {
		
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
		
		System.out.print("0~4까지의 번호 중 하나를 선택하세요.");
		int menu = sc.nextInt();
			
//		if(menu==1) {
//			System.out.println("입력 기능 실행\n");
//		} else if(menu==2) {
//			System.out.println("출력 기능 실행\n");
//		} else if(menu==3) {
//			System.out.println("수정 기능 실행\n");
//		} else if(menu==4) {
//			System.out.println("삭제 기능 실행\n");
//		} else if(menu==0) {
//			System.out.println("종료 기능 실행\n");
//			break;
//		} else {
//			System.out.println("잘못 입력된 기능입니다.");
//		}
//		}
		
		switch(menu) {
		case 1:
			System.out.println("입력 기능 실행\n");
			break;
		case 2:
			System.out.println("출력 기능 실행\n");
			break;
		case 3:
			System.out.println("수정 기능 실행\n");
			break;
		case 4:
			System.out.println("삭제 기능 실행\n");
			break;
		case 0:
			System.out.println("종료 기능 실행\n");
			break main;
			//return은 해당 메서드를 종료한다.
			//return;
		default:
			System.out.println("잘못 입력된 기능입니다.");
		}
}
}
}