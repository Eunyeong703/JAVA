package quiz07;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Quiz07 q = new Quiz07();
		
		int num = 0;
		double db = 0;
		String str = null;
		
		while(true) {
			System.out.println("1. ���� �Է�");
			System.out.println("2. �Ǽ� �Է�");
			System.out.println("3. ���ڿ� �Է�");
			System.out.println("4. ����");
			System.out.println("0. ����");
			System.out.print("���� : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("���� �Է� : ");
				num = sc.nextInt();
				break;
			case 2:
				System.out.print("�Ǽ� �Է� : ");
				db = sc.nextDouble();
				break;
			case 3:
				System.out.print("���ڿ� �Է� : ");
				str = sc.next();
				break;
			case 4:
				if(num != 0 && db != 0) {
					q.oper(num, db);
				} else if (num != 0 && str != null) {
					q.oper(num, str);
				} else if (db != 0 && str != null) {
					q.oper(db, str);
				}
				num = 0;
				db = 0;
				str = null;
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}

	private void oper(double db, String str) {
		// TODO Auto-generated method stub
		System.out.println(db + str);
	}

	private void oper(int num, String str) {
		// TODO Auto-generated method stub
		System.out.println(num + str);
	}

	private void oper(int num, double db) {
		// TODO Auto-generated method stub
		System.out.println(num + db);
	}
}