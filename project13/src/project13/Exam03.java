package project13;

public class Exam03 {
	public static void main(String[] args) {
		// Math 클래스
		// 수학적인 메서드를 가지고 있는 클래스
		
		double a = Math.random();
		System.out.println(a);
		
		double b = Math.random() * 10;
		System.out.println(b);
		
		// 0~9
		int c = (int) (Math.random() * 10);
		System.out.println(c);
		
		// 1~10
		int d = (int) (Math.random() * 10) + 1;
		System.out.println(d);
	}
}
