package quiz04;

import java.util.Scanner;

public class UserService {
	Scanner sc = new Scanner(System.in);
	
	public int userNum(){
		System.out.print("저장할 회원수 입력 : ");
		int userNum = sc.nextInt();
		return userNum;
	}
	
	public int menu() {
		System.out.println("1. 회원 입력");
		System.out.println("2. 회원 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public User1 user1Input() {
		User1 u = new User1();
		System.out.print("아이디 입력 : ");
		u.setId(sc.next());
		System.out.print("암호 입력 : ");
		u.setPwd(sc.next());
		return u;
	}
	
	public User2 user2Input() {
		User2 u = new User2();
		System.out.print("이름 입력 : ");
		u.setName(sc.next());
		System.out.print("이메일 입력 : ");
		u.setEmail(sc.next());
		return u;
	}
	
	public void output(int idx, User1[] u1, User2[] u2) {
		for(int i=0;i<idx;i++) {
			System.out.println("### " + u1[i].getId() + " ###");
			System.out.println("암호 : "  + u1[i].getPwd());
			System.out.println("이름 : "  + u2[i].getName());
			System.out.println("이메일 : " + u2[i].getEmail());
		}
	}
}