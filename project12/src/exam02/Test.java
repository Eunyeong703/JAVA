package exam02;

public class Test {
	public static void main(String[] args) {
		// Runnable�� ��ӹ��� Ŭ���� ��ü ����
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
	}
}
