package exam02;

public interface ExamInterface {
	// ��� ������ ����� ����
	public static final int FOOT = 2;
	// ��� ������ public static final�� �����Ǿ �ڵ����� public static finaló�� �Ѵ�.
	int HAND = 2;
	
	// ��� ������ �߻� �޼��常 ����
	// �߻� �޼���� ��ӹ��� Ŭ������ �ݵ�� �������־�� �Ѵ�.
	public abstract void footString();
	
	// public abstract�� �����ص� �ڵ����� public abstract�ִ� ������ ó��
	void handString();
}
