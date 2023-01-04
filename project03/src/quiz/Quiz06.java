package quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String str = sc.next();
		
		System.out.print("주소를 입력하세요 : ");
		String str2 = sc.next();
		
		System.out.print("이메일을 입력하세요 : ");
		String str3 = sc.next();
		
		System.out.println("이름 : " + str);
		System.out.println("나이 : " + str2);
		System.out.println("이메일 : " + str3);
		
		sc.close();
	}
	
}
