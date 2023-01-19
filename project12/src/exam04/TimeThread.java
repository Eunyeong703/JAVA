package exam04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThread extends Thread{
	public void run() {
		while(true) {
			// �ð� Ŭ����			
			Date date = new Date();
			
			// ��� ����
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			System.out.println("���� �ð� : " + sdf.format(date));
			
			try {
				// Thread.sleep(ms) : ms��ŭ �Ͻ�����
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
