package ex3_for.Quiz;

public class Quiz04 {
	public static void main(String[] args) {	
		// 2단 ~ 9단까지 출력 -> for문을 두 개 돌려야 함.
		for(int i=2;i<10;i++) {
			System.out.println("===" + i + "단 ===");
			for(int j=2;j<10;j++) {
				System.out.println(i + " * " + j + "= " + (i*j));
				}
			}
		}
	}

