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
			
			System.out.println("\n### �޴� ###");
			System.out.println("1. �ܹ���");
			System.out.println("2. ����");
			System.out.println("0. ����");
			
			System.out.print("\n�޴� ���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println("\n1) ġŲ ����");
				System.out.println("2) ���� ����");
				System.out.println("3) �Ұ�� ����");
				System.out.println("4) �޴��� ���ư���");
				
				System.out.print("\n���� ���� : ");
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
				System.out.println("\n1) �ݶ�");
				System.out.println("2) ���̴�");
				System.out.println("3) Ŀ��");
				System.out.println("4) �޴��� ���ư���");
				
				System.out.print("\n���� ���� : ");
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
				System.out.println("�� �ݾ� : " + coin);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
				
				break;
			
				default :
				System.out.println("�߸� ���̽��ϴ�.\n");
				
				}
			}
		}
	}


	
