package quiz03;

import java.util.Scanner;

public class AddressService {
	Scanner sc = new Scanner(System.in);
	int idx = 0;
	
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 장소 등록");
		System.out.println("2. 장소 출력");
		System.out.println("0. 메인메뉴로");
		System.out.print("선택 : ");
		return sc.nextInt();
	}

	public int input(Address[] address, int idx) {
		// TODO Auto-generated method stub
		if(idx == 3) {
			System.out.println("더 이상 저장할 수 없습니다.");
		} else {
			address[idx] = new Address();
			System.out.print("장소명 입력 : ");
			address[idx].setName(sc.next());
			System.out.print("장소의 주소 입력 : ");
			address[idx].setAddress(sc.next());
			idx++;
		}
		return idx;
	}

	public void output(Address[] address, int idx) {
		// TODO Auto-generated method stub
		if(idx == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			for(int i=0;i<idx;i++) {
				System.out.println("장소명 : " + address[i].getName());
				System.out.println("주소 : " + address[i].getAddress());
			}
		}
	}

}