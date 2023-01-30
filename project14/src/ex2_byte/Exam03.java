package ex2_byte;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Exam03 {
	public static void main(String[] args) throws Exception{ 
		// 파일의 경로를 지정
		File dir = new File("C:\\java\\test");
		// 파일 이름을 변수로 지정
		File f = new File(dir, "bbb.txt"); // 경로와 파일 이름 지정
		// ================================== 파일이 생성되지는 않는다.
		
		// 여러 자료형 출력하는 방법
		// 1. 우선 FileOutputStream 객체 생성
		FileOutputStream fos = new FileOutputStream(f);
		
		// 2. BufferedOutputStream 객체에 FileOutputStream을 넣는다.
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 3. DataOutputStream 객체에 BufferedOutputStream 객체를 넣는다.
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeInt(100);
		dos.write(10);
		dos.writeDouble(1.2345);
		dos.write(10);
		dos.writeUTF("Hello JAVA!!");
		dos.write(10);
		dos.writeChar('A');
		
		dos.close();
		bos.close();
		fos.close();
	}
}
