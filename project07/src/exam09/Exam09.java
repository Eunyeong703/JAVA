package exam09;

public class Exam09 {
	public static void main(String[] args) {
		// Object : ��� ��ü�� �ֻ��� Ŭ����
		Exam09 e1 = new Exam09();
		Exam09 e2 = new Exam09();
		
		// Object.equals(Object obj) : �� ���� ��ü�� ������ �� - boolean
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e1));
		
		// Object.clone() : ��ü�� �����Ѵ�.
		// e.clone();
		
		// Object.finalize() : ��ü�� ���ҽ��� ������ �� ȣ��
		
		// Object.getClass() : ��ü�� Ŭ�������� ��ȯ�Ѵ�.
		System.out.println(e1.getClass());
		
		// Object.hascode() : ��ü�� �ڵ尪�� ��ȯ�Ѵ�.
		System.out.println(e1.hashCode()); // ��ġ���̶�� �����ϸ� �ȴ�.
		
		// Object.notity() : wait�� ������ ������ ������ �� ȣ��
		// Object.wait() : �����带 �Ͻ������� ������ �� ȣ��
		// Object.notityAll() : wait �Ǿ��ִ� ��� �����带 ������ �� ȣ��
		// Object.wait(long timeout) : timeout �ð���ŭ �Ͻ����� �� �� ȣ��
		// Object.wait(long timeout, int nanos) : timeout �ð���ŭ �Ͻ����� �� �� ȣ��

	}
}
