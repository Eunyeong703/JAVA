package exam03;

public class Test {
	public static void main(String[] args) {
		System.out.println("main�� ���� ������ ����");
		
		MyThread mt = new MyThread();
		
		// ������ �̸� ����
		mt.setName("������ -1");
		
		// �켱 ���� ���� ũ�� ������ ���� (1 ~ 10)
		mt.setPriority(1);
		mt.start();
		
		System.out.println("main�� ���� ������ ��");
	}
}
