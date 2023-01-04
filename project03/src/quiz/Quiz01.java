package quiz;

import java.io.IOException;

public class Quiz01 {
	public static void main(String[] args) throws IOException {
		System.out.print("첫번째 이니셜 입력 : ");
		char first = (char) System.in.read();
		
		System.in.read();
		System.in.read();
		
		System.out.print("두번째 이니셜 입력 : ");
		char second = (char) System.in.read();
		
		System.in.read();
		System.in.read();
		
		System.out.print("세번째 이니셜 입력 : ");
		char third = (char) System.in.read();
		
		System.out.println("당신의 이니셜은?" + 
		first + second + third + "입니다.");
		System.in.read();
		System.in.read();
		
		System.out.print("이니셜 입력 : ");
		char a = (char)System.in.read();
		char b = (char)System.in.read();
		char c = (char)System.in.read();

		System.out.println("이니셜은 "+a+b+c+" 입니다.");
		
	}
}
