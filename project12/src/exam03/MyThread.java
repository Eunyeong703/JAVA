package exam03;

public class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("현재 실행되고 있는 스레드의 수 : " + Thread.activeCount());
		System.out.println("현재 실행되고 있는 스레드의 상태 : " + Thread.currentThread());
	}
}
