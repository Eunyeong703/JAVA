package quiz01;

public class StudentMain {
	public static void main(String[] args) {
		Student[] student = new Student[5];
		StudentService ss = new StudentService();
		
		int idx = 0;
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 1:
				idx = ss.input(student, idx);
				break;
			case 2:
				ss.output(student, idx);
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}
}
