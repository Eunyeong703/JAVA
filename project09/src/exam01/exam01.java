package exam01;

class Test{
	// static : �������� ���Ǵ� ������ �޼��忡 ���Ǵ� Ű����
	static int idx = 0;	
	// final : ���� ���� ���� ������ ���Ǵ� Ű����
	// �ݵ�� ����� ���ÿ� �ʱ�ȭ�� ���־�� ��
	final double pi = 3.14;
	// ���� ������ �� ����.
	// pi = 3.141592;
	
	// public static final : ����� ����
	// ��� : Ư���Ǵ� ���� �ǹ��Ѵ�. ex) ���� 1, '��', 'A' ��
	// ���� : ���� �� �ִ� ���� �ǹ��Ѵ�. ex) int num = 10; num = 20;
	// ��ΰ� ����� �� �ִ� ������� ������ �־� ���� ������ �ʵ����ϴ� ��
	// ����� ������ ���� �̸��� ��� �빮�ڷ� �ϴ� ���� ����
	
	public static final double PI = 3.14;
}

public class exam01 {
	public static void main(String[] args) {
		System.out.println(Test.idx);
		Test.idx = 10;
		System.out.println(Test.idx);
	}
}
