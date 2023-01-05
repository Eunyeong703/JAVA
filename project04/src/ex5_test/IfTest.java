package ex5_test;

public class IfTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int res = -1;
		
		for(int i=0; i<1000000000;i++) {
			for(int num=0; num<5; num++) {
				if(num==0) {
					res= 10;
				}else if(num==1) {
					res=20;
				}else if(num==2) {
					res=30;
				}else if(num==3) {
				    res=40;
				}else if(num==4) {
					res=50;
				} else {
					res = 12;
				
					}
				}
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println(res);
			System.out.println("실행 시간 : " + (end-start) + "ms");
	}
}
