package ex1_if.Quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.");
		int num = sc.nextInt();
		
		if(num%3 == 0) {System.out.println("3의 배수입니다.");
		} 
		else if(num%5 == 0) {System.out.println("5의 배수입니다.");
		}
		else {System.out.println("3과 5의 배수가 아닙니다.");
		}
	}
}
