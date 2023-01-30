package ex2_byte;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Exam03 {
	public static void main(String[] args) throws Exception{ 
		// ������ ��θ� ����
		File dir = new File("C:\\java\\test");
		// ���� �̸��� ������ ����
		File f = new File(dir, "bbb.txt"); // ��ο� ���� �̸� ����
		// ================================== ������ ���������� �ʴ´�.
		
		// ���� �ڷ��� ����ϴ� ���
		// 1. �켱 FileOutputStream ��ü ����
		FileOutputStream fos = new FileOutputStream(f);
		
		// 2. BufferedOutputStream ��ü�� FileOutputStream�� �ִ´�.
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 3. DataOutputStream ��ü�� BufferedOutputStream ��ü�� �ִ´�.
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
