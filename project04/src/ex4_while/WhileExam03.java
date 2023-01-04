package ex4_while;

import java.util.Scanner;

public class WhileExam03 {
	public static void main(String[] args) {
		// do~while문 : 반복문
		// 종료식과 상관없이 무조건 한 번은 실행한다.
		// 오류 검출을 할 때 주로 사용한다.
		// 한 번 실행 후 종료식이 true -> 반복 / false -> 종료
		
		// 형식
		// do {
		//     실행할 문장
		// } while (조건);
		
		
		do {
			System.out.println("a");
		} while(false);
		
		Scanner sc = new Scanner(System.in);
		
		// 1~10까지의 수가 정상 범위. 정상범위의 수를 적으면 반복됨.
		int num = 0;
		do {
			System.out.print("1 ~ 10까지의 수 입력 : ");
			num = sc.nextInt();
		} while(num < 1 || num > 10);
	}
}
