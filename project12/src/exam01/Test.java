package exam01;

public class Test {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start(); //멀티 스레스로 실행
		mt.run(); // 단일 스레드로 실행
	}
}