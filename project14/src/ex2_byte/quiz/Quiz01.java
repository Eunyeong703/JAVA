package ex2_byte.quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		File dir = new File("C:\\java\\test");
		File f = new File(dir, "ccc.txt"); // ��ο� �����̸� ����
		
		FileOutputStream fos = new FileOutputStream(f, true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		for(int i=0;i<2;i++) {
			System.out.print("�̸� �Է� : ");
			String name = sc.next();
			System.out.print("���� ���� �Է� : ");
			int kor = sc.nextInt();
			System.out.print("���� ���� �Է� : ");
			int eng = sc.nextInt();
			System.out.print("���� ���� �Է� : ");
			int math = sc.nextInt();
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
		}
		
		dos.close();
		bos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		for(int i=0;i<2;i++) {
			String name = dis.readUTF();
			int kor = dis.readInt();
			int eng = dis.readInt();
			int math = dis.readInt();
			
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + (kor + eng + math));
			System.out.println("��� : " + ((kor + eng + math)/3.0));
		}
		
		dis.close();
		bis.close();
		fis.close();
	}
}