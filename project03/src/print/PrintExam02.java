package print;

public class PrintExam02 {
	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		System.out.println("num의 값은 " + num + " 입니다");
		// + 연산자는 두 문자열을 연결하는 연산자.
		// 변수의 형식을 지정하여 출력할 위치를 설정할 수 있다.

		// 이때 %d는 정수형 데이터 출력 형식이고 변수의 데이터 타입이 같아야 한다.
		System.out.printf("num의 값은 %d 입니다.", num);

		// System.out.println(); 을 사용하면 한 칸 내림이 실행된다.
		System.out.println();


		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		// 변수 또는 값에 순서대로 출력된다.
		System.out.printf("%d %d %d", num1, num2, num3);
		System.out.println();

		// 출력할 데이터의 갯수가 적으면 출력할 때 에러가 발생한다.
		// System.out.printf("%d %d %d %d", num1, num2, num3);

		System.out.printf("%d %d", num1, num2, num3);
		System.out.println();
		System.out.printf("%d %d", 100, 200);
	}
}
