package exam04;

public class Test {
	public static void main(String[] args) {
		TimeThread tt = new TimeThread();
		
		// ���� ���� ���� - ������ ������ ���� ����(true) / ���� ����(false)
		tt.setDaemon(true);
		tt.start();
		
		try {
			// join(�ð�) : �ð���ŭ ������ ���� �ð��� �÷��ش�.
			tt.join(5000); // 5�ʵ��� ��ٷ���.
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
