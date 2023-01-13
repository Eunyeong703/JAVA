package quiz06;

import java.util.Scanner;

public class MainService {
	Scanner sc = new Scanner(System.in);
	
	public int inwonNum(String sub) {
		System.out.print("저장할 " + sub + " 인원 입력 : ");
		int num = sc.nextInt();
		return num;
	}
}