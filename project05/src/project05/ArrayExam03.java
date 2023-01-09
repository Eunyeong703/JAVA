package project05;

import java.util.Scanner;

public class ArrayExam03 {
	public static void main(String[] args) {
		// 배열에서 int 형은 값을 넣지 않으면 0으로 초기화 되어있다.
		int arr[] = new int[5];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// 배열에서 double 형도 0으로 자동 초기화 되어 있다.
		double db[] = new double[3];
		System.out.println(db[0]);
		System.out.println(db[1]);
		System.out.println(db[2]);
		
		// 배열에서 char 형도 0으로 자동 초기화 되어 있다.
		char ch[] = new char[3];
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		
		// 배열에서 boolean 형은 false로 자동 초기화 되어 있다.
		boolean bl[] = new boolean[3];
		System.out.println(bl[0]);
		System.out.println(bl[1]);
		System.out.println(bl[2]);
		
		// 배열에서 String은 null 값으로 되어 있다.
		String st[] = new String[3];
		System.out.println(st[0]);
		System.out.println(st[1]);
		System.out.println(st[2]);
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
}
