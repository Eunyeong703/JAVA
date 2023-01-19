package exam03;

public class Test {
	public static void main(String[] args) {
		System.out.println("main에 속한 스레드 시작");
		
		MyThread mt = new MyThread();
		
		// 스레드 이름 변경
		mt.setName("스레드 -1");
		
		// 우선 순위 값이 크면 빠르게 실행 (1 ~ 10)
		mt.setPriority(1);
		mt.start();
		
		System.out.println("main에 속한 스레드 끝");
	}
}
