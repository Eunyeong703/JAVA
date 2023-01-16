package quiz03;

public class AddressMain {
	public int start(Address[] address, int idx) {
		// TODO Auto-generated method stub
		AddressService as = new AddressService();
		
		while(true) {
			int menu = as.menu(); 
			
			switch(menu) {
			case 1:
				idx = as.input(address, idx);
				break;
			case 2:
				as.output(address, idx);
				break;
			case 0:
				System.out.println("메인메뉴로 돌아갑니다.");
				return idx;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}