package project05.quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력할 갯수 : ");
		int space = sc.nextInt();
		
		String name[] = new String[space];
		
		for(int i=0; i<space; i++) {
			System.out.print("이름 입력 : ");
			name [i] = sc.next();
		}
		
		for(int i=0; i<space; i++) {
			System.out.println("이름 : "+ name[i]);
		}
	}
}
