package ex2_linked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam02 {
	public static void main(String[] args) {
		List arr = new ArrayList();
		
		arr.add(10);
		arr.add("홍길동");
		arr.add(1.234);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		List<String> str = new LinkedList<String>();
		str.add("홍길동");
		// 제네릭으로 데이터 타입을 고정하면 다른 데이터 타입은 저장되지 않는다.
		// str.add(10);
		// str.add(1.233);
		
		// 참조형 : Integer, Double, Long 참조형 데이터 타입(Wrapper 타입)
		// List에서 참조형을 사용해야 하는 이유는 null값이 저장되어야 하기 때문이다.
		List<Integer> num = new ArrayList<Integer>();
		List<Double> db = new ArrayList<Double>();
	}
}
