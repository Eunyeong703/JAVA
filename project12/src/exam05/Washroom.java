package exam05;

public class Washroom {

	public synchronized void openDoor(String who) {
		// TODO Auto-generated method stub
		System.out.println(who + "님이 사용 중 입니다.");
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			
		}
		System.out.println(who + "님이 사용을 마쳤습니다.");
	}
}
