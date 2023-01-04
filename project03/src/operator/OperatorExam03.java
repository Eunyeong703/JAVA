package operator;

public class OperatorExam03 {
	public static void main(String[] args) {
		// 증감 연산자
		// ++ : 1씩 증가
		// -- : 1씩 감소
		
		int num = 10;
		num++;
		System.out.println(num);
		++num;
		System.out.println(num);
		num--;
		System.out.println(num);
		--num;
		System.out.println(num);
		
		// ++num : 전치 - 증가나 감소를 먼저 하고, 다음으로 진행됨
		// num-- : 후치 - 다음 진행 후, 증가나 감소
		
		System.out.println("num : " + num);
		// 10출력 후 1을 증가
		System.out.println("num++ : " + num++);
		// 위에서 출력한 11에 1을 먼저 증가 후 출력
		System.out.println("++num : " + ++num);
		
	}

}
