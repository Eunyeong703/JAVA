package print;

public class PrintExam03 {
	public static void main(String[] args) {
		// 이스케이프 문자
		// \n : 한 칸 내림
		// \r : 라인의 앞으로 이동
		// \b : 한 칸 뒤로
		System.out.print("hello\n");
		System.out.printf("hello\n");
		System.out.println("hello\n");
		
		// \r은 hello를 출력 후 맨 앞으로 가서 => hillo로 출력됨
		System.out.println("hello\rhi\n");
		// helltto로 출력됨
		System.out.println("hello\btto\n");
	}

}