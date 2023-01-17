package quiz04;

import java.util.Scanner;

public class SellFruitService {
	Scanner sc = new Scanner(System.in);
	
	public void sell(Fruit[] f, SellFruit[] sf) {
		// TODO Auto-generated method stub
		if(FruitService.idx == 0) {
			// 클래스.static변수명 을 사용하면 static 변수값을 호출 해서 사용할 수 있다.
			System.out.println("등록된 과일이 없습니다.");
		} else {
			for(int i=0;i<FruitService.idx;i++) {
				System.out.println((i+1) + ". " + f[i].getName());
			}
			System.out.print("선택 : ");
			int select  = sc.nextInt();
			
			if(select > FruitService.idx) {
				System.out.println("선택된 과일이 없습니다.");
			} else {
				if(sf[select-1] == null) {
					sf[select-1] = new SellFruit();
				}
				System.out.print("판매 수량 입력 : ");
				
				int amount = sc.nextInt();
				int preAmount = f[select-1].getAmount();
				
				if(preAmount < amount) {
					System.out.println("판매 수량이 부족합니다.");
				} else {
					sf[select-1].setAllAmount(amount);
					int price = f[select-1].getPrice();
					sf[select-1].setAllPrice(price * amount);;
					f[select-1].setAmount(preAmount-amount);
				}
			}
		}
	}

	public void sellInfo(Fruit[] f, SellFruit[] sf) {
		// TODO Auto-generated method stub
		if(FruitService.idx == 0) {
			System.out.println("등록된 과일이 없습니다.");
		} else {
			System.out.println("### 과일 판매 정보 ###");
			for(int i=0;i<FruitService.idx;i++) {
				System.out.println("== " + f[i].getName() + " ==");
				if(sf[i] == null || sf[i].getAllAmount() == 0) {
					System.out.println("판매 내역이 없습니다.");
				} else {
					System.out.println("판매수량 : " + sf[i].getAllAmount());
					System.out.println("판매금액 : " + sf[i].getAllPrice());
				}
			}
		}
	}

}