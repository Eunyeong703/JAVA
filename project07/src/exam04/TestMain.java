package exam04;

public class TestMain {
	public static void main(String[] args) {
		Test t1 = new Test();
		
		System.out.println(t1.num);
		
		Test t2 = new Test();
		t2.num += 1;
		
		System.out.println(t2.num);
		System.out.println(t1.num);
		// static�� �پ� ������ t1�� t2�� ���� ���ÿ� ���Ѵ�.
		
		Test t3 = new Test();
		t3.num += 2;
		System.out.println(t3.num);
		System.out.println(t2.num);
		System.out.println(t1.num);
	}
}
