package quiz08;

class Fruit {
	String fName;
	int price;
	int amount;
	
	public void output() {
	}
}

class Banana extends Fruit{
	String fName = "바나나";
	int price = 1000;
	int amount = 10;
	public void output() {
		System.out.println("과일 이름 : " + fName);
		System.out.println("가격 : " + price);
		System.out.println("갯수 : " + amount);
	}
}

class Apple extends Fruit{
	String fName = "사과";
	int price = 1500;
	int amount = 5;
	public void output() {
		System.out.println("과일 이름 : " + fName);
		System.out.println("가격 : " + price);
		System.out.println("갯수 : " + amount);
	}
}

class Orange extends Fruit{
	String fName = "오렌지";
	int price = 2000;
	int amount = 20;
	public void output() {
		System.out.println("과일 이름 : " + fName);
		System.out.println("가격 : " + price);
		System.out.println("갯수 : " + amount);
	}
}
public class Main {
	public static void main(String[] args) {
		Fruit f1 = new Banana();
		f1.output();
		
		Fruit f2 = new Apple();
		f2.output();
		
		Fruit f3 = new Orange();
		f3.output();
		
		Fruit[] fList = new Fruit[3];
		
		fList[0] = new Banana();
		fList[1] = new Apple();
		fList[2] = new Orange();
		
		for(int i=0;i<3;i++) {
			fList[i].output();
		}
	}
}