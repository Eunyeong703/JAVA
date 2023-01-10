package method;

public class MethodExam03 {
		// 1. 반환형이 없고 매개변수도 없는 메서드
	public static void test1() { // void는 반환형이 없다는 뜻
		// 반환형이 없으면 void 처리를 하지만 매개변수가 없으면 생략
		// 일반적인 출력에 많이 사용한다.
		System.out.println("test1() 메서드 실행");
	}
	
	public static int test2() { // 반환형이 있다 : 특정 데이터를 넘겨주겠다.
		// 2. 반환형이 있고 매개변수가 없는 메서드
		// 반환형의 데이터 타입은 모든 데이터 타입이 가능하다
		// return으로 전달할 수 있는 데이터는 타입과 상관없이 "하나의" 데이터만 가능하다.
		// 배열을 사용하면 3개의 값을 보낸다고 생각할 수 있겠지만 배열 하나를 보낸 것.
		// 메뉴부터 메뉴 선택과 같이 하나의 데이터를 처리하고 넘겨 받을 때 사용한다.
		return 10; // 전달할 때 사용하는 키워드
	}
	
	public static void test3(int num1, int num2) { // int num : 매개변수가 있기 때문에 써둠
		// test3(int num1 = 0, int num2 = 20)
		// 3. 반환형은 없고 매개변수가 있는 메서드
		// 매개변수는 모든 데이터 타입이 가능하고 여러개의 데이터를 넘겨줄 수 있다.
		// 매개변수는 호출한 메서드의 값을 복사해서 매개변수에 저장한다.
		// 연산 후 출력할 때, 특정 데이터를 출력
		System.out.println(num1 + num2);
	}
	
	public static int test4(int num1, int num2) {
		// 4. 반환형도 있고 매개변수가 있는 메서드
		return num1+num2;
	}
	
	public static void main(String[] args) {
		// static 은 static 있는 메서드만 호출 가능하다.
		// static : 공동의 의미를 가지고 있으면 프로그램 시작시에 메모리에 올라간다.

		// method 종류
		// 1. 반환형이 없고 매개변수도 없는 메서드
		// 2. 반환형이 있고 매개변수가 없는 메서드
		// 3. 반환형은 없고 매개변수가 있는 메서드
		// 4. 반환형도 있고 매개변수도 있는 메서드
		
		System.out.println("main()에서 test1() 메서드 호출");
		test1(); // 메서드는 변수와 구분짓기 위하여 ()이 꼭 필요하다.
		System.out.println("main() 메서드 복귀");
		
		System.out.println();
		
		System.out.println("main()에서 test2() 메서드 호출");
		int test2 = test2(); // 메서드는 변수와 구분짓기 위하여 ()이 꼭 필요하다.
		System.out.println(test2);
		System.out.println("main() 메서드 복귀");
		
		System.out.println();
		System.out.println("main()에서 test3() 메서드 호출");
		test3(10,20); 
		System.out.println("main() 메서드 복귀");
		
		System.out.println();
		System.out.println("main()에서 test4() 메서드 호출");
		int test4 = test4(10,20); 
		System.out.println(test4);
		System.out.println("main() 메서드 복귀");
	}
}
