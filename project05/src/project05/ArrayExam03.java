package project05;

import java.util.Scanner;

public class ArrayExam03 {
	public static void main(String[] args) {
		// �迭���� int ���� ���� ���� ������ 0���� �ʱ�ȭ �Ǿ��ִ�.
		int arr[] = new int[5];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// �迭���� double ���� 0���� �ڵ� �ʱ�ȭ �Ǿ� �ִ�.
		double db[] = new double[3];
		System.out.println(db[0]);
		System.out.println(db[1]);
		System.out.println(db[2]);
		
		// �迭���� char ���� 0���� �ڵ� �ʱ�ȭ �Ǿ� �ִ�.
		char ch[] = new char[3];
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		
		// �迭���� boolean ���� false�� �ڵ� �ʱ�ȭ �Ǿ� �ִ�.
		boolean bl[] = new boolean[3];
		System.out.println(bl[0]);
		System.out.println(bl[1]);
		System.out.println(bl[2]);
		
		// �迭���� String�� null ������ �Ǿ� �ִ�.
		String st[] = new String[3];
		System.out.println(st[0]);
		System.out.println(st[1]);
		System.out.println(st[2]);
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("���� �Է� : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
}
