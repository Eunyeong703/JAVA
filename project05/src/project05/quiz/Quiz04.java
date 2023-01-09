package project05.quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호텔 이름 입력 : ");
		String hotelName = sc.next();
		
		// 호텔방의 수를 지정
		System.out.print("호텔 방의 갯수 입력 : ");
		int roomNum = sc.nextInt();
		
		// 호텔방 숫자만큼 boolean 형 배열 만들기
		boolean room[] = new boolean[roomNum];
		
		while(true) {
			System.out.println("#### " + hotelName + " ####");
			System.out.println("1. 입실");
			System.out.println("2. 퇴실");
			System.out.println("3. 객실 정보");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("#### 입실 ####");
				System.out.println("0 ~ " + roomNum + "번 방 중 선택");
				System.out.print("입실하실 방 번호 입력 : ");
				int checkIn = sc.nextInt();
				
				// checkIn - 1을 한 이유는 인덱스 번호가 1이 적기 때문이다.
				if(room[checkIn-1]) { // 입실 되어 있는 방
					System.out.println("입실 되어 있는 방으로 입실이 불가합니다.");
				} else { // 퇴실 되어 있는 방
					System.out.println("입실 처리가 완료되었습니다.");
					// 비어있는 방을 입실된 방으로 처리
					room[checkIn-1]=true;
				}	
				break;
			case 2:
				System.out.println("#### 퇴실 ####");
				System.out.println("1 ~ " + roomNum + "번 방 중 선택");
				System.out.print("퇴실하실 방 번호 입력 : ");
				int checkOut = sc.nextInt();
				
				if(room[checkOut-1]) { // 입실되어 있는 방
					System.out.println("퇴실 처리가 완료되었습니다.");
					room[checkOut-1] = false;
				} else { // 퇴실 처리 되어있는 방
					System.out.println("퇴실 되어 있는 방으로 퇴실이 불가능합니다.");
				}
				
				break;
			case 3:
				System.out.println("#### 객실 정보 ####");
				for(int i=0; i<roomNum; i++) {
					if(room[i]) {
					System.out.println((i+1) + "번 방 상태 : 입실 상태 ");
				} else {
					System.out.println((i+1) + "번 방 상태 : 퇴실 상태 ");
				}
			}
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 선택된 번호입니다.");
			}
		}
	}
}
