package exam06;

public class Child extends Parent{
	String a = "Child";
	
	@Override
	// ��� ���� �޼��带 ���� Ŭ������ �ʿ信 ���� �ٲٴ� ���� �ǹ��Ѵ�.
	public void display() {
		System.out.println("Child Ŭ���� �Դϴ�.");
		System.out.println(a + " Ŭ����");
		// this : �ڱ� �ڽ��� �޼��� �Ǵ� ������ ����� �� 
		// super : ���� ��ü Ŭ������ �޼��� �Ǵ� ������ ����� ��
		super.display();
		System.out.println(super.a + " Ŭ����");
	}
}