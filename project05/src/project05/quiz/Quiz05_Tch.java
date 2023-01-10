package project05.quiz;

import java.util.Scanner;

public class Quiz05_Tch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 주차 가능 댓수 입력 : ");
		int carNum = sc.nextInt();
		
		// 주차 공간 배열
		int parking[] = new int[carNum];
		
		while(true) {
			// 반복되는 메뉴와 메뉴 선택 입력
			System.out.println("1. 입차");
			System.out.println("2. 출차");
			System.out.println("3. 주차 현황");
			System.out.println("0. 프로그램 종료");
			System.out.print(">>> ");
			int menu = sc.nextInt();
			
			// 각 기능 설정
			switch(menu) {
			case 1:
				System.out.println("\n#### 입차 ####");
				System.out.println("1 ~ " + carNum + " 중 선택");
				System.out.print("주차할 자리 번호 입력 : ");
				int carParkNum = sc.nextInt();
				
				if(carParkNum > carNum || carParkNum<1) {
					System.out.println("해당 번호는 자리 번호가 아닙니다.");
				} else if(parking[carParkNum-1] == 0) {
					System.out.print("주차할 차량 번호 입력 : ");
					parking[carParkNum-1] = sc.nextInt();
					System.out.println("주차 완료 되었습니다.");
				} else {
					System.out.println("현재 위치에는 차량이 존재합니다.");
				}
				break;
			case 2:
				System.out.println("\n#### 출차 ####");
				System.out.print("출차할 차량 번호 입력 : ");
				int carOutNum = sc.nextInt();
				
				boolean check = true;
				for(int i=0;i<carNum;i++) {
					if(carOutNum == parking[i]) {
						System.out.println(carOutNum + " 차량을 출차합니다.");
						parking[i] = 0;
						System.out.println("출차 완료 했습니다.");
						check = false;
						break;
					} 
				}
				
				if(check) {
					System.out.println("찾으시는 차량이 존재하지 않습니다.");
				}
				break;
			case 3:
				System.out.println("\n주차 현황");
				for(int i=0;i<parking.length;i++) {
					// parking 안에 0이면 주차가 안되어 있는 상태
					if(parking[i] !=0) {
						System.out.println((i+1) + "번째 자리 : " + parking[i]);
					} else {
						System.out.println((i+1) + "번째 자리 : 주차 가능");
					}
				}
				break;
			case 0:
				System.out.println("\n프로그램 종료");
				return;
			default:
				System.out.println("\n잘못된 메뉴 선택입니다.");
			}
		}
	}
}
