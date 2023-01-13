package exam11;

// 하나의 자바페이지 안에 여러개의 class 넣을 수 있다. 하지만 public 가지는 클래스 하나만 가능하다.
class Parent{
	int a = 10;
	int b = 20;
}

class Child extends Parent{
	int c = 30;
	public void output() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}
}

public class Exam11 {
	public static void main(String[] args) {
		// up_casting
		// - 부모 클래스가 자식 클래스를 이용하여 객체를 생성할 수 있다.
		// - 형변환 없이 자동으로 변환된다.
		// - up_casting을 할 경우, 부모 클래스가 가진 것만 사용할 수 있다.
		Parent p1 = new Child();
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		p1.a = 100;
		p1.b = 200;
		
		// down_casting
		// - 자식 클래스가 부모 클래스를 이용하여 객체를 생성할 수 있다.
		// - 반드시 형변환을 해주어야 한다.
		Child c = (Child) p1;
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		c.output();
		
		Object o = new String("홍길동");
		System.out.println(o);
		String str = (String) o;
		System.out.println(str);
		
		Object o1 = new Parent();
		Parent p2 = (Parent) o1;
		System.out.println(p2.a);
	}
}
