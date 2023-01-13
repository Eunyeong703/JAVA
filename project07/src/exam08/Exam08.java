package exam08;

public class Exam08 {
	public void test() {
		System.out.println("test() 호출");
	}
	public int test(int num) {
		System.out.println("test()2 호출");
		return 10;
	}
	
	public void test(double num) {
		System.out.println("test()3 호출");
	}
	
	public void test(int num1, int num2) {
		System.out.println("test()4 호출");
	}
	
	public void test(int num1, double num2) {
		System.out.println("test()5 호출");
	}
	
	public void test(double num1, int num2) {
		System.out.println("test()6 호출");
	}
	
	public static void main(String[] args) {
		// 오버라이드 : 상위 클래스에서 만들어진 메서드를 변경해서 사용하는 것
		// 오버로딩 : 같은 이름의 메서드를 사용할 수 있는 방법
		// - 같은 이름을 사용하기 위해서는 매개변수의 타입과 갯수, 순서가 달라야 한다.
		// - 반환 타입은 오버로딩의 조건이 되지 않는다(int든, void든 별개임).
		Exam08 e = new Exam08();
		
		e.test();
		e.test(10);
		e.test(1.11);
		e.test(1, 5);
		e.test(1, 1.1);
		e.test(2.4, 5);
	}
}
