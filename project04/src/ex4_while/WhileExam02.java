package ex4_while;

import java.util.Scanner;

public class WhileExam02 {
	public static void main(String[] args) {
		// while문에서 무한 반복을 하는 방법
		// 1. 조건에 true값 넣기
		
		int i = 0;
		while(true) { // for문과 마찬가지로 조건이 false일 때 종료
			System.out.println(i);
			if(i==10) {
				break; // break : switch, for, while
			}
			i++;
		}
		
		// 2. 논리형 자료형 boolean 사용
		boolean b = true;
		int cnt = 1;
		while(b) {
			System.out.println("a");
			cnt++;
			if(cnt==5){
				b = false;
			}
		}
		
		// 3. 특정 조건에 종료
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while(menu != 100) {
			System.out.print("번호 입력 : ");
			menu = sc.nextInt();
		}
		
		while(!(menu == 100)) {
			// ! : true면 false로, false면 true로 반전
			System.out.print("번호 입력 : ");
			menu = sc.nextInt();
		}
	}
}
