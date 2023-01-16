package exam12;

import java.util.Scanner;

public class Exam12 {
	static Scanner sc = new Scanner(System.in);
	
	public static Member input() {
		Member m = new Member();
		System.out.print("�̸� �Է� : ");
		m.setName(sc.next());
		System.out.print("�̸��� �Է� : ");
		m.setEmail(sc.next());
		return m;
	}
	
	public static int delete(int idx, Member[] m) {
		System.out.println("delete()�� Member �迭 : " + m.toString());
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		
		for(int i=0;i<idx;i++) {
			if(name.equals(m[i].getName())) {
				System.out.println(name + " ���� ������ �����մϴ�.");
				idx--;
				for(int j=i;j<idx;j++) {
					m[j] = m[j+1];
				}
				break;
			}
		}
		return idx;
	}
	public static void main(String[] args) {
		Member m[] = new Member[3];
		
		int idx = 0;
		
		m[0] = input();
		idx++;
		m[1] = input();
		idx++;
		m[2] = input();
		idx++;
		
		System.out.println("idx : " + idx);
		
		System.out.println("main()�� Member �迭 : " + m.toString());
		idx = delete(idx, m);
		
		for(int i=0;i<idx;i++) {
			System.out.println("�̸� : " + m[i].getName());
			System.out.println("�̸��� : " + m[i].getEmail());
		}
	}
}