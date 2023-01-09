package ex7_review;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("별 최대 수 : ");
		int num = sc.nextInt();
		
		// for문
		for(int i=0;i<num;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		// while 문
		int t = 1;
		while(t<=num) {
			int q = 1;
			while(q<=t) {
				System.out.print("*");
				q++;
			}
			System.out.println();
			t++;
		}
		
		
		int i = 1;
		while(i<=num) {
			int j = num;
			while (j>i) {
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}
		
		
		
		int z = 0;
		
		while(z < num) {
			int p = 0;
			while(p<=z) {
					System.out.print("*");
					p++;
				}
				System.out.println();
				z++;
			}
			z = 1;
			while(z<num) {
				int p = 0;
				while(p<num-i) {
					System.out.print("*");
					p++;
				}
				System.out.println();
				z++;
		}
	}
}
