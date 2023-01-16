package quiz02;

import quiz01.Template;

public class FruitService extends Template{

	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� ����");
		System.out.println("4. ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		return sc.nextInt();
	}

	@Override
	public void input(Object[] obj) {
		// TODO Auto-generated method stub
		Fruit[] fruit = (Fruit[]) obj;
		fruit[idx] = new Fruit();
		System.out.print("���� �̸� �Է� : ");
		fruit[idx].setName(sc.next());
		System.out.print("���� ���� �Է� : ");
		fruit[idx].setPrice(sc.nextInt());
		idx++;
	}

	@Override
	public void output(Object[] obj) {
		// TODO Auto-generated method stub
		Fruit[] fruit = (Fruit[]) obj;
		if(idx == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		} else {
			for(int i=0;i<idx;i++) {
				System.out.println("### " + fruit[i].getName() + " ###");
				System.out.println("���� : " + fruit[i].getPrice());
			}
		}
	}

	@Override
	public void modify(Object[] obj) {
		// TODO Auto-generated method stub
		Fruit[] fruit = (Fruit[]) obj;
		if(idx == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		} else {
			System.out.print("������ �̸� �Է� : ");
			String name = sc.next();
			
			for(int i=0;i<idx;i++) {
				if(name.equals(fruit[i].getName())) {
				System.out.print("������ ���� �Է� : ");
				fruit[i].setPrice(sc.nextInt());
				return;
				}
			}
			System.out.println("ã���ô� ������ �����ϴ�.");
		}
	}

	@Override
	public void delete(Object[] obj) {
		// TODO Auto-generated method stub
		Fruit[] fruit = (Fruit[]) obj;
		if(idx == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		} else {
			System.out.print("������ �̸� �Է� : ");
			String name = sc.next();
		
			for(int i=0;i<idx;i++) {
				if(name.equals(fruit[i].getName())) {
					System.out.println(name + "�� ������ �����մϴ�.");
					idx--;
					for(int j=i;j<idx;j++) {
						fruit[j] = fruit[j+1];
					}
					return;
				}
			}
			System.out.println("ã���ô� ������ �����ϴ�.");
		}
	}
}
