package project05;

public class ArrayExam01 {
	public static void main(String[] args) {
		// �迭 : �ϳ��� ������ Ÿ������ ���� ���� ���� ���� ������ �ǹ��Ѵ�.
		// ���� : �ϳ��� ���� ���� �޸� ����
		// ������ : �޸� ������ �����͸� ȣ���ϱ� ���� �̸�
		
		int num1 =10;
		int num2 = 20;
		int num3 = 30;
		System.out.println(num1 + ", " + num2 + ", " + num3);
		 
		// �迭 ���� - [������ Ÿ��] [������] [] = new [������Ÿ��] [������ ��];
		int arr[] = new int[3]; // ������ �� 3���� �����ϴ� �迭 ����
		// int arr[];
		// arr = new int[3];
		
		// �ʱ�ȭ �ϴ� ��� - �ε��� ��ȣ�� ����Ѵ�.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		// ����ϴ� ���
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// �迭 : ������ �ڷ����� ���� ���� ���� ���̾� ������ �� �ִ� ������ ����ü
		// ���� : ������ �ε����� ����� ��
		// �ε��� : �迭�� �����ϱ� ���� ����
	}
}
