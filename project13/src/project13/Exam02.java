package project13;

public class Exam02 {
	public static void main(String[] args) {
		// �⺻ ���̰� 16�� ������ ���� �� ���ڿ�
		StringBuffer sb1 = new StringBuffer();
		// 20��ŭ�� ������ ���� �� ���ڿ�
		StringBuffer sb2 = new StringBuffer(20);
		// ���ڿ��� �Էµ� ������ ���� ���ڿ�
		StringBuffer sb3 = new StringBuffer("Hello Hi Java!");
		
		// capacity() : �迭�� ���̰� ��ȯ
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		
		// append(���ڿ�) : ���ڿ��� �߰��Ѵ�.
		sb3.append("test");
		System.out.println(sb3);
		
		// append(StringBuffer) : ���ڿ��� �߰��Ѵ�.
		StringBuffer sb4 = new StringBuffer("~~~~");
		sb3.append(sb4);
		System.out.println(sb3);
		
		// delete(start, end) : start���� end-1���� ���ڿ��� ���� - end �ε����� �� ��������.
		sb3.delete(14, 20);
		System.out.println(sb3);
		
		// insert(start, ���ڿ�) : start ��ġ�� ���ڿ��� �߰��ϰ� ���� ���ڴ� �ڷ� �и���.
		sb3.insert(6, sb4);
		System.out.println(sb3);
		
		// replace(start, end, "���ڿ�") : start���� end-1 �ε������� ���ڸ� ���ڿ��� ��ȯ
		// end ��ġ�� �ٲ��� �ʴ´�.
		sb3.replace(6, 9, "####"); // 6~9������ ���� "####"�� ��ü�Ѵ�.
		System.out.println(sb3);
		
		// reverse() : ���ڿ��� ������ �ݴ�� ��ȯ
		System.out.println(sb3.reverse());
		
		// setLength(ũ��) : ���ο� ���̷� �缳���Ѵ�.
		System.out.println(sb3.capacity());
		sb3.setLength(40);
		System.out.println(sb3.capacity());
	}
}
