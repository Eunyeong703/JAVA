package exam02;

class Test {
	int hand = 2;
}
public class Main {
	public static void main(String[] args) {
		Exam02 e = new Exam02();
		e.footString();
		// ��ü �̸�.����� ����
		System.out.println(e.FOOT);
		// Ŭ���� �̸�.����� ����
		System.out.println(Exam02.FOOT);
		
		e.handString();
		System.out.println(e.HAND);
		System.out.println(Exam02.HAND);
		
		Test t = new Test();
		System.out.println(t.hand);
		// �Ϲ� ������ ��ü. ������ ���� �� ������ Ŭ���� �̸�.���� �̸��� ������ �ʴ´�.
		// System.out.println(Test.hand);
	}
}
