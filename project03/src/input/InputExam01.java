package input;

import java.io.IOException;

public class InputExam01 {
	public static void main(String[] args) throws IOException {
		// 키보드로 입력 받는 값을 처리하는 방법
		// 한글자 입력 방법 : system.in.read()
		// 받아오는 값을 ASCII 코드 값으로 받는다.
		
		// System.in.read()를 이용하면 입력 대기 상태가 되는데
		// 아무 것도 출력되지 않으면 반응이 없어보이고 입력할 내용을 알지 못한다.
		
		System.out.print("입력 : ");
		int x = System.in.read(); 
		
		System.out.println("입력 받은 값 : " + x);
		System.out.println("단일 문자로 처리 : " + (char)x);

		// System.in.read()를 사용하여 입력 받을 때 엔터로 입력 종료하게 되는데
		// 그 값이 다음 System.in.read()에 저장되게 된다.
		// 따라서 다음에 오는 System.in.read()의 사용이 불가능하게 된다.
		
		// 입력 버퍼를 없애기 위해서 System.in.read()를 사용하면 된다.
		// 엔터는 \r\n으로 이루어져 있다. 
		System.in.read();  // \r
		System.in.read();  // \n
		
		System.out.print("입력 : ");
		char y = (char) System.in.read();
		System.out.println("입력 받은 값 : " + y);
	}

}
