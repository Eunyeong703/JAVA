package quiz01;

import java.util.Scanner;

public class UserService implements ServiceImpl {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		return sc.nextInt();
	}

	@Override
	public int input(Object[] obj, int idx) {
		// TODO Auto-generated method stub
		if(idx == 5) {
			System.out.println("저장할 공간이 없습니다.");
		} else {
			User u = new User();
			System.out.print("아이디 입력 : ");
			u.setId(sc.next());
			System.out.print("암호 입력 : ");
			u.setPwd(sc.next());
			
			obj[idx] = u;
			idx++;
		}
		return 0;
	}

	@Override
	public void output(Object[] obj, int idx) {
		// TODO Auto-generated method stub
		if(idx == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			User[] u = (User[]) obj;
			for(int i=0;i<idx;i++) {
				System.out.println("아이디 : " + u[i].getId());
				System.out.println("암호 : " + u[i].getPwd());
			}
		}
	}
}
