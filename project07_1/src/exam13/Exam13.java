package exam13;

public class Exam13 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = new String("홍길동"); // 객체를 생성할 때 초기값 전달
		
		// User에는 name, age 속성이 있다.
		User u1 = new User();
		u1.setName("홍길동");
		u1.setAge(10);
		
		User u2 = new User("홍길동", 10);
		System.out.println(u2.getName());
		System.out.println(u2.getAge());
	}
}
