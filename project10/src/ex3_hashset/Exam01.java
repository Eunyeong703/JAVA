package ex3_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex1_array.quiz01.Score;

public class Exam01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("ȫ�浿");
		set.add("�̼���");
		set.add("������");
		
		for(String s : set) {
			System.out.println(s);
		}
		
		Iterator<String> iter = set.iterator();
		// hasNext() : ���� ���� ������ false, ���� ������ true
		while(iter.hasNext()) {
			// next() : ����Ǿ� �ִ� ������� ���� �����´�. - ������ ������ ������ �ʴ´�.
			String s = iter.next();
			System.out.println(s);
		}
		
		System.out.println(set.size());
		
		set.add("ȫ�浿");
		for(String s : set) {
			System.out.println(s);
		}
		set.add(new String("ȫ�浿"));
		for(String s : set) {
			System.out.println(s);
		}
		
		String s1 = "ȫ�浿";
		String s2 = new String("ȫ�浿");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Score sc1 = new Score();
		Score sc2 = new Score();
		
		System.out.println(sc1.hashCode());
		System.out.println(sc2.hashCode());
		
		Score sc3 = sc1;
		System.out.println(sc3.hashCode());
		
		Set<Score> set1 = new HashSet<Score>();
		
		set1.add(sc1);
		System.out.println(set1.contains(sc3));
		
		System.out.println(set.contains("ȫ�浿"));
		System.out.println(set.contains("������"));
	}
}



