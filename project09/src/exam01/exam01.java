package exam01;

class Test{
	// static : 공통으로 사용되는 변수나 메서드에 사용되는 키워드
	static int idx = 0;	
	// final : 고정 값을 갖는 변수에 사용되는 키워드
	// 반드시 선언과 동시에 초기화를 해주어야 함
	final double pi = 3.14;
	// 값을 변경할 수 없다.
	// pi = 3.141592;
	
	// public static final : 상수형 변수
	// 상수 : 특정되는 값을 의미한다. ex) 숫자 1, '가', 'A' 등
	// 변수 : 변할 수 있는 값을 의미한다. ex) int num = 10; num = 20;
	// 모두가 사용할 수 있는 상수값을 변수에 넣어 값이 변하지 않도록하는 것
	// 상수형 변수의 변수 이름을 모두 대문자로 하는 것이 관례
	
	public static final double PI = 3.14;
}

public class exam01 {
	public static void main(String[] args) {
		System.out.println(Test.idx);
		Test.idx = 10;
		System.out.println(Test.idx);
	}
}
