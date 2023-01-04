package ex3_for.Quiz;

public class Quiz05 {
	public static void main(String[] args) {
		int cnt = 1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d ", cnt);
				cnt++;
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d ", (i*5) + (j+1));
			}
			System.out.println();
		}
	}
}