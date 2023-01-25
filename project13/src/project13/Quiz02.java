package project13;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 입력을 하기 위한 객체
		Scanner sc = new Scanner(System.in);
		// 랜덤값을 생성하기 위한 객체 
		Random rand = new Random();
		
		// 서비스 클래스 객체 
		Quiz02Service qs = new Quiz02Service();
		
		// 가위, 바위, 보 랜덤값을 저장하는 변수
		int com;
		// 사용자가 입력한 가위, 바위, 보를 저장하는 변수
		int user;
		// 승, 무, 패를 저장하는 변수 
		int win = 0, draw = 0, lose = 0;
		// 게임 순번 저장하는 변수
		int cnt = 1;
		// 재시작여부를 저장하는 변수
		String select;
		
		while(true) {
			user = qs.menu(win, draw, lose, cnt);
			
			// 컴퓨터가 가지는 랜덤값(1 ~ 3) 생성
			com = rand.nextInt(3) + 1;
			
			switch(user) {
			case 1: // 사용자가 가위 선택
				switch(com) {
				case 1:  // 컴퓨터가 가위 선택
					draw += qs.win(2);
					break;
				case 2: // 컴퓨터가 바위 선택
					lose += qs.win(3);
					break;
				case 3: // 컴퓨터가 보 선택
					win += qs.win(1);
					break;
				}
				break;
			case 2: // 사용자가 바위 선택
				switch(com) {
				case 1:  // 컴퓨터가 가위 선택
					win += qs.win(1);
					break;
				case 2: // 컴퓨터가 바위 선택
					draw += qs.win(2);
					break;
				case 3: // 컴퓨터가 보 선택
					lose += qs.win(3);
					break;
				}
				break;
			case 3: // 사용자가 보 선택
				switch(com) {
				case 1:  // 컴퓨터가 가위 선택
					lose += qs.win(3);
					break;
				case 2: // 컴퓨터가 바위 선택
					win += qs.win(1);
					break;
				case 3: // 컴퓨터가 보 선택
					draw += qs.win(2);
					break;
				}
				break;
			default:
				System.out.println("잘못 선택되었습니다.");
			}
			
			if(win == 5) {
				System.out.println("##### 최종 우승했습니다 #####");
				
				if(qs.restart()) {
					win = draw = lose = 0;
					cnt = 1;
				} else {
					return;
				}
			} else if (lose == 5) {
				System.out.println("##### 최종 패배했습니다 #####");
				if(qs.restart()) {
					win = draw = lose = 0;
					cnt = 1;
				} else {
					return;
				}
			}
			System.out.println();
		}
		
	}
}


