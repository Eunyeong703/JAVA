package project11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		try {
			System.out.print("정수 입력 : ");
			num1 = sc.nextInt();
			System.out.print("정수 입력 : ");
			num2 = sc.nextInt();
			// 자바에서는 나눗셈을 할 때 0으로 나누면 예외가 발생한다.
			System.out.println(num1 / num2);
		} catch (InputMismatchException ime) { 
			// catch문은 여러 종류의 예외를 처리할 수 있다.
			System.out.println("숫자만 입력 가능합니다.");
		} catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
			// finally는 생략 가능
		} catch(Exception e) { // 가장 큰 예외. 따라서 맨 위에 있으면 안 됨.
			System.out.println("문제가 발생했습니다.");
			e.printStackTrace();
		}
	}
}