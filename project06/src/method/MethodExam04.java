package method;

import java.util.Scanner;

public class MethodExam04 {
	// 클래스 변수 - 클래스내의 모든 메서드들이 사용할 수 있는 변수
	// 클래스 변수와 메서드 변수의 이름은 중복 가능하다.
	static Scanner sc = new Scanner(System.in);

	public static void title() {
		System.out.println("##############");
		System.out.println("#### 계산기 ####");
		System.out.println("##############");
	}
	
	public static int menu() {
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public static int input(String str) {
		System.out.print(str + " 정수 입력 : ");
		int num1 = sc.nextInt();
		return num1;
	}
	public static void main(String[] args) {
		// 메서드 내에서는 같은 이름의 변수 사용이 불가능하다.
		while(true) {
			title();
			int menu = menu();

			int num1 = 0;
			int num2 = 0;
			
			if(menu > 0 && menu < 4) {
				num1 = input("첫번째");
				num2 = input("두번째");
			}
			switch(menu) {
			case 1:
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
				break;
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
				break;
			case 3:
				System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
				break;
			case 4:
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
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
