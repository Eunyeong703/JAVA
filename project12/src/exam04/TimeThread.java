package exam04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThread extends Thread{
	public void run() {
		while(true) {
			// 시간 클래스			
			Date date = new Date();
			
			// 출력 형식
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			System.out.println("현재 시간 : " + sdf.format(date));
			
			try {
				// Thread.sleep(ms) : ms만큼 일시정지
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
