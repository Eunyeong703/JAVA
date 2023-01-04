package ex3_for;

public class ForExam01 {
	public static void main(String[] args) {
		// for문-반복문
		// 특정 조건에 맞춰서 정해진 횟수를 반복한다.
		// for문의 특성상 반복횟수가 정해진 반복에 많이 사용된다. 즉, "유한 반복"
		// 형식 :
		// for(초기값; 종료식; 증감값) {실행할 문장}
		// 종료식의 논리값이 false(거짓)이면 종료된다.
		
		for(int i = 0; i<5; i++) {
			System.out.println("i값 : " + i);
		}
		System.out.println("for문 종료 후 i값 : " + i);
	}
}
