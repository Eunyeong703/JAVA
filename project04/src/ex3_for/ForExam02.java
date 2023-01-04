package ex3_for;

public class ForExam02 {
	public static void main(String[] args) {
		// for(시작값;종료식;증감식) {실행할 문장}
		// 시작값 -> 종료식 -> true -> 실행 -> 증감식 -> 종료식
		// 그러다가 증료식이 false가 되면 for문이 종료.
		
		// 무한 반복 형식
		// for(;;) {실행할 문장}
		int i = 0;
		for (;;) {
			System.out.println(i);
			i++;
			if(i==10) {
				break;
			}
		}
		
		// for(;종료식;) {실행할 문장}
		int num = 0;
		for(;num<10;)
			System.out.println(num);
			num++;
			
			
		// for(;;증감식) {실행할 문장}
		int su = 0;
		for(;;su++) {
			System.out.println(su);
			if(su == 10) {
				break;
			}
		}
		
		// for(초기값;;) {실행할 문장}
		int n = 0;
		for(n=0;;) {
			System.out.println(n);
		}
		
		// for(int i=0;;) {실행할 문장} - 실행 불가능
	}
}
