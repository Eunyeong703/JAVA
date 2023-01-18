package ex3_hashset.quiz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<String> id = new HashSet<String>();
		
		while(true) {
			System.out.println("1. ���̵� �Է�");
			System.out.println("2. ���̵� ���");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("���̵� �Է� : ");
				String inputId = sc.next();
				
				if(id.add(inputId)) {
					System.out.println("������ �Ǿ����ϴ�.");
				} else {
					System.out.println("���� ���̵� �����մϴ�.");
				}
				break;
			case 2:
				System.out.println("### ���̵� ����Ʈ ###");
				for(String s : id) {
					System.out.println(s);
				}
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
			System.out.println();
		}
	}
}
