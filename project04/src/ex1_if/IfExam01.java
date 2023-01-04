package ex1_if;

public class IfExam01 {
	public static void main(String[] args) {
		// if문 : 조건식의 참과 거짓에 의해서 실행 조건이 만들어짐.
		// 조건식이 참이면 실행하고 거짓이면 실행하지 않는다.
		int num1 = 10;
		int num2 = 5;
		
		// 형식 : if(조건){실행한 문장}
		if(num1 > num2) {
			System.out.println("num1이 크다");
		}
		
		if(num2 > num1) {
			System.out.println("num2가 크다");
		}
		
		// boolean 자료형의 값을 사용
		boolean b = true;
		if(b) {
			System.out.println("b는 true 값이다.");
		}
		
		if(b==false) {
			System.out.println("b는 false 값이다.");
		}
	}
}
