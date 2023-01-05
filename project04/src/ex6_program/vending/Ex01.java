package ex6_program.vending;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 각 음료의 금액을 가지는 변수.
		// 고정된 값이기 때문에 while문 바깥에 있어야 한다.
		
		int milk = 500;
		int sugar = 400;
		int black = 300;
		int cocoa = 350;
		
		while(true) {
			System.out.println("### 자판기 메뉴 ###");
			System.out.println("1. 밀크 커피");
			System.out.println("2. 설탕 커피");
			System.out.println("3. 블랙 커피");
			System.out.println("4. 코코아\n");
			
			int coin = 0;
			boolean b = false;
			do {
				if(b) {
					System.out.println("잔액 : " + coin);
					System.out.println("선택할 수 있는 메뉴가 없습니다.");
				}
				
				System.out.print("요금 투입 : ");
				coin += sc.nextInt(); // += : 기존 코인에다 입력된 값을 더해주는 것
				b = true;
			} while(coin<300);
			
			while(coin != 0) {
					System.out.println("\n선택할 수 있는 메뉴");
				}	System.out.println("=================");
				if(coin >= 500) {
					System.out.println("1. 밀크 커피");
					System.out.println("2. 설탕 커피");
					System.out.println("3. 블랙 커피");
					System.out.println("4. 코코아 \n");
				} else if(coin >= 400) {
					System.out.println("2. 설탕 커피");
					System.out.println("3. 블랙 커피");
					System.out.println("4. 코코아 \n");
				} else if(coin >= 350) {
					System.out.println("3. 블랙 커피");
					System.out.println("4. 코코아");
				} else if(coin >= 300) {
					System.out.println("3. 블랙 커피");
				}
				System.out.println("5. 환불 \n");
				System.out.println();
				
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {				
			case 1:
				if(coin>=500) {
					System.out.println("밀크 커피가 나왔습니다.");
				} else {
						System.out.println("선택할 수 없는 메뉴입니다.");
					} 
				coin -= milk;
				break;
			case 2:
				if(coin>=400) {
					System.out.println("설탕 커피가 나왔습니다.");
				} else {
						System.out.println("선택할 수 없는 메뉴입니다.");
					}
				coin -= sugar;
				break;
			case 3:
				if(coin>=300) {
					System.out.println("블랙 커피가 나왔습니다.");
				} else {
						System.out.println("선택할 수 없는 메뉴입니다.");
					}
				break;
			case 4:
				if(coin>=350) {
					System.out.println("코코아가 나왔습니다.");
				} else {
						System.out.println("선택할 수 없는 메뉴입니다.");
					}
				break;
			case 5:
				System.out.println(coin + "원을 전액 반환합니다.");
				coin = 0;
			default :
				System.out.println("없는 메뉴입니다.\n");
			}
			System.out.println("잔액 : " + coin + "\n");
			}
		}
	}

