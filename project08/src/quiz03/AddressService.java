package quiz03;

import java.util.Scanner;

public class AddressService {
	Scanner sc = new Scanner(System.in);
	int idx = 0;
	
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. ��� ���");
		System.out.println("2. ��� ���");
		System.out.println("0. ���θ޴���");
		System.out.print("���� : ");
		return sc.nextInt();
	}

	public int input(Address[] address, int idx) {
		// TODO Auto-generated method stub
		if(idx == 3) {
			System.out.println("�� �̻� ������ �� �����ϴ�.");
		} else {
			address[idx] = new Address();
			System.out.print("��Ҹ� �Է� : ");
			address[idx].setName(sc.next());
			System.out.print("����� �ּ� �Է� : ");
			address[idx].setAddress(sc.next());
			idx++;
		}
		return idx;
	}

	public void output(Address[] address, int idx) {
		// TODO Auto-generated method stub
		if(idx == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		} else {
			for(int i=0;i<idx;i++) {
				System.out.println("��Ҹ� : " + address[i].getName());
				System.out.println("�ּ� : " + address[i].getAddress());
			}
		}
	}

}