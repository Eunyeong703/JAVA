package exam02;

public interface ExamInterface {
	// 멤버 변수는 상수만 가능
	public static final int FOOT = 2;
	// 멤버 변수의 public static final이 생략되어도 자동으로 public static final처리 한다.
	int HAND = 2;
	
	// 멤버 변수는 추상 메서드만 가능
	// 추상 메서드는 상속받은 클래스는 반드시 구현해주어야 한다.
	public abstract void footString();
	
	// public abstract를 생략해도 자동으로 public abstract있는 것으로 처리
	void handString();
}
