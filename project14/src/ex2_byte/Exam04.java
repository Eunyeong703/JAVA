package ex2_byte;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Exam04 {
	public static void main(String[] args) throws Exception{ 
		// ������ ��θ� ����
		File dir = new File("C:\\java\\test");
		// ���� �̸��� ������ ����
		File f = new File(dir, "bbb.txt"); // ��ο� ���� �̸� ����
		// ================================== ������ ���������� �ʴ´�.
		
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		// ������ �𸣸� ������ �߻��Ѵ�.
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
