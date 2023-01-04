package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz03 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("본인 이름 입력 : ");
		String str = in.readLine();
		
		System.out.print("본인 주소 입력 : ");
		String str2 = in.readLine();
		
		System.out.print("본인 나이 입력 : ");
		String str3 = in.readLine();

		System.out.println("이름: " + str 
				+ " 주소 : " + str2 + " 나이 : " + str3);
		
	}
}
