package exam08;

public class Exam08 {
	public void test() {
		System.out.println("test() ȣ��");
	}
	public int test(int num) {
		System.out.println("test()2 ȣ��");
		return 10;
	}
	
	public void test(double num) {
		System.out.println("test()3 ȣ��");
	}
	
	public void test(int num1, int num2) {
		System.out.println("test()4 ȣ��");
	}
	
	public void test(int num1, double num2) {
		System.out.println("test()5 ȣ��");
	}
	
	public void test(double num1, int num2) {
		System.out.println("test()6 ȣ��");
	}
	
	public static void main(String[] args) {
		// �������̵� : ���� Ŭ�������� ������� �޼��带 �����ؼ� ����ϴ� ��
		// �����ε� : ���� �̸��� �޼��带 ����� �� �ִ� ���
		// - ���� �̸��� ����ϱ� ���ؼ��� �Ű������� Ÿ�԰� ����, ������ �޶�� �Ѵ�.
		// - ��ȯ Ÿ���� �����ε��� ������ ���� �ʴ´�(int��, void�� ������).
		Exam08 e = new Exam08();
		
		e.test();
		e.test(10);
		e.test(1.11);
		e.test(1, 5);
		e.test(1, 1.1);
		e.test(2.4, 5);
	}
}
