package project05;

public class ArrayExam02 {

	public static void main(String[] args) {
		// 배열 선언 방법
		// 선언과 동시에 공간 지정
		int a[] = new int[3];
		
		// 선언 후 공간 지정
		int b[];
		b = new int[3];
		
		// 선언과 동시에 초기화
		int c[] = {10, 20, 30};
		int d[] = new int[]{10, 20, 30};
		
		// 동적 할당 - 프로그램 구동 중에 배열의 크기를 지정할 수 있다.
		int num = 3;
		int e[] = new int[num];
		
	}
}
