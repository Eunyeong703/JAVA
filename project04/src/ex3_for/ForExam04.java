package ex3_for;

public class ForExam04 {
	public static void main(String[] args) {
		int cnt = 1;
		// 이중 for문, 다중 for문
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				for(int k=0;k<5;k++) {
				System.out.println(cnt++);
				}
			}
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("### i값 : " + i + " ###");
			for(int j=0;j<5;j++) {
				System.out.println("=== j값 : " + j + "===");
				for(int k=0;k<5;k++){
					System.out.println("k값 : " + k);
				}
			}
		}
	}
}
