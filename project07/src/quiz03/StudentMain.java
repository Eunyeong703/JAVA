package quiz03;

public class StudentMain {
	public static void main(String[] args) {
		StudentService ss = new StudentService(); // ����� ������ Ŭ���� ��ü ����
		// ������ ������ ���� �������� �޼��� ����
		int studentNum = ss.studentListNum(); // ss�� �� �ٿ��־�� ��
		// �迭 ����
		Student studentList[] = new Student[studentNum];
		// �ε��� ��ȣ ���� ����
		int idx = 0;
				
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 1:
				studentList[idx] = ss.input();
				idx++;
				break;
			case 2:
				ss.output(studentList, idx);
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
			}
			System.out.println();
		}
	}
}
