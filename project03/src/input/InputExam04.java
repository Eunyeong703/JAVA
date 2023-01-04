package input;

import java.util.Scanner;

public class InputExam04 {
	public static void main(String[] args) {
		// 자바에서 제일 많이 사용하는 input 클래스 : Scanner
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력 : Scanner.next();
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		// 정수 입력 : Scanner.nextInt();
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//실수 입력 : Scanner.next.double();
		System.out.print("실수 입력 : ");
		double db = sc.nextDouble();
		
		System.out.println(str + ", " + num + ", " + db);

	}

}
