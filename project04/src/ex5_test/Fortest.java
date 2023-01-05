package ex5_test;

public class Fortest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int res = -1;
		
		for(int i=0;i<1000000000;i++) {
			for(int num=0;num<1000000000;num++) {
				res++;
			}
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(res);
		System.out.println("실행 시간 : " + (end-start) + "ms");
	}
}

