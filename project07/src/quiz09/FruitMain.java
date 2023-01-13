package quiz09;

import java.util.Scanner;

public class FruitMain {
	public static void main(String[] args) {
		// 부모클래스 변수로 자식 클래스 객체를 생성하면 
		// 부모클래스가 가진 메서드를 자식클래스가 오버라이드한 메서드를 부모클래스에서 사용할 수 있다.
		Scanner sc = new Scanner(System.in);
		SellFruit sf[] = new SellFruit[3]; // 각 과일별로 매출 현황 만들기
		
		for(int i=0;i<3;i++) {
			sf[i] = new SellFruit();
		}
		
		Fruit fl[] = new Fruit[3];
		fl[0] = new Banana();
		fl[1] = new Apple();
		fl[2] = new Orange();
		
		while(true) {
			System.out.println("1. 판매");
			System.out.println("2. 매출");
			System.out.println("0. 종료");
			System.out.print("선택 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("1. 바나나");
				System.out.println("2. 사과");
				System.out.println("3. 오렌지");
				System.out.print("선택 : ");
				
				int select = sc.nextInt();
				int allPay = sf[select-1].getAllPay();
				int allAmount = sf[select-1].getAllAmount();
				switch(select) {
				case 1:
				case 2:
				case 3:
					if (fl[select-1].getAmount() != 0) { // 재고가 없으면 판매 불가능
					sf[select-1].setAllPay(allPay+fl[select-1].getPrice());
					sf[select-1].setAllAmount(allAmount + 1);
					fl[select-1].setAmount(fl[select-1].getAmount()-1);
					} else {
						System.out.println("재고가 없습니다.");
					}
					break;
				default:
					System.out.println("선택된 과일 잘못되었습니다. 메뉴로 돌아갑니다.");
				}
				break;
			case 2:
				for(int i=0;i<3;i++) {
					System.out.println("### " + fl[i].getfName() + " ###");
					System.out.println("총 매출 : " + sf[i].getAllPay());
					System.out.println("총 수량 : " + sf[i].getAllAmount());
				}
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}