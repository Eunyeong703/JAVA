package exam04;

public class StudentMain {
	public static void main(String[] args) {
		// 학번이 20230001부터 시작으로 자동 입력
		Student stu[] = new Student[5];
		
		// 문제 : 학번을 20230001부터 넣을 수 있는 방법
		// 학번을 저장하는 변수를 만들어서 1씩 증가시킴
		
//		int stuId = 20230001;
//		for(int i=0;i<5;i++) {
//			Student s = new Student();
//			s.setStuId(stuId);
//			stuId++;
//			stu[i] = s;
//		}
//		for(int i=0;i<5;i++) {
//			System.out.println(stu[i].getStuId());
//		}
		
		stu[0] = new Student();
		stu[0].setStuId();
		
		System.out.println(stu[0].getStuId());
		
		stu[1] = new Student();
		stu[1].setStuId();
		System.out.println(stu[1].getStuId());
	}
}
