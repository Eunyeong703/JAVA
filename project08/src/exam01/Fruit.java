package exam01;

// 추상메서드가 하나라도 존재하면 추상클래스로 변경해야 한다.
public abstract class Fruit {
	int price;

	// 추상 클래스에는 반드시 추상메서드가 필요하다.
	// 추상메서드는 선언부만 존재한다.
	// 추상화에 키워드 abstract 이다.
	public abstract int getPrice();
}