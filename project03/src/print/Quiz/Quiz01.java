package print.Quiz;

public class Quiz01 {
	public static void main(String[] args) {
		//1.오늘 년월일의 값을 가진 정수형 변수를 각각 생성 및 초기화
		int year = 2022;
		int month = 12;
		int day = 29;
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		//2. 년 월 일 모두 출력
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
		
		//3. 월, 일 출력
		System.out.printf("%d월 %d일\n", month, day);
		System.out.println(month + "월 " + day + "일");
		
		//4. 일 출력
		System.out.println(day + "일");
		System.out.printf("%d일\n", day);
		
		System.out.println(year + " " + month + " " + day);
	}
}
