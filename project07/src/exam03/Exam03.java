package exam03;

public class Exam03 {
	public static void main(String[] args) {
		Test t1 = new Test();
		
		// 캡슐화를 하지 않으면, 다른 클래스의 객체의 데이터를 마음대로 변경할 수 있다.
		// t1.num = 100;
		// t1.str = "홍길동";
		
		// System.out.println(t1.num);
		// System.out.println(t1.str);
		
		// 위와 같은 문제 때문에, 캡슐화를 한다.
		// 캡슐화란?
		// - 객체의 필드, 메서드를 하나도 묶고, 실제 구현 내용을 감추는 것을 의미한다.
		// - 외부 객체에서 객체 내부를 알지 못하며, 객체가 노출에 제공하는 필드와 메서드만 이용하도록 만든다.
		// - 외부의 잘못된 사용으로 인해 객체에 문제가 생기는 것을 방지한다.
		// - 캡슐화하면 직접 데이터에 접근이 불가능하다.
		// - 데이터에 접근할 수 있는 메서드를 만들어서 처리한다. (Getter/Setter)
		
		// - Getter 메서드는 값을 내보내주는 메서드
		// - Setter 메서드는 값을 저장하는 메서드
		
		t1.setNum(10);
		t1.setStr("홍길동");
		
		System.out.println(t1.getNum());
		System.out.println(t1.getStr());
	}
}
