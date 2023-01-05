package ex6_program.vending;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 각 음료의 금액을 가지는 변수.
		// 고정된 값이기 때문에 while문 바깥에 있어야 한다.
		
		int milk = 500;
		int sugar = 400;
		int black = 300;
		int cocoa = 350;
		
		// 각 음료의 수량을 저장하는 변수
		int milknum = 3;
		int sugarnum = 3;
		int blacknum = 3;
		int cocoanum = 3;
		
		while(true) {
			System.out.println("### 자판기 메뉴 ###");
			System.out.println("1. 밀크 커피");
			System.out.println("2. 설탕 커피");
			System.out.println("3. 블랙 커피");
			System.out.println("4. 코코아\n");
			
			int coin = 0;
			boolean b = false;
			insert : do { // insert라는 레이블을 만듦
				if(b) {
					System.out.println("잔액 : " + coin);
					System.out.println("선택할 수 있는 메뉴가 없습니다. \n");
					
					System.out.println("1. 환불");
					System.out.println("2. 추가 요금 투입");
					System.out.print("선택 : ");
					
					int menu = sc.nextInt();
					
					switch (menu) {
					case 1:
						System.out.println(coin + "원을 환불합니다.");
						coin = 0;
						break insert;  // insert 레이블 사용
					case 2:
						break;
					default:
						System.out.println("없는 메뉴 입니다.");
					}
				}
				
				System.out.print("요금 투입 : ");
				coin += sc.nextInt(); // += : 기존 코인에다 입력된 값을 더해주는 것
				b = true;
			} while(coin < 300);
			
			System.out.println();
			
			while(coin != 0) {
					System.out.println("선택할 수 있는 메뉴");
					System.out.println("=================");
				if(coin >= 500 && milknum > 0) {
					System.out.println("1. 밀크 커피");
				}
				else if(milknum==0) {
					System.out.println("밀크 커피는 품절입니다.");
				}	
				if(coin >= 400 && sugarnum > 0) {
					System.out.println("2. 설탕 커피");
				}
				else if(sugarnum==0) {
					System.out.println("설탕 커피는 품절입니다.");
				}
				if(coin >= 300 && blacknum > 0) {
					System.out.println("3. 블랙 커피");
				}
				else if(blacknum ==0) {
					System.out.println("블랙 커피는 품절입니다.");
				}
				if(coin >= 350 && cocoanum > 0) {
					System.out.println("4. 코코아");
				}
				else if(cocoanum==0) {
					System.out.println("코코아는 품절입니다.");
				}
				System.out.println("5. 환불");
				System.out.println("6. 추가 요금 투입");
				System.out.println();
				
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {				
			case 1:
				if(coin>=500 && milknum > 0) {
					System.out.println("밀크 커피가 나왔습니다.");
					coin -= milk;
					milknum --;
				} else if(milknum == 0) {
						System.out.println("선택할 수 없는 메뉴입니다.");
					} 
				break;
			case 2:
				if(coin>=400 && sugarnum > 0) {
					System.out.println("설탕 커피가 나왔습니다.");
					coin -= sugar;
					sugarnum --;
				} else if(sugarnum == 0) {
						System.out.println("선택할 수 없는 메뉴입니다.");
					}
				break;
			case 3:
				if(coin>=300 && blacknum > 0) {
					System.out.println("블랙 커피가 나왔습니다.");
					coin -= black;
					blacknum --;
				} else if(blacknum == 0) {
						System.out.println("선택할 수 없는 메뉴입니다.");
					}
				break;
			case 4:
				if(coin>=350 && cocoanum > 0) {
					System.out.println("코코아가 나왔습니다.");
					coin -= cocoa;
					cocoanum --;
				} else if(cocoanum == 0) {
						System.out.println("선택할 수 없는 메뉴입니다.");
					}
				break;
			case 5:
				System.out.println(coin + "원을 전액 반환합니다.");
				coin = 0;
				break;
			case 6:
				System.out.print("추가 요금 투입 : ");
				coin += sc.nextInt();
				break;
			default :
				System.out.println("없는 메뉴입니다.\n");
			}
			System.out.println("잔액 : " + coin + "\n");
			}
		}
	}
}
