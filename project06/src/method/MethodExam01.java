package method;

public class MethodExam01 {
	public static void main(String[] args) {
		// �޼���
		// Ư�� ����� �ݺ��Ǵ� �ڵ带 ����ϴ� ���
		// 1. copy & paste - �����ؾ��ϴ� �ڵ带 ������ ã�Ƽ� ����
		// 2. method - �����ؾ��ϴ� �ڵ带 �ϳ��� �����ϸ� �ȴ�.
		
		// public : ���������� - �޼��忡 ���� ���� ����
		// static : ���� ����� - Ư�� ����� ������ Ű����(���� ����)
		// void : ��ȯ�� - �޼��尡 ����� �� ��ȯ�ϴ� ���� ������ ����
		// main : �޼��� �̸� - �޼��带 ȣ���ϱ� ���� �̸�
		// (String[] args) : �Ű����� - �޼��带 ȣ���� �޼��尡 �����ϴ� ������
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
