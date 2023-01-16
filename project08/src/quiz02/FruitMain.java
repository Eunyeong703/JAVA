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
			System.out.println("���α׷��� �����մϴ�.");
			return;
		default:
			System.out.println("�߸��� �����Դϴ�.");
			}
		}
	}
}
