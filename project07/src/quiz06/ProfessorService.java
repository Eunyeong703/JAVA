package quiz06;

import java.util.Scanner;

public class ProfessorService {
	Scanner sc = new Scanner(System.in);
	
	public Professor input() {
		Professor p = new Professor();
		System.out.println("### ���� �Է� ###");
		System.out.print("�а� �Է� : ");
		p.setDept(sc.next());;
		System.out.print("������ �Է� : ");
		p.setName(sc.next());
		return p;
	}
}