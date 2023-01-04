package operator_quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력하세요. 남자는 1, 여자는 2.");
		int num1 = sc.nextInt();
		
		System.out.print("성인 여부를 입력하세요. 성인은 1, 미성년자는 2.");
		int num2 = sc.nextInt();
		
		System.out.print("나이를 숫자로 입력하세요.");
		int num3 = sc.nextInt();
		
		System.out.println("군 입대 대상자" + (num1==1 && num2==1));
		System.out.println("술 담배 구입 대상자" + 
		(num1==1 && num2==1 || num1==2 && num2==1));
		System.out.println(60>=num3 && num3>=20);
		
		
	}
}
