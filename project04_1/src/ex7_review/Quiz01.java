package ex7_review;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ���.");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ������ �Է��ϼ���.");
		int num2 = sc.nextInt();
		
		while(true) {
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("3. ���ϱ�");
		System.out.println("4. ������");
		
		System.out.print("\n���ϴ� ������ ������ .");
		int select = sc.nextInt();
		
		if(select==1) {
			System.out.println("���ϱ� : " + (num1 + num2));
		} 
		else if(select==2) {
			System.out.println("���� : " + (num1 - num2));
		}
		else if(select==3) {
			System.out.println("���ϱ� : " + (num1 * num2));
		}
		else if(select==4) {
			System.out.println("������ : " + (num1 / (double)num2));
		}
		
		switch(select) {
		case 1:
			System.out.println("���ϱ� : " + (num1 + num2));
			break;
		case 2:
			System.out.println("���� : " + (num1 - num2));
			break;
		case 3:
			System.out.println("���ϱ� : " + (num1 * num2));
			break;
		case 4:
			System.out.println("������ : " + (num1 / (double)num2));
			break;
		}
		}
	}
}
