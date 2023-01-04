package operator;

public class OperatorExam04 {
	public static void main(String[] args) {
		// 비교 연산자 : 결과값이 논리형 데이터 (true/false)

		int num1 = 10;
		int num2 = 10;
		int num3 = 5;
		int num4 = 15;

		// == : 같다
		System.out.println(num1 == num2);
		System.out.println(num1 == num3);
		
		// != : 다르다
		System.out.println(num1 != num2);
		System.out.println(num1 != num3);
		
		// > : 크다 (초과)
		System.out.println(num1 > num2);
		System.out.println(num1 > num3);
		System.out.println(num4 > num1);
		
		// < : 작다 (미만)
		System.out.println(num1 < num2);
		System.out.println(num1 < num3);
		System.out.println(num1 < num4);
		
		// >= 크거나 같다 (이상)
		System.out.println(num1 >= num2);
		System.out.println(num1 >= num3);
		System.out.println(num1 >= num4);
		
		// <= : 작거나 같다 (이하)
		System.out.println(num1 <= num2);
		System.out.println(num1 <= num3);
		System.out.println(num1 <= num4);

		// 주의할 점 : => =<등으로 사용하면 에러 발생. 기호는 순서를 맞추어 써주어야 함
	}

}
