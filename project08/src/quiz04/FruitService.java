package quiz04;

import java.util.Scanner;

public class FruitService {
	Scanner sc = new Scanner(System.in);
	static int idx = 0;
	
	public void input(Fruit[] f) {
		// TODO Auto-generated method stub
		f[idx] = new Fruit();
		System.out.print("과일 이름 입력 : ");
		f[idx].setName(sc.next());
		System.out.print("과일 수량 입력 : ");
		f[idx].setAmount(sc.nextInt());
		System.out.print("과일 가격 입력 : ");
		f[idx].setPrice(sc.nextInt());
		idx++;
	}

	public void modify(Fruit[] f) {
		// TODO Auto-generated method stub
		if(idx == 0) {
			System.out.println("등록된 과일이 없습니다.");
		} else {
			for(int i=0;i<idx;i++) {
				System.out.println((i+1)+". " + f[i].getName() + " : " 
						+ f[i].getAmount()); 
			}
			System.out.print("선택 : ");
			int select = sc.nextInt();
			
			if(select > idx) {
				System.out.println("선택된 과일이 없습니다.");
			} else {
				System.out.print("추가 수량 입력 : ");
				int amount = sc.nextInt();
				f[select-1].setAmount(f[select-1].getAmount() + amount);
			}
		}
	}

}