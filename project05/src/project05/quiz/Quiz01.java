package project05.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("������ ���� �� �Է� : ");
			int space = sc.nextInt();
			
			int arr[] = new int[space];

			for(int i=0; i<space; i++) {
				System.out.print((i+1) + "��° ���� �Է� : ");
				arr[i] = sc.nextInt();
			}
			for(int i=0; i<space; i++) {
				System.out.println(arr[i]);
			}
	}
}
