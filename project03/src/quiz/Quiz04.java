package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz04 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = Integer.parseInt(in.readLine());
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = Integer.parseInt(in.readLine());
		
		System.out.println("두 정수의 합은 : " + (num1 + num2));
		
		
		System.out.print("당신의 나이는? : ");
		int birth = Integer.parseInt(in.readLine());
		
		System.out.println("당신이 태어난 년도는 : " + (2023 - birth));
	}

}
