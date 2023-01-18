package ex2_linked;

import java.util.LinkedList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
		List<String> link = new LinkedList<String>();
		
		link.add("홍길동");
		link.add("이순신");
		link.add("김유신");
		
		link.remove(0);
		
		System.out.println(link.size());
		
		for(String s : link) {
			System.out.println(s);
		}
		
		for(int i=0; i<link.size(); i++) {
			System.out.println(link.get(i));
		}
		
		link.add(1, "유관순");
		
		for(String s: link) {
			System.out.println(s);
		}
		
		link.clear();
		
		System.out.println(link.isEmpty());
	}
}
