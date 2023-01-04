package ex3_for.Quiz;

public class Quiz02 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("3의 배수 : ");
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.print(i + ",");
			}
			if (i%6==0) {
				sum += i;
			}
		}
				System.out.println("\n6의 배수의 총합 : " + sum);
	}
		
}

