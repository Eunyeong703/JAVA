package exam06;

public class Child extends Parent{
	String a = "Child";
	
	@Override
	// 상속 받은 메서드를 하위 클래스에 필요에 따라 바꾸는 것을 의미한다.
	public void display() {
		System.out.println("Child 클래스 입니다.");
		System.out.println(a + " 클래스");
		// this : 자기 자신의 메서드 또는 변수를 명시할 때 
		// super : 상위 객체 클래스의 메서드 또는 변수를 명시할 때
		super.display();
		System.out.println(super.a + " 클래스");
	}
}