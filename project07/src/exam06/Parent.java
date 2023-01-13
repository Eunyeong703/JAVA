package exam06;

public class Parent {
	protected String a = "Parent"; // private는 불가
	public void display() {
		System.out.println("Parent 클래스 입니다.");
		System.out.println(a + " 클래스");
	}
}