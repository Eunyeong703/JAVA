package exam01;

public class Test {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start(); //��Ƽ �������� ����
		mt.run(); // ���� ������� ����
	}
}