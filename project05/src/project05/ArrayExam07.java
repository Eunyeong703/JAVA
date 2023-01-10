package project05;

import java.util.Scanner;

public class ArrayExam07 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		if(num1 == num2) {
			System.out.println("두수는 같습니다.");
		} else {
			System.out.println("두수는 다릅니다");
		}
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		if(str1 == str2) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String str3 = sc.next();
		
		if(str1 == str3) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}
		
		String str4 = new String("홍길동");
		if(str1 == str4) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}
		
		if(str3.equals(str4)) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}
		
		String str5 = "10";
		String str6 = "1.1234";
		
		double aaa = Double.parseDouble(str6);
		
		if(num1 == Integer.parseInt(str5)) {
			System.out.println("두 수가 같습니다.");
		} else {
			System.out.println("두 수가 다릅니다.");
		}
	}
}
