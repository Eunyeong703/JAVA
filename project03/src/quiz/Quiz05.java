package quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요. : ");
		String str = sc.next();
		
		System.out.print("나이를 입력하세요. : ");
		int num = sc.nextInt();
		
		System.out.print("키를 입력하세요. : ");
		double db = sc.nextDouble();
		
		System.out.println("이름 : " + str);
		System.out.println("나이 : " + num);
		System.out.println("키 : " + db);
		
		System.out.printf("%s 님의 나이는 %d살이고 키는 %.2fcm 입니다.\n",
				str, num, db);
		
		System.out.println(str + "님의 나이는 " + num + "살이고 키는"
				+ db + "cm 입니다.");
	}

}
