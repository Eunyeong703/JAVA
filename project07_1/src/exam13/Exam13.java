package exam13;

public class Exam13 {
	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = new String("ȫ�浿"); // ��ü�� ������ �� �ʱⰪ ����
		
		// User���� name, age �Ӽ��� �ִ�.
		User u1 = new User();
		u1.setName("ȫ�浿");
		u1.setAge(10);
		
		User u2 = new User("ȫ�浿", 10);
		System.out.println(u2.getName());
		System.out.println(u2.getAge());
	}
}
