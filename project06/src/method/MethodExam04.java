package method;

import java.util.Scanner;

public class MethodExam04 {
	// Ŭ���� ���� - Ŭ�������� ��� �޼������ ����� �� �ִ� ����
	// Ŭ���� ������ �޼��� ������ �̸��� �ߺ� �����ϴ�.
	static Scanner sc = new Scanner(System.in);

	public static void title() {
		System.out.println("##############");
		System.out.println("#### ���� ####");
		System.out.println("##############");
	}
	
	public static int menu() {
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("3. ���ϱ�");
		System.out.println("4. ������");
		System.out.println("0. ���α׷� ����");
		System.out.print("�޴� ���� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public static int input(String str) {
		System.out.print(str + " ���� �Է� : ");
		int num1 = sc.nextInt();
		return num1;
	}
	public static void main(String[] args) {
		// �޼��� �������� ���� �̸��� ���� ����� �Ұ����ϴ�.
		while(true) {
			title();
			int menu = menu();

			int num1 = 0;
			int num2 = 0;
			
			if(menu > 0 && menu < 4) {
				num1 = input("ù��°");
				num2 = input("�ι�°");
			}
			switch(menu) {
			case 1:
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
				break;
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
				break;
			case 3:
				System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
				break;
			case 4:
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}
}
