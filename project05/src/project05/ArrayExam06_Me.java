package project05;

import java.util.Scanner;

public class ArrayExam06_Me {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5]; // ������ �� 5���� �����ϴ� �迭 ����
		
		// �迭�� ũ�⸦ �˷��ִ� �޼��� arr.length
		System.out.println(arr.length);
		
		// �ε����� �����ϴ� ���� �ʿ���
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
					System.out.println((idx+1) + "��° ���� �Է� : ");
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
