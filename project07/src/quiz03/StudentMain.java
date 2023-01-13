package quiz03;

public class StudentMain {
	public static void main(String[] args) {
		StudentService ss = new StudentService(); // 기능을 실행할 클래스 객체 생성
		// 저장할 공간의 값을 가져오는 메서드 실행
		int studentNum = ss.studentListNum(); // ss는 꼭 붙여주어야 함
		// 배열 생성
		Student studentList[] = new Student[studentNum];
		// 인덱스 번호 저장 변수
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
				System.out.println("프로그램 종료");
				return;
			default:
			}
			System.out.println();
		}
	}
}
