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
				System.out.println("���θ޴��� ���ư��ϴ�.");
				return idx;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}
}