package ex2_byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exam01 {
	public static void main(String[] args) throws Exception{
		// 파일의 경로를 지정
		File dir = new File("C:\\java\\test");
		// 파일 이름을 변수로 지정
		File f = new File(dir, "aaa.txt"); // 경로와 파일 이름 지정
		// ================================== 파일이 생성되지는 않는다.
		
		// 파일의 내용을 내보내기 위해서 FileOutputStream을 사용
		// new FileOutputStream(파일명) : 기본값이 false, 즉 덮어쓰기가 된다.
		// new FileOutputStream(파일명, true) : 이어쓰기
		FileOutputStream fos = new FileOutputStream(f);
		
		// write() 메서드를 이용해서 값을 내보내기를 한다.
		fos.write(65);
		fos.write('B');
		String msg = "Hello JAVA!!";
		
		// 문자열은 byte 형태가 아니기 때문에 String.getBytes() 메서드를 이용하여 배열 형태로 변경
		byte b[] = msg.getBytes();
		// fos.write(b);
		// fos.write(배열, 시작 인덱스, 글자수)
		fos.write(b, 6, 4);
		
		// 10은 \n(한칸 내림)을 의미한다.
		fos.write(10);
		// 출력값이 byte이기 때문에 파일에 저장될 때는 ASCII코드 값으로 인식되어 저장된다.
		// fos로 전송되는 모든 데이터는 문자라고 생각하면 된다.
		fos.close();
	}
}
