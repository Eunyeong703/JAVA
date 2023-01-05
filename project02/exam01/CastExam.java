package exam01;

public class CastExam {
	public static void main(String[] args) {
		// promotion : 자동형변환 - 작은곳에서 큰곳으로 데이터로 이동
		byte bt = 10;
		short sh = bt;
		int i = sh;
		long ln = i;
		System.out.println(ln);
		
		// demotion : 명시적형변환 - 큰곳에서 작은곳으로 데이터로 이동
		i = (int)ln;
		sh = (short)i;
		bt = (byte)sh;
		System.out.println(bt);
		
		int number = 128;
		byte bt2 = (byte)number;
		System.out.println(bt2);
	}
}
}
