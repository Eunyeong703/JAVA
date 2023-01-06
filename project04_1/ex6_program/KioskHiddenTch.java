package ex6_program;
	
	
	import java.util.Scanner;
	
	public class KioskHiddenTch {
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
			
			// 관리자 저장 변수
			int adminPass = 1234;
			
			// 각 판매 수량 저장 변수
			int chickenAll = 0;
			int shrimpAll = 0;
			int bulgogiAll = 0;
			int colaAll = 0;
			int ciderAll = 0;
			int coffAll = 0;
			
			while(true) {
				System.out.println("#################");
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
					chickenAll += chAcc;
					shrimpAll += shAcc;
					bulgogiAll += bulAcc;
					colaAll += colaAcc;
					ciderAll += ciderAcc;
					coffAll += coffAcc;
					
					sum = 0;
					sum = 0;
					chAcc = 0;
					shAcc = 0;
					bulAcc = 0;
					colaAcc = 0;
					ciderAcc = 0;
					coffAcc = 0;
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
					admin : for(int i=0 ; i<3 ; i++)
					System.out.println("관리자 비밀번호 입력");
					int check = sc.nextInt();
					
					if(adminPass == check) {
						while (true)
						System.out.println("#### 관리자 모드 ####");
						System.out.println("1. 요금 수정");
						System.out.println("2. 판매 수량 보기");
						System.out.println("3. 판매 금액 보기");
						System.out.println("4. 일일 매출 보기");
						System.out.println("5. 매출 초기화");
						System.out.println("6. 관리자 비밀번호 변경");
						System.out.println("7. 메인 메뉴로 이동");
						System.out.println("0. 프로그램 종료");
						System.out.print("선택 : ");
						menu = sc.nextInt();
						
						switch(menu) {
						case 1:
							System.out.println("#### 요금 수정 ####");
							System.out.println("1. 치킨 버거");
							System.out.println("2. 새우 버거");
							System.out.println("3. 불고기 버거");
							System.out.println("4. 콜라");
							System.out.println("5. 사이다");
							System.out.println("6. 커피");
							System.out.print("선택 : ");
							int select = sc.nextInt();
							
							switch(select) {
							case 1:
								System.out.print("치킨 버거 변경 요금 입력 : ");
								chicken = sc.nextInt();
								break;
							case 2:
								System.out.print("새우 버거 변경 요금 입력 : ");
								shrimp = sc.nextInt();
								break;
							case 3:
								System.out.print("불고기 버거 변경 요금 입력 : ");
								bulgogi = sc.nextInt();
								break;
							case 4:
								System.out.print("콜라 변경 요금 입력 : ");
								cola = sc.nextInt();
								break;
							case 5:
								System.out.print("사이다 변경 요금 입력 : ");
								cider = sc.nextInt();
								break;
							case 6:
								System.out.println("커피 변경 요금 입력 : ");
								coffee = sc.nextInt();
								break;
							default :
								break;
							}
							
							break;
						case 2:
							System.out.println("#### 판매 수량 ####");
							System.out.println("치킨 버거 : " + chickenAll);
							System.out.println("새우 버거 : " + shrimpAll);
							System.out.println("불고기 버거 : " + bulgogiAll);
							System.out.println("콜라 : " + colaAll);
							System.out.println("사이다 : " + ciderAll);
							System.out.println("커피 : " + coffAll);
							break;
						case 3:
							System.out.println("#### 판매 금액 ####");
							System.out.println("치킨 버거 : " + (chickenAll * chicken));
							System.out.println("새우 버거 : " + (shrimpAll*shrimp));
							System.out.println("불고기 버거 : " + (bulgogiAll*bulgogi));
							System.out.println("콜라 : " + (colaAll * cola));
							System.out.println("사이다 : " + (ciderAll * cider));
							System.out.println("커피 : " + (coffAll * coffee));
							break;
						case 4:
							System.out.println("#### 일일 매출 보기 ####");
							System.out.println("일 매출 : " + ((chAcc * chicken) + (shAcc * shrimp) + (bulAcc * bulgogi)
									+ (colaAcc * cola) + (ciderAcc * cider) + (coffAcc * coffee)));
							break;
						case 5:
							System.out.println("#### 매출 초기화 ####");
							break;
						case 6:
							System.out.println("##### 관리자 비밀번호 변경 #####");
							for(int x=0;x<3;x++) {
								System.out.print("현재 비밀번호 입력 : ");
								check  = sc.nextInt();
								
							if(adminPass == check) {
								System.out.println("새로운 비밀번호 입력 : ");
								int pass1 = sc.nextInt();
								System.out.println("새로운 비밀번호 확인 : ");
								int pass2 = sc.nextInt();
								if(pass1 == pass2) {
									System.out.println("비밀번호를 변경합니다.");
									adminPass = pass1;
								} else {
									System.out.println("비밀번호를 확인 후 다시 변경하세요.");
								}
								break;
							} else {
								System.out.println((x+1) + " 회 틀렸습니다.");
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
	}
	}
	}