package exam02;

class Test {
	int hand = 2;
}
public class Main {
	public static void main(String[] args) {
		Exam02 e = new Exam02();
		e.footString();
		// 객체 이름.상수형 변수
		System.out.println(e.FOOT);
		// 클래스 이름.상수형 변수
		System.out.println(Exam02.FOOT);
		
		e.handString();
		System.out.println(e.HAND);
		System.out.println(Exam02.HAND);
		
		Test t = new Test();
		System.out.println(t.hand);
		// 일반 변수는 객체. 변수는 나올 수 있지만 클래스 이름.변수 이름은 나오지 않는다.
		// System.out.println(Test.hand);
	}
}
