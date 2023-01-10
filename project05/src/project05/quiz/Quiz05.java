package project05.quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주차 가능 차량 수 : ");
		int num = sc.nextInt();
		int carNum = 0;
		
		boolean space[] = new boolean[num];

		while(true) {
		System.out.println("\n#### 에이콘 주차장 ####");
		System.out.println("1. 입차");
		System.out.println("2. 출차");
		System.out.println("3. 주차 정보");
		System.out.println("4. 프로그램 종료");
		
		System.out.print("입력 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("\n#### 입차 ####");
			System.out.println("0 ~ " + num + "번 공간 중 선택");
			System.out.print("입차하실 공간 번호 입력 : ");
			int checkIn = sc.nextInt();
			
			System.out.print("입차하실 차량 번호 입력 : ");
			carNum = sc.nextInt();
			
			if(space[checkIn-1]) {
				System.out.println("이미 입차된 공간입니다.");
			} else {
				System.out.println("입차 처리가 완료되었습니다.");
				space[checkIn-1] = true;
			}
			break;
		case 2:
			System.out.println("\n#### 출차 ####");
			System.out.println("1 ~ " + num + "번 공간 중 선택");
			System.out.print("출차하실 공간 번호 입력 : ");
			int checkOut = sc.nextInt();
			
			System.out.print("출차하실 차량 번호 입력 : ");
			carNum = sc.nextInt();
			
			if(space[checkOut-1]) {
				System.out.println("출차 처리가 완료되었습니다.");
				space[checkOut-1] = false;
			} else {
				System.out.println("출차 처리가 완료된 방으로 출차가 불가능합니다.");
			}
			break;
		case 3:
			System.out.println("\n#### 주차 공간 정보 ####");
			for(int i=0; i<num; i++) {
				if(space[i]) {
					System.out.println((i+1) + "번 주차장 : 입차, 차량 번호 : " + carNum);
				} else {
					System.out.println((i+1) + "번 주차장 : 공터");
				}
			}
			break;
		case 4:
			System.out.println("\n프로그램 종료");
			return;
		default:
			}
		}
	}
}
