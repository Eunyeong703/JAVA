package project05;

import java.util.Scanner;

public class ArrayExam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		

		// �迭�� ũ�⸦ �˷��ִ� �޼���
		System.out.println(arr.length);

		// �ε����� ���� �ϴ� ������ �ʿ��ϴ�.
		int idx = 0;
	
		while(true) {
			System.out.println("1. �Է�");
			System.out.println("2. ���");
			System.out.print("���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				if(idx == arr.length) {
					System.out.println("������ ������ϴ�.");
				} else {
					System.out.println("�Է�");
					System.out.print((idx+1)+"��° ���� �Է� : ");
					arr[idx] = sc.nextInt();
					idx++;
				}
				break;
			case 2:
				System.out.println("���");
				if(idx == 0) {
					System.out.println("����� �����Ͱ� �����ϴ�.");
				} else {
					for(int i=0;i<idx;i++) {
						System.out.println(arr[i]);
					}
				}
				break;
			}
		}
	}
}
