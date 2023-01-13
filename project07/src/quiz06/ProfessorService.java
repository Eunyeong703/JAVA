package quiz06;

import java.util.Scanner;

public class ProfessorService {
	Scanner sc = new Scanner(System.in);
	
	public Professor input() {
		Professor p = new Professor();
		System.out.println("### 교수 입력 ###");
		System.out.print("학과 입력 : ");
		p.setDept(sc.next());;
		System.out.print("교수명 입력 : ");
		p.setName(sc.next());
		return p;
	}
}