package exam04;

public class StudentMain {
	public static void main(String[] args) {
		// �й��� 20230001���� �������� �ڵ� �Է�
		Student stu[] = new Student[5];
		
		// ���� : �й��� 20230001���� ���� �� �ִ� ���
		// �й��� �����ϴ� ������ ���� 1�� ������Ŵ
		
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
