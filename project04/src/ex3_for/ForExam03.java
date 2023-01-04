package ex3_for;

import java.util.Scanner;

public class ForExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 특정한 for문을 종료시키고자 할 때 라벨링을 사용할 수 있다.
		first : for(int i=0;i<100;i++) {
			System.out.println("첫번째 for문");
			second : for(int j=0;j<100;j++) {
				System.out.println("두번째 for문");
				third : for(int k=0;k<100;k++) {
					System.out.println("세번째 for문");
					System.out.println("1. 첫번째 for문 종료");
					System.out.println("2. 두번째 for문 종료");
					System.out.println("3. 세번째 for문 종료");
					System.out.print("선택 : ");
					int menu = sc.nextInt();
					
					switch(menu) {
					case 1:
						break first;
					case 2:
						break second;
					case 3:
						break third;
					}
			}
		}
	}
}
}