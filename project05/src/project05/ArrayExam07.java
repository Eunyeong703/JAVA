package project05;

import java.util.Scanner;

public class ArrayExam07 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		if(num1 == num2) {
			System.out.println("�μ��� �����ϴ�.");
		} else {
			System.out.println("�μ��� �ٸ��ϴ�");
		}
		
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		if(str1 == str2) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String str3 = sc.next();
		
		if(str1 == str3) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
		
		String str4 = new String("ȫ�浿");
		if(str1 == str4) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
		
		if(str3.equals(str4)) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
		
		String str5 = "10";
		String str6 = "1.1234";
		
		double aaa = Double.parseDouble(str6);
		
		if(num1 == Integer.parseInt(str5)) {
			System.out.println("�� ���� �����ϴ�.");
		} else {
			System.out.println("�� ���� �ٸ��ϴ�.");
		}
	}
}
