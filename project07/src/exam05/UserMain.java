package exam05;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		UserService us = new UserService();
		int userNum = us.userNum();
		
		// 상속
		// 부모 클래스(상위 객체) : 클래스에 있는 모든 것을 자식 클래스가 사용할 수 있게 해주는 클래스
		// 자식 클래스(하위 객체) : 부모 클래스가 사용할 수 있게 해주는 내용과 자신이 가진 내용을 사용하는 클래스

		// 상속 : 상위 객체의 필드와 메서드를 하위 객체에게 물려주는 행위
		// 하위 객체는 상위 객체를 확장해서 추가적인 필드와 메서드를 가질 수 있게 된다.﻿
		
		// 상속을 하는 이유
		// - 상위 객체를 재활용해서 하위 객체를 빨리 개발할 수 있다.
		// - 반복된 코드의 중복을 줄일 수 있다.
		// - 유지 보수의 편리성을 제공한다.
		// - 객체의 다형성을 구현할 수 있다.

		// extends 키워드 뒤에 상위 객체 클래스의 이름을 입력하면 상속받을 수 있다.
		// extends 로 상속받을 수 있는 클래스는 하나이다.(두 개 이상은 안 됨)

		User2 uList[] = new User2[userNum];
		
		int idx = 0;
		while(true) {
			int menu = us.menu();
			
			switch(menu) {
			case 1:
				uList[idx] = us.user2Input();
				idx++;
				break;
			case 2:
				us.output(idx, uList);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}