package ex2_byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exam02 {
	public static void main(String[] args) throws Exception {
		// ������ ��θ� ����
		File dir = new File("C:\\java\\test");
		// ������ �̸��� ������ ����
		File f = new File(dir, "aaa.txt");
		// ==================================> ���ϸ� �����س��� ��
		
		FileInputStream fis = new FileInputStream(f);
		
		while(true) {
			// read()�� ���� �� ���ھ� �����´�.
			int result = fis.read();
			
			// ������ �����Ͱ� ��� ���۵Ǹ� -1���� �����´�.
			if(result == -1) {
				break;
			}
			System.out.println((char) result);
		}
		fis.close();
	}
}
