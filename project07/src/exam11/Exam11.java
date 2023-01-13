package exam11;

// �ϳ��� �ڹ������� �ȿ� �������� class ���� �� �ִ�. ������ public ������ Ŭ���� �ϳ��� �����ϴ�.
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
		// - �θ� Ŭ������ �ڽ� Ŭ������ �̿��Ͽ� ��ü�� ������ �� �ִ�.
		// - ����ȯ ���� �ڵ����� ��ȯ�ȴ�.
		// - up_casting�� �� ���, �θ� Ŭ������ ���� �͸� ����� �� �ִ�.
		Parent p1 = new Child();
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		p1.a = 100;
		p1.b = 200;
		
		// down_casting
		// - �ڽ� Ŭ������ �θ� Ŭ������ �̿��Ͽ� ��ü�� ������ �� �ִ�.
		// - �ݵ�� ����ȯ�� ���־�� �Ѵ�.
		Child c = (Child) p1;
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		c.output();
		
		Object o = new String("ȫ�浿");
		System.out.println(o);
		String str = (String) o;
		System.out.println(str);
		
		Object o1 = new Parent();
		Parent p2 = (Parent) o1;
		System.out.println(p2.a);
	}
}
