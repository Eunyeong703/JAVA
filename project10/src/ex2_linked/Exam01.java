package ex2_linked;

import java.util.LinkedList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
		List<String> link = new LinkedList<String>();
		
		link.add("ȫ�浿");
		link.add("�̼���");
		link.add("������");
		
		link.remove(0);
		
		System.out.println(link.size());
		
		for(String s : link) {
			System.out.println(s);
		}
		
		for(int i=0; i<link.size(); i++) {
			System.out.println(link.get(i));
		}
		
		link.add(1, "������");
		
		for(String s: link) {
			System.out.println(s);
		}
		
		link.clear();
		
		System.out.println(link.isEmpty());
	}
}
