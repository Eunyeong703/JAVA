package quiz06;

import java.util.Scanner;

public class MainService {
	Scanner sc = new Scanner(System.in);
	
	public int inwonNum(String sub) {
		System.out.print("������ " + sub + " �ο� �Է� : ");
		int num = sc.nextInt();
		return num;
	}
}