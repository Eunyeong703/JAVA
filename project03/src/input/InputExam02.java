package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputExam02 {
	public static void main(String[] args) throws IOException {
		// 문자열을 입력받는 방법 : BufferedReader, Scanner
		// 자바에서는 Scanner를 주로 사용한다.
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("문자열 입력 : ");
		// BufferedReader는 데이터 타입이 문자열이다.
		String str = in.readLine();
		
		System.out.println("입력 받은 문자열 : " + str);
		
		System.out.print("두번째 문자열 : ");
		String str1 = in.readLine();
		System.out.println("두번째 문자열 : " + str1);
	}

}
