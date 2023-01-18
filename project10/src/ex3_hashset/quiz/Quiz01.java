package ex3_hashset.quiz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<String> id = new HashSet<String>();
		
		while(true) {
			System.out.println("1. 아이디 입력");
			System.out.println("2. 아이디 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("아이디 입력 : ");
				String inputId = sc.next();
				
				if(id.add(inputId)) {
					System.out.println("가입이 되었습니다.");
				} else {
					System.out.println("같은 아이디가 존재합니다.");
				}
				break;
			case 2:
				System.out.println("### 아이디 리스트 ###");
				for(String s : id) {
					System.out.println(s);
				}
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
			System.out.println();
		}
	}
}
