package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExam03 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도 입력 : ");
		int year = Integer.parseInt(in.readLine());
		
		// BufferedReader에서 int를 사용하기 위해 사용하는 Integer.parseInt
		
		System.out.print("태어난 년도 입력 : ");
		int birth = Integer.parseInt(in.readLine());
		
		System.out.println("당신의 나이는 " + (year-birth + 1) + "살 입니다.");
	}
}
