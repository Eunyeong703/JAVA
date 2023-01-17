package quiz01;

import java.util.Scanner;

public class StudentService implements ServiceImpl{
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. �л� �Է�");
		System.out.println("2. �л� ���");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		return sc.nextInt();
	}

	@Override
	public int input(Object[] obj, int idx) {
		// TODO Auto-generated method stub
		if(idx == 5) {
			System.out.println("������ ������ �����ϴ�.");
		} else {
			Student s = new Student();
			System.out.print("�̸� �Է� : ");
			s.setName(sc.next());
			System.out.print("���� �Է� : ");
			s.setAge(sc.nextInt());
			System.out.print("�а� �Է� : ");
			s.setDepart(sc.next());
			
			obj[idx] = s;
			idx++;
		}
		return idx;
	}

	@Override
	public void output(Object[] obj, int idx) {
		// TODO Auto-generated method stub
		if(idx==0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		} else {
			Student[] s = (Student[]) obj;
			for(int i=0;i<idx;i++) {
				System.out.println("### "+ s[i].getName() + " ###");
				System.out.println("���� : " + s[i].getAge());
				System.out.println("�а� : " + s[i].getDepart());
			}
		}
	}
}
