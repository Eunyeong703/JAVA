package quiz04;

import java.util.Scanner;

public class FruitService {
	Scanner sc = new Scanner(System.in);
	static int idx = 0;
	
	public void input(Fruit[] f) {
		// TODO Auto-generated method stub
		f[idx] = new Fruit();
		System.out.print("���� �̸� �Է� : ");
		f[idx].setName(sc.next());
		System.out.print("���� ���� �Է� : ");
		f[idx].setAmount(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		f[idx].setPrice(sc.nextInt());
		idx++;
	}

	public void modify(Fruit[] f) {
		// TODO Auto-generated method stub
		if(idx == 0) {
			System.out.println("��ϵ� ������ �����ϴ�.");
		} else {
			for(int i=0;i<idx;i++) {
				System.out.println((i+1)+". " + f[i].getName() + " : " 
						+ f[i].getAmount()); 
			}
			System.out.print("���� : ");
			int select = sc.nextInt();
			
			if(select > idx) {
				System.out.println("���õ� ������ �����ϴ�.");
			} else {
				System.out.print("�߰� ���� �Է� : ");
				int amount = sc.nextInt();
				f[select-1].setAmount(f[select-1].getAmount() + amount);
			}
		}
	}

}