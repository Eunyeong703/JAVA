package ex6_program;

	import java.util.Scanner;
	public class Kiosk {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int chicken = 4500;
			int shrimp = 4000;
			int bulgogi = 3500;
			int cola = 2000;
			int cider = 2000;
			int coffee = 1500;
			
			int coin = 0;
			
			while(true) {
			
			System.out.println("\n### 메뉴 ###");
			System.out.println("1. 햄버거");
			System.out.println("2. 음료");
			System.out.println("0. 결제");
			
			System.out.print("\n메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println("\n1) 치킨 버거");
				System.out.println("2) 새우 버거");
				System.out.println("3) 불고기 버거");
				System.out.println("4) 메뉴로 돌아가기");
				
				System.out.print("\n버거 선택 : ");
				int burger = sc.nextInt();
				
				if(burger == 1) {
					coin += 4500;
				} else if(burger == 2) {
						coin += 4000;
				} else if(burger == 3) {
						coin += 3500;
				}
				
				break;
				
			case 2:
				System.out.println("\n1) 콜라");
				System.out.println("2) 사이다");
				System.out.println("3) 커피");
				System.out.println("4) 메뉴로 돌아가기");
				
				System.out.print("\n음료 선택 : ");
				int drink = sc.nextInt();
				
				if(drink == 1) {
					coin += 2000;
				} else if(drink == 2) {
						coin += 2000;
				} else if(drink == 3) {
						coin += 1500;
					}
				
				break;
				
			case 0:
				System.out.println("총 금액 : " + coin);
				System.out.println("결제가 완료되었습니다.\n");
				
				break;
			
				default :
				System.out.println("잘못 고르셨습니다.\n");
				
				}
			}
		}
	}


	
