package quiz09;

import java.util.Scanner;

public class FruitMain {
	public static void main(String[] args) {
		// �θ�Ŭ���� ������ �ڽ� Ŭ���� ��ü�� �����ϸ� 
		// �θ�Ŭ������ ���� �޼��带 �ڽ�Ŭ������ �������̵��� �޼��带 �θ�Ŭ�������� ����� �� �ִ�.
		Scanner sc = new Scanner(System.in);
		SellFruit sf[] = new SellFruit[3]; // �� ���Ϻ��� ���� ��Ȳ �����
		
		for(int i=0;i<3;i++) {
			sf[i] = new SellFruit();
		}
		
		Fruit fl[] = new Fruit[3];
		fl[0] = new Banana();
		fl[1] = new Apple();
		fl[2] = new Orange();
		
		while(true) {
			System.out.println("1. �Ǹ�");
			System.out.println("2. ����");
			System.out.println("0. ����");
			System.out.print("���� : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("1. �ٳ���");
				System.out.println("2. ���");
				System.out.println("3. ������");
				System.out.print("���� : ");
				
				int select = sc.nextInt();
				int allPay = sf[select-1].getAllPay();
				int allAmount = sf[select-1].getAllAmount();
				switch(select) {
				case 1:
				case 2:
				case 3:
					if (fl[select-1].getAmount() != 0) { // ��� ������ �Ǹ� �Ұ���
					sf[select-1].setAllPay(allPay+fl[select-1].getPrice());
					sf[select-1].setAllAmount(allAmount + 1);
					fl[select-1].setAmount(fl[select-1].getAmount()-1);
					} else {
						System.out.println("��� �����ϴ�.");
					}
					break;
				default:
					System.out.println("���õ� ���� �߸��Ǿ����ϴ�. �޴��� ���ư��ϴ�.");
				}
				break;
			case 2:
				for(int i=0;i<3;i++) {
					System.out.println("### " + fl[i].getfName() + " ###");
					System.out.println("�� ���� : " + sf[i].getAllPay());
					System.out.println("�� ���� : " + sf[i].getAllAmount());
				}
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}
}