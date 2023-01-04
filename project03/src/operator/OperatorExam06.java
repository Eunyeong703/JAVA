package operator;

public class OperatorExam06 {
	public static void main(String[] args) {
		// 비트 연산자 - 2진수 계산
		int num1 = 12;  // 12의 이진수값 : 1100
		int num2 = 10;  // 10의 이진수값 : 1010
		
		// and : &
		System.out.println(num1 & num2);
		// 1100
		// 1010
		// 1000 = 8이기 때문에 결과값으로 콘솔창에 8이 뜸
		
		// or : |
		System.out.println(num1 | num2);
		// 1100
		// 1010
		// 1110 = 14임
		
		// ~ : 반전 (1이면 0으로, 0이면 1로)
		System.out.println(~num1);
		// byte = -128 ~ 127
		// 원래는 -127 ~ 127(1의 보수) 인데, +0과 -0 두개의 0값이 남는다
		// -128 ~ 127(2의 보수 - 0이 하나 남는다)
		// 즉 반전하면 -값이 무조건 하나 더 붙는다고 이해하면 됨.
		
		// ^ : XOR => 둘 중에 하나만 1이면 1임
		System.out.println(num1 ^ num2);
		// 1100
		// 1010
		// 0110

	}
}
