package ex2_linked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam03 {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> link = new LinkedList<Integer>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			arr.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList : " + (endTime = startTime) + "ns");

		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			link.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList : " + (endTime = startTime) + "ns");
		
	}
}
