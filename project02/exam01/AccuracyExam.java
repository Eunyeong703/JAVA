package exam01;

public class AccuracyExam {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		// 정수형과 정수형의 연산의 결과값은 정수형으로 나타난다
		System.out.println(num1 / num2);
		
		// 실수형의 결과값을 원한다면 한쪽을 반드시 실수형으로 처리 해야 한다.
		System.out.println(num1 / (double)num2);
		System.out.println((double)num1 / num2);
		System.out.println((double)num1 / (double)num2);
		
		System.out.println(num1 / 3);
		System.out.println(num1 / 3.0);
		System.out.println((double)num1 / 3);
		System.out.println(num1 / 3f);
	}
}
}
