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
			
			// ���� �ݾ� ���� ����
			int sum = 0;
			
			// ���� ���� ����
			int chAcc = 0;
			int shAcc = 0;
			int bulAcc = 0;
			int colaAcc = 0;
			int ciderAcc = 0;
			int coffAcc = 0;
			
			// ������ ���� ����
			int adminPass = 1234;
			
			// �� �Ǹ� ���� ���� ����
			int chickenAll = 0;
			int shrimpAll = 0;
			int bulgogiAll = 0;
			int colaAll = 0;
			int ciderAll = 0;
			int coffAll = 0;
			
			while(true) {
				System.out.println("#################");
				System.out.println("### ������ �ܹ��� ###");
				System.out.println();
				if(chAcc > 0) {
					System.out.println("ġŲ ���� : " + chAcc);
				} if(shAcc > 0) {
					System.out.println("���� ���� : " + shAcc);
				} if(bulAcc > 0) {
					System.out.println("�Ұ�� ���� : " + bulAcc);
				} if(colaAcc > 0) {
					System.out.println("�ݶ� : " + colaAcc);
				} if(chAcc > 0) {
					System.out.println("���̴� : " + ciderAcc);
				} if(chAcc > 0) {
					System.out.println("Ŀ�� : " + coffAcc);		
				}	
				System.out.println("1. �ܹ���");
				System.out.println("2. ����");
				System.out.println("3. ����");
				System.out.println("4. ��ü ���");
				System.out.print("���� : ");
				int menu = sc.nextInt();
				
				switch(menu) {
				case 1:
					boolean burger = true;
					while(burger) {
						System.out.println();
						if(chAcc > 0) {
							System.out.println("ġŲ ���� : " + chAcc);
						} if(shAcc > 0) {
							System.out.println("���� ���� : " + shAcc);
						} if(bulAcc > 0) {
							System.out.println("�Ұ�� ���� : " + bulAcc);
						} if(colaAcc > 0) {
							System.out.println("�ݶ� : " + colaAcc);
						} if(ciderAcc > 0) {
							System.out.println("���̴� : " + ciderAcc);
						} if(coffAcc > 0) {
							System.out.println("Ŀ�� : " + coffAcc);		
						}
						
						System.out.println("\n### �ܹ��� ###");
						System.out.println("1. ġŲ����");
						System.out.println("2. �������");
						System.out.println("3. �Ұ�����");
						System.out.println("4. �ܹ��� ���� ���");
						System.out.println("5. �޴��� �̵�");
						System.out.print("���� : ");
						int select = sc.nextInt();
						
						switch(select) {
						case 1:
							System.out.println("ġŲ���Ÿ� �߰��մϴ�.");
							System.out.print("���� �Է� : ");
							chAcc += sc.nextInt();
							break;
						case 2:
							System.out.println("�������");
							System.out.print("���� �Է� : ");
							shAcc += sc.nextInt();
							break;
						case 3:
							System.out.println("�Ұ�� ����");
							System.out.print("���� �Է� : ");
							bulAcc = sc.nextInt();
							break;
						case 4:
							System.out.println("�ܹ��� ���� ����մϴ�.");
							chAcc = 0;
							shAcc = 0;
							bulAcc = 0;
							break;
						case 5:
							System.out.println("�޴��� �̵��մϴ�.");
							burger = false;
							break;
						}
					}
					break;
				case 2:
					boolean drink = true;
					
					while(drink) {
						if(chAcc > 0) {
							System.out.println("ġŲ ���� : " + chAcc);
						} if(shAcc > 0) {
							System.out.println("���� ���� : " + shAcc);
						} if(bulAcc > 0) {
							System.out.println("�Ұ�� ���� : " + bulAcc);
						} if(colaAcc > 0) {
							System.out.println("�ݶ� : " + colaAcc);
						} if(ciderAcc > 0) {
							System.out.println("���̴� : " + ciderAcc);
						} if(coffAcc > 0) {
							System.out.println("Ŀ�� : " + coffAcc);		
						} 
						
						System.out.println("\n### ���� ###");
						System.out.println("1. �ݶ�");
						System.out.println("2. ���̴�");
						System.out.println("3. Ŀ��");
						System.out.println("4. ���� �޴� ����մϴ�.");
						System.out.println("5. �޴��� �̵�");
						System.out.print("���� : ");
						int select = sc.nextInt();
						
						switch(select) {
						case 1:
							System.out.println("�ݶ� �߰��մϴ�.");
							System.out.print("���� �Է� : ");
							colaAcc = sc.nextInt();
							break;
						case 2:
							System.out.println("���̴ٸ� �߰��մϴ�.");
							System.out.print("���� �Է� : ");
							ciderAcc = sc.nextInt();
							break;
						case 3:
							System.out.println("Ŀ�Ǹ� �߰��մϴ�.");
							System.out.print("���� �Է� : ");
							coffAcc = sc.nextInt();
							break;
						case 4:
							System.out.println("���� ������ ����մϴ�.");
							colaAcc = 0;
							ciderAcc = 0;
							coffAcc = 0;
							break;
						case 5:
							System.out.println("�޴��� �̵��մϴ�.");
							drink = false; 
						default:
							System.out.println("���õ� �޴��� �����ϴ�.");
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
					
					System.out.println("#### ���� ####");
					System.out.println("�����Ͻ� �ݾ� : " + sum);
					System.out.println("ī��� ���� �մϴ�.");
					System.out.println("���� �Ϸ��߽��ϴ�.");
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
					System.out.println("#### ��ü ��� ####");
					System.out.println("üũ�� ��� ��ǰ�� ��ҵǾ����ϴ�.");
					
					chAcc = 0;
					shAcc = 0;
					bulAcc = 0;
					colaAcc = 0;
					ciderAcc = 0;
					coffAcc = 0;
					break;
					
				case 9999:
					admin : for(int i=0 ; i<3 ; i++)
					System.out.println("������ ��й�ȣ �Է�");
					int check = sc.nextInt();
					
					if(adminPass == check) {
						while (true)
						System.out.println("#### ������ ��� ####");
						System.out.println("1. ��� ����");
						System.out.println("2. �Ǹ� ���� ����");
						System.out.println("3. �Ǹ� �ݾ� ����");
						System.out.println("4. ���� ���� ����");
						System.out.println("5. ���� �ʱ�ȭ");
						System.out.println("6. ������ ��й�ȣ ����");
						System.out.println("7. ���� �޴��� �̵�");
						System.out.println("0. ���α׷� ����");
						System.out.print("���� : ");
						menu = sc.nextInt();
						
						switch(menu) {
						case 1:
							System.out.println("#### ��� ���� ####");
							System.out.println("1. ġŲ ����");
							System.out.println("2. ���� ����");
							System.out.println("3. �Ұ�� ����");
							System.out.println("4. �ݶ�");
							System.out.println("5. ���̴�");
							System.out.println("6. Ŀ��");
							System.out.print("���� : ");
							int select = sc.nextInt();
							
							switch(select) {
							case 1:
								System.out.print("ġŲ ���� ���� ��� �Է� : ");
								chicken = sc.nextInt();
								break;
							case 2:
								System.out.print("���� ���� ���� ��� �Է� : ");
								shrimp = sc.nextInt();
								break;
							case 3:
								System.out.print("�Ұ�� ���� ���� ��� �Է� : ");
								bulgogi = sc.nextInt();
								break;
							case 4:
								System.out.print("�ݶ� ���� ��� �Է� : ");
								cola = sc.nextInt();
								break;
							case 5:
								System.out.print("���̴� ���� ��� �Է� : ");
								cider = sc.nextInt();
								break;
							case 6:
								System.out.println("Ŀ�� ���� ��� �Է� : ");
								coffee = sc.nextInt();
								break;
							default :
								break;
							}
							
							break;
						case 2:
							System.out.println("#### �Ǹ� ���� ####");
							System.out.println("ġŲ ���� : " + chickenAll);
							System.out.println("���� ���� : " + shrimpAll);
							System.out.println("�Ұ�� ���� : " + bulgogiAll);
							System.out.println("�ݶ� : " + colaAll);
							System.out.println("���̴� : " + ciderAll);
							System.out.println("Ŀ�� : " + coffAll);
							break;
						case 3:
							System.out.println("#### �Ǹ� �ݾ� ####");
							System.out.println("ġŲ ���� : " + (chickenAll * chicken));
							System.out.println("���� ���� : " + (shrimpAll*shrimp));
							System.out.println("�Ұ�� ���� : " + (bulgogiAll*bulgogi));
							System.out.println("�ݶ� : " + (colaAll * cola));
							System.out.println("���̴� : " + (ciderAll * cider));
							System.out.println("Ŀ�� : " + (coffAll * coffee));
							break;
						case 4:
							System.out.println("#### ���� ���� ���� ####");
							System.out.println("�� ���� : " + ((chAcc * chicken) + (shAcc * shrimp) + (bulAcc * bulgogi)
									+ (colaAcc * cola) + (ciderAcc * cider) + (coffAcc * coffee)));
							break;
						case 5:
							System.out.println("#### ���� �ʱ�ȭ ####");
							break;
						case 6:
							System.out.println("##### ������ ��й�ȣ ���� #####");
							for(int x=0;x<3;x++) {
								System.out.print("���� ��й�ȣ �Է� : ");
								check  = sc.nextInt();
								
							if(adminPass == check) {
								System.out.println("���ο� ��й�ȣ �Է� : ");
								int pass1 = sc.nextInt();
								System.out.println("���ο� ��й�ȣ Ȯ�� : ");
								int pass2 = sc.nextInt();
								if(pass1 == pass2) {
									System.out.println("��й�ȣ�� �����մϴ�.");
									adminPass = pass1;
								} else {
									System.out.println("��й�ȣ�� Ȯ�� �� �ٽ� �����ϼ���.");
								}
								break;
							} else {
								System.out.println((x+1) + " ȸ Ʋ�Ƚ��ϴ�.");
							}
						}
						break;
					case 7:
						break admin;
					case 0:
						System.out.println("���α׷� ����");
						return;
					default:
						System.out.println("���õ� �޴��� �����ϴ�.");
					}
				}
			} else {
				System.out.println((i+1)+"ȸ ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}
		break;
	default:
			System.out.println("���õ� �޴��� �����ϴ�.");
	}
	}
	}
	}