package exam02;

public class Test {
	public static void main(String[] args) {
		// Runnable을 상속받은 클래스 객체 생성
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
	}
}
