package ex4_object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Exam01 {
	public static void main(String[] args) throws Exception{
		File dir = new File("C:\\java\\test");
		File f = new File(dir, "object.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		Score s = new Score();
		s.name = "홍길동";
		s.score = 100;
		
		oos.writeObject(s);
		
		oos.close();
		bos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Score s1 = null;
		try {
			s1 = (Score) ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("이름 : " + s1.name);
		System.out.println("점수 : " + s1.score);
		
		ois.close();
		bis.close();
		fis.close();
	}
}