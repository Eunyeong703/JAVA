package exam13;

public class Test {
	int a,b,c,d,e,f,g;
	
	// this : 객체를 선언한 후, 객체 자신을 의미
	// this 뒤에 .(참조 연산자)를 붙여서 멤버 접근 가능
	// this(매개변수)를 하면 객체를 가지고 있는 생성자를 호출할 수 있다.
	// 클래스 안에서 this 메서드를 사용할 경우 반드시 this() 메서드를 제일 앞에 써주어야 한다.
	
	Test(){
		a=10; b=20; c=30; d= 40; e=50; f=60; g=70;
		System.out.println("Test() 메서드 실행");
	}
	Test(int a){
		this(); // 여기서 this는 맨 위에 Test()를 의미한다.
		this.a = a;
		System.out.println("Test(int a) 메서드 실행");
		// this.a=a; b=20; c=30; d= 40; e=50; f=60; g=70;
	}
	Test(int a, int b){
		this(a);
		this.b = b;
		System.out.println("Test(int a, int b) 메서드 실행");
		// this.a=a; this.b=b; c=30; d= 40; e=50; f=60; g=70;
	}
}
