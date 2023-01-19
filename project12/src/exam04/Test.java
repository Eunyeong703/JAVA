package exam04;

public class Test {
	public static void main(String[] args) {
		TimeThread tt = new TimeThread();
		
		// 데몬 관계 생성 - 메인이 끝나면 같이 종료(true) / 따로 종료(false)
		tt.setDaemon(true);
		tt.start();
		
		try {
			// join(시간) : 시간만큼 스레드 종료 시간을 늘려준다.
			tt.join(5000); // 5초동안 기다려줌.
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
