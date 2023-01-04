package operator;

public class OperatorExam07 {
	public static void main(String[] args) {
		// 삼항 연산자
		// 특정 조건 ? 참일 때 실행 : 거짓일 때 실행;
		int num1 = 10;
		int num2 = 10;
		String result = "";
		
		result = num1 > num2 ? "참입니다." : "거짓입니다.";
		System.out.println(result);
	}
}
