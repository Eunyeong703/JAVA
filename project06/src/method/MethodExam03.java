package method;

public class MethodExam03 {
		// 1. ��ȯ���� ���� �Ű������� ���� �޼���
	public static void test1() { // void�� ��ȯ���� ���ٴ� ��
		// ��ȯ���� ������ void ó���� ������ �Ű������� ������ ����
		// �Ϲ����� ��¿� ���� ����Ѵ�.
		System.out.println("test1() �޼��� ����");
	}
	
	public static int test2() { // ��ȯ���� �ִ� : Ư�� �����͸� �Ѱ��ְڴ�.
		// 2. ��ȯ���� �ְ� �Ű������� ���� �޼���
		// ��ȯ���� ������ Ÿ���� ��� ������ Ÿ���� �����ϴ�
		// return���� ������ �� �ִ� �����ʹ� Ÿ�԰� ������� "�ϳ���" �����͸� �����ϴ�.
		// �迭�� ����ϸ� 3���� ���� �����ٰ� ������ �� �ְ����� �迭 �ϳ��� ���� ��.
		// �޴����� �޴� ���ð� ���� �ϳ��� �����͸� ó���ϰ� �Ѱ� ���� �� ����Ѵ�.
		return 10; // ������ �� ����ϴ� Ű����
	}
	
	public static void test3(int num1, int num2) { // int num : �Ű������� �ֱ� ������ ���
		// test3(int num1 = 0, int num2 = 20)
		// 3. ��ȯ���� ���� �Ű������� �ִ� �޼���
		// �Ű������� ��� ������ Ÿ���� �����ϰ� �������� �����͸� �Ѱ��� �� �ִ�.
		// �Ű������� ȣ���� �޼����� ���� �����ؼ� �Ű������� �����Ѵ�.
		// ���� �� ����� ��, Ư�� �����͸� ���
		System.out.println(num1 + num2);
	}
	
	public static int test4(int num1, int num2) {
		// 4. ��ȯ���� �ְ� �Ű������� �ִ� �޼���
		return num1+num2;
	}
	
	public static void main(String[] args) {
		// static �� static �ִ� �޼��常 ȣ�� �����ϴ�.
		// static : ������ �ǹ̸� ������ ������ ���α׷� ���۽ÿ� �޸𸮿� �ö󰣴�.

		// method ����
		// 1. ��ȯ���� ���� �Ű������� ���� �޼���
		// 2. ��ȯ���� �ְ� �Ű������� ���� �޼���
		// 3. ��ȯ���� ���� �Ű������� �ִ� �޼���
		// 4. ��ȯ���� �ְ� �Ű������� �ִ� �޼���
		
		System.out.println("main()���� test1() �޼��� ȣ��");
		test1(); // �޼���� ������ �������� ���Ͽ� ()�� �� �ʿ��ϴ�.
		System.out.println("main() �޼��� ����");
		
		System.out.println();
		
		System.out.println("main()���� test2() �޼��� ȣ��");
		int test2 = test2(); // �޼���� ������ �������� ���Ͽ� ()�� �� �ʿ��ϴ�.
		System.out.println(test2);
		System.out.println("main() �޼��� ����");
		
		System.out.println();
		System.out.println("main()���� test3() �޼��� ȣ��");
		test3(10,20); 
		System.out.println("main() �޼��� ����");
		
		System.out.println();
		System.out.println("main()���� test4() �޼��� ȣ��");
		int test4 = test4(10,20); 
		System.out.println(test4);
		System.out.println("main() �޼��� ����");
	}
}
