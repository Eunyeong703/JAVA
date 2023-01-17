package quiz04;

import java.util.Scanner;

public class SellFruitService {
	Scanner sc = new Scanner(System.in);
	
	public void sell(Fruit[] f, SellFruit[] sf) {
		// TODO Auto-generated method stub
		if(FruitService.idx == 0) {
			// Ŭ����.static������ �� ����ϸ� static �������� ȣ�� �ؼ� ����� �� �ִ�.
			System.out.println("��ϵ� ������ �����ϴ�.");
		} else {
			for(int i=0;i<FruitService.idx;i++) {
				System.out.println((i+1) + ". " + f[i].getName());
			}
			System.out.print("���� : ");
			int select  = sc.nextInt();
			
			if(select > FruitService.idx) {
				System.out.println("���õ� ������ �����ϴ�.");
			} else {
				if(sf[select-1] == null) {
					sf[select-1] = new SellFruit();
				}
				System.out.print("�Ǹ� ���� �Է� : ");
				
				int amount = sc.nextInt();
				int preAmount = f[select-1].getAmount();
				
				if(preAmount < amount) {
					System.out.println("�Ǹ� ������ �����մϴ�.");
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
			System.out.println("��ϵ� ������ �����ϴ�.");
		} else {
			System.out.println("### ���� �Ǹ� ���� ###");
			for(int i=0;i<FruitService.idx;i++) {
				System.out.println("== " + f[i].getName() + " ==");
				if(sf[i] == null || sf[i].getAllAmount() == 0) {
					System.out.println("�Ǹ� ������ �����ϴ�.");
				} else {
					System.out.println("�Ǹż��� : " + sf[i].getAllAmount());
					System.out.println("�Ǹűݾ� : " + sf[i].getAllPrice());
				}
			}
		}
	}

}