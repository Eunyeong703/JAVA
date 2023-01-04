package quiz;

import java.io.IOException;

public class Quiz02 {
	public static void main(String[] args) throws IOException {
		System.out.print("첫번째 수를 입력하세요. : ");
		int num1 = System.in.read() -48;
				
		System.in.read();
		System.in.read();
		
		System.out.print("두번째 수를 입력하세요. : ");
		int num2 = System.in.read() -48;		
		System.out.println("두 숫자의 합은 "+ (num1 + num2) + " 입니다.");
		
		System.in.read();
		System.in.read();
		
		System.out.print("백 단위 숫자를 입력하세요. : ");
		char su1 = (char)System.in.read();
		char su2 = (char)System.in.read();
		char su3 = (char)System.in.read();
		
		System.out.println("입력된 수 : " + su1 + su2 + su3);
		
		System.in.read();
		System.in.read();
		
		System.out.print("백 단위 숫자를 입력하세요. : ");
		int n1 = (System.in.read() - 48) * 100;
		int n2 = (System.in.read() - 48) * 10;
		int n3 = System.in.read() - 48;
		
		int result = n1 + n2 + n3;
		System.out.println("입력된 수 : " + result);
		}
}
