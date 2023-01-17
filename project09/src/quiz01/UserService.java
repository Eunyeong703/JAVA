package quiz01;

import java.util.Scanner;

public class UserService implements ServiceImpl {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. ȸ�� ���");
		System.out.println("2. ȸ�� ���");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		return sc.nextInt();
	}

	@Override
	public int input(Object[] obj, int idx) {
		// TODO Auto-generated method stub
		if(idx == 5) {
			System.out.println("������ ������ �����ϴ�.");
		} else {
			User u = new User();
			System.out.print("���̵� �Է� : ");
			u.setId(sc.next());
			System.out.print("��ȣ �Է� : ");
			u.setPwd(sc.next());
			
			obj[idx] = u;
			idx++;
		}
		return 0;
	}

	@Override
	public void output(Object[] obj, int idx) {
		// TODO Auto-generated method stub
		if(idx == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		} else {
			User[] u = (User[]) obj;
			for(int i=0;i<idx;i++) {
				System.out.println("���̵� : " + u[i].getId());
				System.out.println("��ȣ : " + u[i].getPwd());
			}
		}
	}
}
