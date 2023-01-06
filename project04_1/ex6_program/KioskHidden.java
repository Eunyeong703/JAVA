package ex6_program;


import java.util.Scanner;

public class KioskHidden {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int chicken = 4500;
		int shrimp = 4000;
		int bulgogi = 3500;
		int cola = 2000;
		int cider = 2000;
		int coffee = 1500;
		
		// 결제 금액 저장 변수
		int sum = 0;
		
		// 수량 저장 변수
		int chAcc = 0;
		int shAcc = 0;
		int bulAcc = 0;
		int colaAcc = 0;
		int ciderAcc = 0;
		int coffAcc = 0;
		
		while(true) {
			System.out.println("\n#################");
			System.out.println("### 에이콘 햄버거 ###");
			System.out.println();
			if(chAcc > 0) {
				System.out.println("치킨 버거 : " + chAcc);
			} if(shAcc > 0) {
				System.out.println("새우 버거 : " + shAcc);
			} if(bulAcc > 0) {
				System.out.println("불고기 버거 : " + bulAcc);
			} if(colaAcc > 0) {
				System.out.println("콜라 : " + colaAcc);
			} if(chAcc > 0) {
				System.out.println("사이다 : " + ciderAcc);
			} if(chAcc > 0) {
				System.out.println("커피 : " + coffAcc);		
			}	
			System.out.println("1. 햄버거");
			System.out.println("2. 음료");
			System.out.println("3. 결제");
			System.out.println("4. 전체 취소");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			int number = 9999;
			
			// 관리자 모드 비밀번호가 틀릴 경우
			for (int i=1;i<3;i++) {
				if(menu != number && menu != 1 && menu != 2 && menu != 3
					&& menu != 4)
			{ 
				System.out.println("입력 번호가 틀렸습니다.");
				System.out.print("재입력 : ");
				int remenu = sc.nextInt();
			}
			}
			
			switch(menu) {
			case 1:
				boolean burger = true;
				while(burger) {
					System.out.println();
					if(chAcc > 0) {
						System.out.println("치킨 버거 : " + chAcc);
					} if(shAcc > 0) {
						System.out.println("새우 버거 : " + shAcc);
					} if(bulAcc > 0) {
						System.out.println("불고기 버거 : " + bulAcc);
					} if(colaAcc > 0) {
						System.out.println("콜라 : " + colaAcc);
					} if(ciderAcc > 0) {
						System.out.println("사이다 : " + ciderAcc);
					} if(coffAcc > 0) {
						System.out.println("커피 : " + coffAcc);		
					}
					
					System.out.println("\n### 햄버거 ###");
					System.out.println("1. 치킨버거");
					System.out.println("2. 새우버거");
					System.out.println("3. 불고기버거");
					System.out.println("4. 햄버거 종류 취소");
					System.out.println("5. 메뉴로 이동");
					System.out.print("선택 : ");
					int select = sc.nextInt();
					
					switch(select) {
					case 1:
						System.out.println("치킨버거를 추가합니다.");
						System.out.print("수량 입력 : ");
						chAcc += sc.nextInt();
						break;
					case 2:
						System.out.println("새우버거");
						System.out.print("수량 입력 : ");
						shAcc += sc.nextInt();
						break;
					case 3:
						System.out.println("불고기 버거");
						System.out.print("수량 입력 : ");
						bulAcc = sc.nextInt();
						break;
					case 4:
						System.out.println("햄버거 종류 취소합니다.");
						chAcc = 0;
						shAcc = 0;
						bulAcc = 0;
						break;
					case 5:
						System.out.println("메뉴로 이동합니다.");
						burger = false;
						break;
					}
				}
				break;
				
			case 2:
				boolean drink = true;
				
				while(drink) {
					if(chAcc > 0) {
						System.out.println("치킨 버거 : " + chAcc);
					} if(shAcc > 0) {
						System.out.println("새우 버거 : " + shAcc);
					} if(bulAcc > 0) {
						System.out.println("불고기 버거 : " + bulAcc);
					} if(colaAcc > 0) {
						System.out.println("콜라 : " + colaAcc);
					} if(ciderAcc > 0) {
						System.out.println("사이다 : " + ciderAcc);
					} if(coffAcc > 0) {
						System.out.println("커피 : " + coffAcc);		
					} 
					
					System.out.println("\n### 음료 ###");
					System.out.println("1. 콜라");
					System.out.println("2. 사이다");
					System.out.println("3. 커피");
					System.out.println("4. 음료 메뉴 취소합니다.");
					System.out.println("5. 메뉴로 이동");
					System.out.print("선택 : ");
					int select = sc.nextInt();
					
					switch(select) {
					case 1:
						System.out.println("콜라를 추가합니다.");
						System.out.print("수량 입력 : ");
						colaAcc = sc.nextInt();
						break;
					case 2:
						System.out.println("사이다를 추가합니다.");
						System.out.print("수량 입력 : ");
						ciderAcc = sc.nextInt();
						break;
					case 3:
						System.out.println("커피를 추가합니다.");
						System.out.print("수량 입력 : ");
						coffAcc = sc.nextInt();
						break;
					case 4:
						System.out.println("음료 종류를 취소합니다.");
						colaAcc = 0;
						ciderAcc = 0;
						coffAcc = 0;
						break;
					case 5:
						System.out.println("메뉴로 이동합니다.");
						drink = false; 
					default:
						System.out.println("선택된 메뉴가 없습니다.");
						}
				}
				break;
			case 3:
				sum += (chAcc * chicken);
				sum += (shAcc * shrimp);
				sum += (bulAcc * bulgogi);
				sum += (colaAcc * cola);
				sum += (ciderAcc * cider);
				sum += (coffAcc * coffee);
				
				System.out.println("#### 결제 ####");
				System.out.println("결제하실 금액 : " + sum);
				System.out.println("카드로 결제 합니다.");
				System.out.println("결제 완료했습니다.");
				//sum = 0;
				//sum = 0;
				//chAcc = 0;
				//shAcc = 0;
				//bulAcc = 0;
				//colaAcc = 0;
				//ciderAcc = 0;
				//coffAcc = 0;
				break;
				
			case 4: 
				System.out.println("#### 전체 취소 ####");
				System.out.println("체크된 모든 상품이 취소되었습니다.");
				
				chAcc = 0;
				shAcc = 0;
				bulAcc = 0;
				colaAcc = 0;
				ciderAcc = 0;
				coffAcc = 0;
				break;
			
			case 9999:
				boolean director = true;
				while(director) {
				System.out.println("\n1. 요금 수정");
				System.out.println("2. 판매 수량 보기");
				System.out.println("3. 판매 금액 보기");
				System.out.println("4. 전체 매출 보기");
				System.out.println("5. 매출 초기화");
				System.out.println("6. 숫자 비밀 번호 변경");
				System.out.println("7. 메인 메뉴로 이동");
				System.out.println("8. 프로그램 종료");
			
				System.out.print("선택 : ");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					
					System.out.println("\n## 요금 변경할 제품을 선택하세요. ##");
					System.out.println("1)치킨 버거");
					System.out.println("2)새우 버거");
					System.out.println("3)불고기 버거");
					System.out.println("4)사이다");
					System.out.println("5)콜라");
					System.out.println("6)커피");
					System.out.println("7)메뉴 이동");
					
					System.out.print("\n제품 선택 : ");
					int reburger = sc.nextInt();
					
					switch(reburger) {
					case 1:
						System.out.println("변경할 요금을 입력하세요 : ");
						int rechicken = sc.nextInt();
						chicken = rechicken;
						break;
					case 2:
						System.out.println("변경할 요금을 입력하세요 : ");
						int reshrimp = sc.nextInt();
						shrimp = reshrimp;
						break;
					case 3:
						System.out.println("변경할 요금을 입력하세요 : ");
						int rebulgogi = sc.nextInt();
						bulgogi = rebulgogi;
						break;
					case 4:
						System.out.println("변경할 요금을 입력하세요 : ");
						int recola = sc.nextInt();
						cola = recola;
						break;
					case 5:
						System.out.println("변경할 요금을 입력하세요 : ");
						int recider = sc.nextInt();
						cider = recider;
						break;
					case 6:
						System.out.println("변경할 요금을 입력하세요 : ");
						int recoffee = sc.nextInt();
						coffee = recoffee;
						break;
					case 7:
						System.out.println("메뉴로 이동합니다.");
						break;
					default:
						System.out.println("잘못된 선택입니다.");
						break;
					}
					break;
					
				case 2:
					System.out.println("\n##판매수량 보기를 원하는 제품을 선택하세요.##");
					
					System.out.println("1) 치킨버거");
					System.out.println("2) 새우버거");
					System.out.println("3) 불고기버거");
					System.out.println("4) 콜라");
					System.out.println("5) 사이다");
					System.out.println("6) 커피");
					System.out.println("7) 메뉴 이동");
					
					System.out.print("\n제품 선택 : ");
					int num = sc.nextInt();
					
					switch(num) {
					case 1:
						System.out.println("치킨 버거 판매 수량 : " + chAcc);
						break;
					case 2:
						System.out.println("새우 버거 판매 수량 : " + shAcc);
						break;
					case 3:
						System.out.println("불고기 버거 판매 수량 : " + bulAcc);
						break;
					case 4:
						System.out.println("콜라 판매 수량" + colaAcc);
						break;
					case 5:
						System.out.println("사이다 판매 수량" + ciderAcc);
						break;
					case 6:
						System.out.println("커피 판매 수량" + coffAcc);
						break;
					case 7:
						System.out.println("메뉴로 이동합니다.");
						break;
					default:
						System.out.println("잘못된 선택입니다.");
						break;
					}
					break;
				
				case 3:
					System.out.println("\n## 판매금액 보기를 원하는 제품을 선택하세요. ##");
					
					System.out.println("1) 치킨버거");
					System.out.println("2) 새우버거");
					System.out.println("3) 불고기버거");
					System.out.println("4) 콜라");
					System.out.println("5) 사이다");
					System.out.println("6) 커피");
					System.out.println("7) 메뉴 이동");
					
					System.out.print("\n제품 선택 : ");
					int numchoice = sc.nextInt();
					
					switch(numchoice) {
					case 1:
						System.out.println("치킨 버거 판매 금액 : " + (chAcc * chicken));
						break;
					case 2:
						System.out.println("새우 버거 판매 금액 : " + (shAcc * shrimp));
						break;
					case 3:
						System.out.println("불고기 버거 판매 금액 : " + (bulAcc * bulgogi));
						break;
					case 4:
						System.out.println("콜라 판매 금액" + (colaAcc * cola));
						break;
					case 5:
						System.out.println("사이다 판매 금액" + (ciderAcc * cider));
						break;
					case 6:
						System.out.println("커피 판매 금액" + (coffAcc * coffee));
						break;
					case 7:
						System.out.println("메뉴로 이동합니다.");
						break;
					default:
						System.out.println("잘못된 선택입니다.");
						break;
					}
				case 4:
					int wholesum = ((chAcc * chicken) + (shAcc * shrimp) + (bulAcc * bulgogi)
							+ (colaAcc * cola) + (ciderAcc * cider) + (coffAcc * coffee));
					System.out.println("전체 매출 : " + wholesum);
					break;
					
				case 5:
					System.out.println("매출을 초기화합니다.");
					sum = 0;
					break;
					
				case 6:
					System.out.print("변경할 비밀번호를 입력하세요(숫자). : ");
					int renumber = sc.nextInt();
					number = renumber;
					break;
				
				case 7:
					System.out.println("메인 메뉴로 이동합니다.");
					director = false;
					break;
					
				case 8:
					System.out.println("프로그램이 종료됩니다.");
					return;
					
				default:
					System.out.println("선택된 메뉴가 없습니다.");
				
				}
			}
		}
	}
}


	
