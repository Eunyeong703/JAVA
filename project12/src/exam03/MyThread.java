package exam03;

public class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("���� ����ǰ� �ִ� �������� �� : " + Thread.activeCount());
		System.out.println("���� ����ǰ� �ִ� �������� ���� : " + Thread.currentThread());
	}
}
