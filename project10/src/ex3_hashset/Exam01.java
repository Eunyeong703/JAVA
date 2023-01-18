package ex3_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex1_array.quiz01.Score;

public class Exam01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("이순신");
		set.add("김유신");
		
		for(String s : set) {
			System.out.println(s);
		}
		
		Iterator<String> iter = set.iterator();
		// hasNext() : 다음 값이 없으면 false, 값이 있으면 true
		while(iter.hasNext()) {
			// next() : 저장되어 있는 순서대로 값을 가져온다. - 순서는 정해져 있지는 않는다.
			String s = iter.next();
			System.out.println(s);
		}
		
		System.out.println(set.size());
		
		set.add("홍길동");
		for(String s : set) {
			System.out.println(s);
		}
		set.add(new String("홍길동"));
		for(String s : set) {
			System.out.println(s);
		}
		
		String s1 = "홍길동";
		String s2 = new String("홍길동");
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
		
		System.out.println(set.contains("홍길동"));
		System.out.println(set.contains("유관순"));
	}
}



