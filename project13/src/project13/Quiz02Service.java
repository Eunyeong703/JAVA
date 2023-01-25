package project13;

import java.util.Scanner;

public class Quiz02Service {
	Scanner sc = new Scanner(System.in);
	
	public int menu(int win, int draw, int lose, int cnt) {
		System.out.println("####################");
		System.out.println("### 가위 바위 보 게임 ###");
		System.out.println("####################");
		System.out.println("승 : " + win);
		System.out.println("무 : " + draw);
		System.out.println("패 : " + lose);
		System.out.println();
		System.out.println("===== " + cnt++ + " 번째 게임 =====");
		
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.print("선택 : ");
		int user = sc.nextInt();
		return user;
	}
	
	public int win(int con) {
		switch(con) {
		case 1:
			System.out.println("사용자가 이겼습니다.");
			break;
		case 2:
			System.out.println("비겼습니다.");
			break;
		case 3:
			System.out.println("컴퓨터가 이겼습니다.");
			break;
		}		
		return 1;
	}
	
	public boolean restart() {
		String select;
		do {
			System.out.print("게임을 다시 시작하시겠습니까 (y/n) ? ");
			select = sc.next();
		}while(!(select.equals("Y") || select.equals("y") || select.equals("N") || select.equals("n")));
		switch(select) {
		case "Y":
		case "y":
			System.out.println("===== 다시 시작합니다 =====");
			return true;
		case "N":
		case "n":
			System.out.println("##### 프로그램을 종료합니다. #####");
		}
		return false;
	}

}