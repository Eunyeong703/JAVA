package quiz02;

public class FruitMain {
	public static void main(String[] args) {
		
	FruitService fs = new FruitService();
	Fruit[] fruit = new Fruit[5];
	
	while(true) {
		int menu = fs.menu();

		switch(menu) {
		case 1:
			fs.input(fruit);
			break;
		case 2:
			fs.output(fruit);
			break;
		case 3:
			fs.modify(fruit);
			break;
		case 4:
			fs.delete(fruit);
			break;
		case 0:
			System.out.println("프로그램을 종료합니다.");
			return;
		default:
			System.out.println("잘못된 선택입니다.");
			}
		}
	}
}
