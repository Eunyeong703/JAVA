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
		
		// ���� �ݾ� ���� ����
		int sum = 0;
		
		// ���� ���� ����
		int chAcc = 0;
		int shAcc = 0;
		int bulAcc = 0;
		int colaAcc = 0;
		int ciderAcc = 0;
		int coffAcc = 0;
		
		while(true) {
			System.out.println("\n#################");
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
			int number = 9999;
			
			// ������ ��� ��й�ȣ�� Ʋ�� ���
			for (int i=1;i<3;i++) {
				if(menu != number && menu != 1 && menu != 2 && menu != 3
					&& menu != 4)
			{ 
				System.out.println("�Է� ��ȣ�� Ʋ�Ƚ��ϴ�.");
				System.out.print("���Է� : ");
				int remenu = sc.nextInt();
			}
			}
			
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
				boolean director = true;
				while(director) {
				System.out.println("\n1. ��� ����");
				System.out.println("2. �Ǹ� ���� ����");
				System.out.println("3. �Ǹ� �ݾ� ����");
				System.out.println("4. ��ü ���� ����");
				System.out.println("5. ���� �ʱ�ȭ");
				System.out.println("6. ���� ��� ��ȣ ����");
				System.out.println("7. ���� �޴��� �̵�");
				System.out.println("8. ���α׷� ����");
			
				System.out.print("���� : ");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					
					System.out.println("\n## ��� ������ ��ǰ�� �����ϼ���. ##");
					System.out.println("1)ġŲ ����");
					System.out.println("2)���� ����");
					System.out.println("3)�Ұ�� ����");
					System.out.println("4)���̴�");
					System.out.println("5)�ݶ�");
					System.out.println("6)Ŀ��");
					System.out.println("7)�޴� �̵�");
					
					System.out.print("\n��ǰ ���� : ");
					int reburger = sc.nextInt();
					
					switch(reburger) {
					case 1:
						System.out.println("������ ����� �Է��ϼ��� : ");
						int rechicken = sc.nextInt();
						chicken = rechicken;
						break;
					case 2:
						System.out.println("������ ����� �Է��ϼ��� : ");
						int reshrimp = sc.nextInt();
						shrimp = reshrimp;
						break;
					case 3:
						System.out.println("������ ����� �Է��ϼ��� : ");
						int rebulgogi = sc.nextInt();
						bulgogi = rebulgogi;
						break;
					case 4:
						System.out.println("������ ����� �Է��ϼ��� : ");
						int recola = sc.nextInt();
						cola = recola;
						break;
					case 5:
						System.out.println("������ ����� �Է��ϼ��� : ");
						int recider = sc.nextInt();
						cider = recider;
						break;
					case 6:
						System.out.println("������ ����� �Է��ϼ��� : ");
						int recoffee = sc.nextInt();
						coffee = recoffee;
						break;
					case 7:
						System.out.println("�޴��� �̵��մϴ�.");
						break;
					default:
						System.out.println("�߸��� �����Դϴ�.");
						break;
					}
					break;
					
				case 2:
					System.out.println("\n##�Ǹż��� ���⸦ ���ϴ� ��ǰ�� �����ϼ���.##");
					
					System.out.println("1) ġŲ����");
					System.out.println("2) �������");
					System.out.println("3) �Ұ�����");
					System.out.println("4) �ݶ�");
					System.out.println("5) ���̴�");
					System.out.println("6) Ŀ��");
					System.out.println("7) �޴� �̵�");
					
					System.out.print("\n��ǰ ���� : ");
					int num = sc.nextInt();
					
					switch(num) {
					case 1:
						System.out.println("ġŲ ���� �Ǹ� ���� : " + chAcc);
						break;
					case 2:
						System.out.println("���� ���� �Ǹ� ���� : " + shAcc);
						break;
					case 3:
						System.out.println("�Ұ�� ���� �Ǹ� ���� : " + bulAcc);
						break;
					case 4:
						System.out.println("�ݶ� �Ǹ� ����" + colaAcc);
						break;
					case 5:
						System.out.println("���̴� �Ǹ� ����" + ciderAcc);
						break;
					case 6:
						System.out.println("Ŀ�� �Ǹ� ����" + coffAcc);
						break;
					case 7:
						System.out.println("�޴��� �̵��մϴ�.");
						break;
					default:
						System.out.println("�߸��� �����Դϴ�.");
						break;
					}
					break;
				
				case 3:
					System.out.println("\n## �Ǹűݾ� ���⸦ ���ϴ� ��ǰ�� �����ϼ���. ##");
					
					System.out.println("1) ġŲ����");
					System.out.println("2) �������");
					System.out.println("3) �Ұ�����");
					System.out.println("4) �ݶ�");
					System.out.println("5) ���̴�");
					System.out.println("6) Ŀ��");
					System.out.println("7) �޴� �̵�");
					
					System.out.print("\n��ǰ ���� : ");
					int numchoice = sc.nextInt();
					
					switch(numchoice) {
					case 1:
						System.out.println("ġŲ ���� �Ǹ� �ݾ� : " + (chAcc * chicken));
						break;
					case 2:
						System.out.println("���� ���� �Ǹ� �ݾ� : " + (shAcc * shrimp));
						break;
					case 3:
						System.out.println("�Ұ�� ���� �Ǹ� �ݾ� : " + (bulAcc * bulgogi));
						break;
					case 4:
						System.out.println("�ݶ� �Ǹ� �ݾ�" + (colaAcc * cola));
						break;
					case 5:
						System.out.println("���̴� �Ǹ� �ݾ�" + (ciderAcc * cider));
						break;
					case 6:
						System.out.println("Ŀ�� �Ǹ� �ݾ�" + (coffAcc * coffee));
						break;
					case 7:
						System.out.println("�޴��� �̵��մϴ�.");
						break;
					default:
						System.out.println("�߸��� �����Դϴ�.");
						break;
					}
				case 4:
					int wholesum = ((chAcc * chicken) + (shAcc * shrimp) + (bulAcc * bulgogi)
							+ (colaAcc * cola) + (ciderAcc * cider) + (coffAcc * coffee));
					System.out.println("��ü ���� : " + wholesum);
					break;
					
				case 5:
					System.out.println("������ �ʱ�ȭ�մϴ�.");
					sum = 0;
					break;
					
				case 6:
					System.out.print("������ ��й�ȣ�� �Է��ϼ���(����). : ");
					int renumber = sc.nextInt();
					number = renumber;
					break;
				
				case 7:
					System.out.println("���� �޴��� �̵��մϴ�.");
					director = false;
					break;
					
				case 8:
					System.out.println("���α׷��� ����˴ϴ�.");
					return;
					
				default:
					System.out.println("���õ� �޴��� �����ϴ�.");
				
				}
			}
		}
	}
}


	
