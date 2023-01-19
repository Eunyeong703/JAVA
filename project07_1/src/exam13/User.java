package exam13;

public class User extends Test{
	private String name;
	private int age;
	
	// ������ : Ŭ�����κ��� ��ü�� ������ �� �ʱ�ȭ ������ ����ϴ� Ư���� �޼���
	// Ŭ���� �̸��� ������ �޼����̴�.
	// �Ű������� ����������, ���ϰ��� �������� �ʴ´�.
	// ��ü ������ �ݵ�� �ϳ��� �����ڸ� ȣ���Ѵ�.
	// �����ڰ� ���� ��쿡�� �ڵ����� default �����ڰ� ���������. (JVM�� �ڵ� ����)
	// �����ڴ� �����ε��� �����ϴ�.
	// ��� �ʵ带 �ʱ�ȭ�ϱ� ���ؼ� ���� �޼����̴�.
	// ȣ���� �Ұ����ϰ�, ��ü �����ÿ��� ����� �����ϴ�.
	
	// default �������� ����
	public User() {
		// super : ���� Ŭ���� ��ü�� �ǹ�
		// super�� ���� �����ڸ� �Է��ϸ� ���� Ŭ������ ��� ������ �����ϴ�.
		// super �޼���� ���� Ŭ������ �����ڸ� ȣ���Ѵ�.
		super(100, 200);
		System.out.println("User default ������");
	}
	
	public User(String name, int age) {
		this.name = name;
		this.age = age; // this : �ڱ� �ڽ��� ��ü�� ����Ŵ. super : ����
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}