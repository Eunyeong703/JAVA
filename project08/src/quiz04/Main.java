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
			System.out.println("1. 과일 등록");
			System.out.println("2. 과일 판매");
			System.out.println("3. 과일 수량 수정");
			System.out.println("4. 과일 판매 정보");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
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
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
			System.out.println();
		}
	}
}