package exam03;

public interface Kia {
	// �ڵ����� �ʿ��� ��ǰ�� �Ϻκ�
	// Ÿ�̾� 4��, ���� 1��, �� 5��
	public static final int TIRE = 4;
	public static final int ENGINE = 1;
	int DOOR = 5;
	
	public abstract String getTire();
	String engineInfo();
	String doorInfo();
}
