package quiz04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fruit[] fruit = new Fruit[5];
		SellFruit[] sellFruit = new SellFruit[5];
		
		FruitService fs = new FruitService();
		SellFruitService sfs = new SellFruitService();
		
		while(true) {
			System.out.println("1. ���� ���");
			System.out.println("2. ���� �Ǹ�");
			System.out.println("3. ���� ���� ����");
			System.out.println("4. ���� �Ǹ� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				fs.input(fruit);
				break;
			case 2:
				sfs.sell(fruit, sellFruit);
				break;
			case 3:
				fs.modify(fruit);
				break;
			case 4:
				sfs.sellInfo(fruit, sellFruit);
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
			System.out.println();
		}
	}
}