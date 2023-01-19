package exam13;

public class User extends Test{
	private String name;
	private int age;
	
	// 생성자 : 클래스로부터 객체가 생성될 때 초기화 과정을 기술하는 특수한 메서드
	// 클래스 이름과 동일한 메서드이다.
	// 매개변수는 존재하지만, 리턴값이 존재하지 않는다.
	// 객체 생성시 반드시 하나의 생성자를 호출한다.
	// 생성자가 없는 경우에는 자동으로 default 생성자가 만들어진다. (JVM이 자동 생성)
	// 생성자는 오버로딩이 가능하다.
	// 멤버 필드를 초기화하기 위해서 만든 메서드이다.
	// 호출은 불가능하고, 객체 생성시에만 사용이 가능하다.
	
	// default 생성자의 형태
	public User() {
		// super : 상위 클래스 객체를 의미
		// super에 참조 연산자를 입력하면 상위 클래스의 멤버 접근이 가능하다.
		// super 메서드는 상위 클래스의 생성자를 호출한다.
		super(100, 200);
		System.out.println("User default 생성자");
	}
	
	public User(String name, int age) {
		this.name = name;
		this.age = age; // this : 자기 자신의 객체를 가리킴. super : 상위
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