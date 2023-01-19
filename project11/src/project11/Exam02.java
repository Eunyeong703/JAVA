package project11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		
			// try ~ catch 문을 이용하면 프로그램이 종료되지 않는다.
		try {
			// 예외가 발생하지 않았을 때
			System.out.print("정수 입력 : ");
			num1 = sc.nextInt();
		} catch (InputMismatchException ime) { // catch(예외 종류 설정) 
			// 예외가 발생했을 때
			// InputMismatchException은 입력된 데이터 타입과 저장할 변수의 데이터 타입이 다를 때 발생한다.
			System.out.println("숫자만 입력 가능합니다.");
		} finally {
			// try ~ catch문이 종료될 때
			// 예외가 발생하건 발생하지 않건 무조건 실행된다.
			System.out.println("try ~ catch문 종료");
		}
		System.out.println(num1);
	}
}
