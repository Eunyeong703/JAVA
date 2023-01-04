package ex2_switch;

import java.util.Scanner;

public class SwitchExam01 {
	public static void main(String[] args) {
		// switch ~ case문 
		// 변수의 값과 연산값에 의해서 실행할 문장을 case 만드는 것.
		// if문보다 빠르지만 조건을 단순하게 처리해야 한다.
		// ﻿메뉴 선택 출력에 많이 사용된다.
		
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.println("### 출생 지역 선택 ###");
		System.out.println("1. 서울");
		System.out.println("2. 경기도권");
		System.out.println("3. 강원도권");
		System.out.println("4. 충청도권");
		System.out.println("5. 경상도권");
		System.out.println("6. 전라도권");
		System.out.println("7. 제주도권");

		System.out.print("출생지역 선택(숫자) : ");
		int select = sc.nextInt();
		
		
		// 형식
		// switch(변수) {
		// case 변수값1 : 실행할 문장;
		// case 변수값2 : 실행할 문장;
		// case 변수값3 : 실행할 문장;
		// }
		
		
		
		switch(select) {
		case 1:
			System.out.println(name + "님의 출생지는 서울입니다.");
			break;
		case 2:
			System.out.println(name + "님의 출생지는 경기도권입니다.");
			break;
		case 3:
			System.out.println(name + "님의 출생지는 강원도권입니다.");
			break;
		case 4:
			System.out.println(name + "님의 출생지는 충청도권입니다.");
			break;
		case 5:
			System.out.println(name + "님의 출생지는 경상도권입니다.");
			break;
		case 6:
			System.out.println(name + "님의 출생지는 전라도권입니다.");
			break;
		case 7:
			System.out.println(name + "님의 출생지는 제주도권입니다.");
			break;
		default :
			// default는 if문의 else와 같은 기능을 한다.
			System.out.println("잘못된 지역 선택입니다.");
		}
		
	}
}
