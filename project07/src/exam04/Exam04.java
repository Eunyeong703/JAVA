package exam04;

public class Exam04 {
	static int  a = 0;
	public void test1() {
		int i = 0;
		System.out.println(i += 1);
	}
	
	public void test2() {
		System.out.println(a  += 1);
	}
	
	public static void main(String[] args) {
		// static : 프로그램 시작시에 생성되고, 프로그램 종료시에 제거된다.
		Exam04 e = new Exam04();
		e.test1();
		e.test1();
		e.test1();
		
		e.test2();
		e.test2();
		e.test2();
	}
}