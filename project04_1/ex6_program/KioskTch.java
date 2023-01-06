package ex6_program;
Kiosk.java


import java.util.Scanner;

public class Kiosk {
	public static void main(String[] args) {
		// 입력 객체 변수
		Scanner sc = new Scanner(System.in);

		// 각 햄버거 가격
		int chicken = 4500;
		int shrimp = 4000;
		int bulgogi = 3500;
		// 각 음료 가격
		int cola = 2000;
		int sider = 2000;
		int coffee = 1500;
		// 결제금액을 저장하는 변수
		int sum = 0;
		// 수량을 저장하는 변수
		int chAcc = 0;
		int shAcc = 0;
		int bulAcc = 0;
		int coAcc = 0;
		int siAcc = 0;
		int ffAcc = 0;

		// 관리자 비밀번호 저장 변수
		int adminPass = 1234;

		// 각 판매 수량을 저장 변수
		int chickenAll = 0;
		int shrimpAll = 0;
		int bulgogiAll = 0;
		int colaAll = 0;
		int siderAll = 0;
		int coffeeAll = 0;
		
		while(true) {
			System.out.println("####################");
			System.out.println("##### 에이콘 햄버거 #####");
			System.out.println("####################");
			System.out.println();
			if(chAcc > 0) {
				System.out.println("치킨버거 : " + chAcc);
			}
			if(shAcc > 0) {
				System.out.println("새우버거 : " + shAcc);
			}
			if(bulAcc > 0) {
				System.out.println("불고기버거 : " + bulAcc);
			}
			if(coAcc > 0) {
				System.out.println("콜라 : " + coAcc);
			}
			if(siAcc > 0) {
				System.out.println("사이다 : " + siAcc);
			}
			if(ffAcc > 0) {
				System.out.println("커피 : " + ffAcc);
			}
			System.out.println();
			System.out.println("1. 햄버거");
			System.out.println("2. 음료");
			System.out.println("3. 결제");
			System.out.println("4. 전체취소");
			System.out.print("선택 : ");
			int menu = sc.nextInt();

			switch(menu) {
			case 1:
				boolean burger = true;
				while(burger) {
					System.out.println();
					if(chAcc > 0) {
						System.out.println("치킨버거 : " + chAcc);
					}
					if(shAcc > 0) {
						System.out.println("새우버거 : " + shAcc);
					}
					if(bulAcc > 0) {
						System.out.println("불고기버거 : " + bulAcc);
					}
					if(coAcc > 0) {
						System.out.println("콜라 : " + coAcc);
					}
					if(siAcc > 0) {
						System.out.println("사이다 : " + siAcc);
					}
					if(ffAcc > 0) {
						System.out.println("커피 : " + ffAcc);
					}
					System.out.println("\n###### 햄버거 #####");
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
						System.out.println("새우버거를 추가합니다.");
						System.out.print("수량 입력 : ");
						shAcc += sc.nextInt();
						break;
					case 3:
						System.out.println("불고기버거를 추가합니다.");
						System.out.print("수량 입력 : ");
						bulAcc += sc.nextInt();
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
					default:
						System.out.println("선택된 메뉴가 없습니다.");
					}
				}
				break;
			case 2:
				boolean drink = true;
				while(drink) {
					System.out.println();
					if(chAcc > 0) {
						System.out.println("치킨버거 : " + chAcc);
					}
					if(shAcc > 0) {
						System.out.println("새우버거 : " + shAcc);
					}
					if(bulAcc > 0) {
						System.out.println("불고기버거 : " + bulAcc);
					}
					if(coAcc > 0) {
						System.out.println("콜라 : " + coAcc);
					}
					if(siAcc > 0) {
						System.out.println("사이다 : " + siAcc);
					}
					if(ffAcc > 0) {
						System.out.println("커피 : " + ffAcc);
					}
					System.out.println("\n###### 음료 #####");
					System.out.println("1. 콜라");
					System.out.println("2. 사이다");
					System.out.println("3. 커피");
					System.out.println("4. 음료 종류 취소");
					System.out.println("5. 메뉴로 이동");
					System.out.print("선택 : ");
					int select = sc.nextInt();

					switch(select) {
					case 1:
						System.out.println("콜라를 추가합니다.");
						System.out.print("수량 입력 : ");
						coAcc += sc.nextInt();
						break;
					case 2:
						System.out.println("사이다를 추가합니다.");
						System.out.print("수량 입력 : ");
						siAcc += sc.nextInt();
						break;
					case 3:
						System.out.println("커피를 추가합니다.");
						System.out.print("수량 입력 : ");
						ffAcc += sc.nextInt();
						break;
					case 4:
						System.out.println("음료 종류를 취소합니다.");
						coAcc =0;
						siAcc = 0;
						ffAcc = 0;
						break;
					case 5:
						System.out.println("메뉴로 이동합니다.");
						drink = false;
						break;
					default:
						System.out.println("선택된 메뉴가 없습니다.");
					}
				}
				break;
			case 3:
				sum += (chAcc * chicken);
				sum += (shAcc * shrimp);
				sum += (bulAcc * bulgogi);
				sum += (coAcc * cola);
				sum += (siAcc * sider);
				sum += (ffAcc * coffee);
				System.out.println("##### 결제 #####");
				System.out.println("결제하실 금액 : " + sum);
				System.out.println("카드로 결제 합니다.");
				System.out.println("결제 완료 했습니다.");
				
				chickenAll += chAcc;
				shrimpAll += shAcc;
				bulgogiAll += bulAcc;
				colaAll += coAcc;
				siderAll += siAcc;
				coffeeAll += ffAcc;
				
				sum = 0;
				chAcc = 0;
				shAcc = 0;
				bulAcc = 0;
				coAcc = 0;
				siAcc = 0;
				ffAcc = 0;
				break;
			case 4:
				System.out.println("##### 전체 취소 #####");
				System.out.println("체크 된 모든 상품이 취소 되었습니다.");
				chAcc = 0;
				shAcc = 0;
				bulAcc = 0;
				coAcc = 0;
				siAcc = 0;
				ffAcc = 0;
				break;
			case 9999:
				admin:for(int i=0;i<3;i++) {
					System.out.print("관리자 비밀번호 입력 : ");
					int check = sc.nextInt();
	
					if(adminPass == check) {
						while(true) {
							System.out.println("##### 관리자 모드 #####");
							System.out.println("1. 요금 수정");
							System.out.println("2. 판매수량보기");
							System.out.println("3. 판매금액보기");
							System.out.println("4. 일일매출보기");
							System.out.println("5. 매출초기화");
							System.out.println("6. 관리자비밀번호변경");
							System.out.println("7. 메인메뉴로 이동");
							System.out.println("0. 프로그램 종료");
							System.out.print("선택 : ");
							menu = sc.nextInt();
	
							switch(menu) {
							case 1:
								System.out.println("##### 요금 수정 #####");
								System.out.println("1. 치킨버거");
								System.out.println("2. 새우버거");
								System.out.println("3. 불고기버거");
								System.out.println("4. 콜라");
								System.out.println("5. 사이다");
								System.out.println("6. 커피");
								System.out.print("선택 : ");
								int select = sc.nextInt();
								
								switch(select) {
								case 1:
									System.out.print("치킨버거 변경 요금 입력 : ");
									chicken = sc.nextInt();
									break;
								case 2:
									System.out.print("새우버거 변경 요금 입력 : ");
									shrimp = sc.nextInt();
									break;
								case 3:
									System.out.print("불고기버거 변경 요금 입력 : ");
									bulgogi = sc.nextInt();	
									break;
								case 4:
									System.out.print("콜라 변경 요금 입력 : ");
									cola = sc.nextInt();
									break;
								case 5:
									System.out.print("사이다 변경 요금 입력 : ");
									sider = sc.nextInt();
									break;
								case 6:
									System.out.print("커피 변경 요금 입력 : ");
									coffee = sc.nextInt();
									break;
								default:
									System.out.println("선택된 메뉴가 없습니다.");
								}
								break;
							case 2:
								System.out.println("##### 판매 수량 #####");
								System.out.println("치킨 버거 : " + chickenAll);
								System.out.println("새우 버거 : " + shrimpAll);
								System.out.println("불고기 버거 : " + bulgogiAll);
								System.out.println("콜라 : " + colaAll);
								System.out.println("사이다 : " + siderAll);
								System.out.println("커피 : " + coffeeAll);
								break;
							case 3:
								System.out.println("##### 판매 금액 #####");
								System.out.println("치킨 버거 : " + (chickenAll * chicken));
								System.out.println("새우 버거 : " + (shrimpAll * shrimp));
								System.out.println("불고기 버거 : " + (bulgogiAll * bulgogi));
								System.out.println("콜라 : " + (colaAll * cola));
								System.out.println("사이다 : " + (siderAll * sider));
								System.out.println("커피 : " + (coffeeAll * coffee));
								break;
							case 4:
								System.out.println("##### 일일 매출 보기 #####");
								System.out.println("일 매출 : " + ((chickenAll * chicken) +
								(shrimpAll * shrimp) +
								(bulgogiAll * bulgogi) +
								(colaAll * cola) +
								 (siderAll * sider)+
								 (coffeeAll * coffee)));
								break;
							case 5:
								System.out.println("##### 매출 초기화 #####");
								System.out.println("매출을 초기화 했습니다.");
								chickenAll = 0;
								shrimpAll = 0;
								bulgogiAll = 0;
								colaAll = 0;
								siderAll = 0;
								coffeeAll = 0;
								break;
							case 6:
								System.out.println("##### 관리자 비밀번호 변경 #####");
								for(int x=0;x<3;x++) {
									System.out.print("현재 비밀번호 입력 : ");
									check  = sc.nextInt();
									
									if(adminPass == check) {
										System.out.print("새로운 비밀번호 입력 : ");
										int pass1 = sc.nextInt();
										System.out.print("새로운 비밀번호 확인 : ");
										int pass2 = sc.nextInt();
										if(pass1 == pass2) {
											System.out.println("비밀번호를 변경합니다.");
											adminPass = pass1;
										} else {
											System.out.println("비밀번호를 확인후 다시 변경하세요");
										}
										break;
									} else {
										System.out.println( (x+1) + " 회 틀렸습니다.");
									}
								}
								break;
							case 7:
								break admin;
							case 0:
								System.out.println("프로그램 종료");
								return;
							default:
								System.out.println("선택된 메뉴가 없습니다.");
							}
						}
					} else {
						System.out.println((i+1)+"회 비밀번호가 틀렸습니다.");
					}
				}
				break;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
			System.out.println();
		}

	}
}