package ex3_for.Quiz;

public class Quiz01 {
	public static void main(String[] args) {
		// if문을 사용하는 방법
		for(int i = 1;i<=100;i++) {
			if(i%5==0) {
			System.out.println("i값 : " + i);
			}
		} 
		
		// if문을 사용하지 않는 방법
		for(int i=5; i<101; i+=5) {
			System.out.println(i);
		}
	}
}
