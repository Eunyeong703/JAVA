package quiz01;

import java.util.Scanner;

public class StudentService implements ServiceImpl{
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 학생 입력");
		System.out.println("2. 학생 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		return sc.nextInt();
	}

	@Override
	public int input(Object[] obj, int idx) {
		// TODO Auto-generated method stub
		if(idx == 5) {
			System.out.println("저장할 공간이 없습니다.");
		} else {
			Student s = new Student();
			System.out.print("이름 입력 : ");
			s.setName(sc.next());
			System.out.print("나이 입력 : ");
			s.setAge(sc.nextInt());
			System.out.print("학과 입력 : ");
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
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			Student[] s = (Student[]) obj;
			for(int i=0;i<idx;i++) {
				System.out.println("### "+ s[i].getName() + " ###");
				System.out.println("나이 : " + s[i].getAge());
				System.out.println("학과 : " + s[i].getDepart());
			}
		}
	}
}
