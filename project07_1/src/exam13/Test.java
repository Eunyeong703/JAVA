package exam13;

public class Test {
	int a,b,c,d,e,f,g;
	
	// this : ��ü�� ������ ��, ��ü �ڽ��� �ǹ�
	// this �ڿ� .(���� ������)�� �ٿ��� ��� ���� ����
	// this(�Ű�����)�� �ϸ� ��ü�� ������ �ִ� �����ڸ� ȣ���� �� �ִ�.
	// Ŭ���� �ȿ��� this �޼��带 ����� ��� �ݵ�� this() �޼��带 ���� �տ� ���־�� �Ѵ�.
	
	Test(){
		a=10; b=20; c=30; d= 40; e=50; f=60; g=70;
		System.out.println("Test() �޼��� ����");
	}
	Test(int a){
		this(); // ���⼭ this�� �� ���� Test()�� �ǹ��Ѵ�.
		this.a = a;
		System.out.println("Test(int a) �޼��� ����");
		// this.a=a; b=20; c=30; d= 40; e=50; f=60; g=70;
	}
	Test(int a, int b){
		this(a);
		this.b = b;
		System.out.println("Test(int a, int b) �޼��� ����");
		// this.a=a; this.b=b; c=30; d= 40; e=50; f=60; g=70;
	}
}
