package exam01;

public class Banana extends Fruit{
	// 추상화 클래스는 미완성설계도라고 했다. 
	// 추상화 클래스를 상속받은 자식 클래스는 반드시 추상메서드를 완성해야 한다.
	@Override // 부모클래스의 메서드를 자식클래스가 원하는대로 변경하는 것을 의미한다.
	public int getPrice() {
		// TODO Auto-generated method stub
		return 1000;
	}
}