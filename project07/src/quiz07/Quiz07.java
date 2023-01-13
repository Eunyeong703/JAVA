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
			System.out.println("1. 정수 입력");
			System.out.println("2. 실수 입력");
			System.out.println("3. 문자열 입력");
			System.out.println("4. 연산");
			System.out.println("0. 종료");
			System.out.print("선택 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("정수 입력 : ");
				num = sc.nextInt();
				break;
			case 2:
				System.out.print("실수 입력 : ");
				db = sc.nextDouble();
				break;
			case 3:
				System.out.print("문자열 입력 : ");
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
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
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