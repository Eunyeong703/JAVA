package project13;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 입력을 하기 위한 객체
		Scanner sc = new Scanner(System.in);
		// 랜덤값을 생성하기 위한 객체
		Random rand = new Random();
		
		// 가위 바위 보 램덤값을 저장하는 변수
		int com;
		// 사용자가 입력한 가위, 바위, 보를 저장하는 변수
		int user;
		// 승, 무, 패를 저장하는 변수
		int win = 0, draw = 0, lose = 0;
		// 게임 순번 저장하는 변수
		int cnt = 1;
		
		while(true) {
			System.out.println("###############");
			System.out.println("### 가위 바위 보 ###");
			System.out.println("###############");
			System.out.println("승 : " + win);
			System.out.println("무 : " + draw);
			System.out.println("패 : " + lose);
			
			System.out.println("===" + cnt++ + " 번째 게임 ");
			
			System.out.println("1. 가위");
			System.out.println("2. 바위");
			System.out.println("3. 보");
			System.out.print("선택 : ");
			user = sc.nextInt();
			
			// 컴퓨터가 가지는 랜덤값(1~3) 생성
			com = rand.nextInt(3) + 1;
			
			switch(user) {
			case 1: // 사용자가 가위 선택
				switch(com) {
				case 1:  // 컴퓨터가 가위 선택
					System.out.println("비겼습니다.");
					draw++;
					break;
				case 2: // 컴퓨터가 바위 선택
					System.out.println("컴퓨터가 이겼습니다.");
					lose++;
				case 3: // 컴퓨터가 보 선택
					System.out.println("사용자가 이겼습니다.");
					win++;
					break;
				}
				break;
			case 2: // 사용자가 바위 선택
				switch(com) {
				case 1:  // 컴퓨터가 가위 선택
					System.out.println("사용자가 이겼습니다.");
					win++;
					break;
				case 2: // 컴퓨터가 바위 선택
					System.out.println("비겼습니다.");
					draw++;
				case 3: // 컴퓨터가 보 선택
					System.out.println("컴퓨터가 이겼습니다.");
					lose++;
					break;
				}
				break;
			case 3: // 사용자가 보 선택
				switch(com) {
				case 1:  // 컴퓨터가 가위 선택
					System.out.println("컴퓨터가 이겼습니다.");
					lose++;
					break;
				case 2: // 컴퓨터가 바위 선택
					System.out.println("사용자가 이겼습니다.");
					win++;
				case 3: // 컴퓨터가 보 선택
					System.out.println("비겼습니다.");
					draw++;
					break;
				}
				break;
			default:
				System.out.println("잘못 선택되었습니다.");
			}
		}
	}
}
