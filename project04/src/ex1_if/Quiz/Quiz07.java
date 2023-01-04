package ex1_if.Quiz;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
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
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println(name + "님의 출생지는 서울권입니다.");
		} else if(num==2) {
			System.out.println(name + "님의 출생지는 경기도권입니다.");
		} else if(num==3) {
			System.out.println(name + "님의 출생지는 강원도권입니다.");
		} else if(num==4) {
			System.out.println(name + "님의 출생지는 충청도권입니다.");
		} else if(num==5) {
			System.out.println(name + "님의 출생지는 경상도권입니다.");
		} else if(num==6) {
			System.out.println(name + "님의 출생지는 전라도권입니다.");
		} else if(num==7) {
			System.out.println(name + "님의 출생지는 제주도권입니다.");
		} 	else {
			System.out.println("잘못된 지역 선택 입니다.");
			
			
			int select  = sc.nextInt();
			
			String locale = null;
			if(select == 1) {
				locale = "서울";
			} else if(select == 2) {
				locale = "경기도권";
			} else if(select == 3) {
				locale = "강원도권";
			} else if(select == 4) {
				locale = "충청도권";
			} else if(select == 5) {
				locale = "경상도권";
			} else if(select == 6) {
				locale = "전라도권";
			} else if(select == 7) {
				locale = "제주도권";
				
			if(locale !=null) {
				System.out.println(name + "님의 출생지는 " + locale
						 + "입니다.");
			} else {
				System.out.println("잘못된 지역 선택 입니다.");
			}
				
			}
	
		}
}
}