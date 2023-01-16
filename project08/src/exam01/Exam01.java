package exam01;

public class Exam01 {
	public static void main(String[] args) {
		// 추상 클래스는 인스턴스(객체)를 생성할 수 없다.
//		Fruit f = new Fruit();
		Banana b = new Banana();
		System.out.println(b.getPrice());
	}
}
