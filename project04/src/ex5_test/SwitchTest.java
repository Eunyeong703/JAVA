package ex5_test;

public class SwitchTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int res = -1;
		
		for(int i=0; i<1000000000;i++) {
			for(int num=0; num<5; num++) {
				switch(num) {
				case 0:
					res = 10;
					break;
				case 1:
					res = 20;
					break;
				case 2:
					res = 30;
					break;
				case 3:
					res = 40;
					break;
				case 4:
					res = 50;
					break;
				default:
					res = 12;
				}
			}
		}
			long end = System.currentTimeMillis();
			
			System.out.println(res);
			System.out.println("실행시간 : " + (end-start) + "ms");
		
	}
}


