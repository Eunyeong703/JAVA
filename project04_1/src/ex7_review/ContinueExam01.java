package ex7_review;

public class ContinueExam01 {
	public static void main(String[] args) {
		// continue : 처음으로 되돌아 간다는 의미
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				continue; // 아래로 가지 않고 반복문의 위로 올라간다
			}
			System.out.println(i);
		}
	}
}
