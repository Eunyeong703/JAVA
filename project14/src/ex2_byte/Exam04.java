package ex2_byte;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Exam04 {
	public static void main(String[] args) throws Exception{ 
		// 파일의 경로를 지정
		File dir = new File("C:\\java\\test");
		// 파일 이름을 변수로 지정
		File f = new File(dir, "bbb.txt"); // 경로와 파일 이름 지정
		// ================================== 파일이 생성되지는 않는다.
		
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		// 순서를 모르면 에러가 발생한다.
		int num = dis.readInt();
		double db = dis.readDouble();
		String str = dis.readUTF();
		char ch = dis.readChar();
		
		System.out.println(num);
		System.out.println(db);
		System.out.println(str);
		System.out.println(ch);
		
		dis.close();
		bis.close();
		fis.close();
	}
}
