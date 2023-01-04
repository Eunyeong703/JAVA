package print;

public class PrintExam01 {
	public static void main(String[] args) {
		// println("출력"); : 출력 내용을 출력 후 한 칸 내림
		System.out.println("Hello");
		// print("출력"); : 출력 내용을 출력 후 그대로 있음
		// '메뉴 입력:' 같이 입력 대기 상태일 때. 바로 다음에 내용 와야 할 때
		System.out.print("Hello");
		// printf("출력"); : 출력 내용을 형식에 맞춰 출력 후 그대로 있음
		// 소수점 자리를 출력할 때
		// 3.333333333 -> '%.2f => 3.33'으로 보이게 만들어 줌.
		System.out.printf("Hello");
	}

}
