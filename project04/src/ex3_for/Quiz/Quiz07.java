package ex3_for.Quiz;

public class Quiz07 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if (i%2==0) // i가 0,2,4일 때
					System.out.printf("%2d ", (i*5) + (j+1));
				else  // i가 1,3일 때
					System.out.printf("%2d ", (i+1)*5 - j);
			}
			System.out.println();
			
		}
		
		System.out.println("\n");
		
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				for(int j=0;j<5;j++) { // i가 0,2,4일 때
					System.out.printf("%2d ", (j+1) + (i*5));
				}
			} else {
				for(int j=5;j>0;j--) { // i가 1,3일 때
					System.out.printf("%2d ", (i*5) + j);
				}
				
			}
			System.out.println();
		}
	}
}
