package exam05;

public class Washroom {

	public synchronized void openDoor(String who) {
		// TODO Auto-generated method stub
		System.out.println(who + "���� ��� �� �Դϴ�.");
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			
		}
		System.out.println(who + "���� ����� ���ƽ��ϴ�.");
	}
}
