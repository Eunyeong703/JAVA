package operator;

public class OperaterExam02 {
	public static void main(String[] args) {
		// 대입 연산자
		// = : 오른쪽에 있는 식이나 값을 왼쪽의 변수에 초기화
		
		int num1 = 10;
		int num2 = 3 + 1;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
		// 배정 대입 연산자
		// += : a += b > a = a+b
		num1 += num2;
		// num1 = num1 + num2 ==> num1 = 14
		System.out.println("num1 += " + num1);
		
		// -= : a -= b ==> a = a-b
		num1 -= num2;
		System.out.println("num1 -= " + num1);
		
		// *= : a *= b ==> a = a*b
		num1 *= num2;
		System.out.println("num1 *= " + num1);
		
		// /= : a /= b ==> a = a/b
		num1 /= num2;
		System.out.println("num1 /= " + num1);
		
		// %= : a %= b ==> a = a%b
		num1 %= num2;
		System.out.println("num1 %= " + num1);
	}

}
