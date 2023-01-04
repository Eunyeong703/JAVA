package ex4_while.Quiz;

public class Quiz02 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=100) {
			if(i%4==0) {
				System.out.print(i + ", ");
			}
			if(i%8==0) {
				sum += i;
			}
			i++;
		}
		System.out.println("\n8의 배수 총합" + sum);
	}
}