package project13;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<Integer>();
		
		for(int i=0;i<6;i++) {
			int n = (int)(Math.random()*45)+1;
			
			if(!lotto.add(n)) {
				i--;
			}
		}
		
		for(int i: lotto) {
			System.out.print(i+" ");
		}
	}
}
