package exam01;

public class DataTypeExam {
	public static void main(String[] args) {
		// 정수형 : byte, short, int, long
		// 정수형에서는 int 가 정수 기본형이다.
		byte bt = 10; // 1byte : -128 ~ 127
		short st = 10; // 2byte
		int i = 10; // 4byte
		long ln = 10; // 8byte
		
		System.out.println(bt);
		System.out.println(st);
		System.out.println(i);
		System.out.println(ln);
		
		// 단일문자 : char - 2byte
		// 단일문자는 자바에서는 '' 를 사용한다.
		// 단일문자 변수에 ""를 사용하면 에러가 발생한다.
		// 정수로도 저장가능하고 출력은 문자로 실행된다.
		char ch = 'A';
		// char ch2 = "A";
		System.out.println(ch);
		char ch3 = 65;
		System.out.println(ch3);
		char ch4 = (char)(ch3 + 1);
		System.out.println(ch4);
		char ch5 = '한';
		System.out.println(ch5);
		char ch6 = '木';
		System.out.println(ch6);
		System.out.println(ch5 + "" + ch6);
		System.out.printf("%c %c\n", ch5,ch6);
		
		// 실수형 : float, double
		// 자바에서는 double 형이 실수기본형 이기 때문에 실수 저장시 
		// float 형은 float로 저장하는 표시를 해야 한다.
		float fl = 1.123456789f;
		System.out.println(fl);
		double db = 1.1234567890123456789;
		System.out.println(db);
		
		// 논리형 : boolean - 저장할 수 있는 값이 true, false만
		boolean b1 = true;
		System.out.println(b1);
		boolean b2 = false;
		System.out.println(b2);
		
	}
}

}
