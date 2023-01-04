package print.Quiz;

public class Quiz03 {
	public static void main(String[] args) {
		// 1. 휴대전화 번호를 3개의 정수형 변수로 저장 후 출력
		// %03d의 의미 : 공간 3개를 만들고 앞에 0을 넣어달라.
		System.out.printf("%03d - %04d - %04d\n", 10, 1222, 2221);

		// 2. 2022년 12월 29일 (printf로 출력)
		// printf 에는 + 사용 하지 않기
		System.out.printf("%d%c %s %d%c\n",
				2022 , '년', "12월" , 29, '일');


		int year = 2022;
		char charYear = '년';
		String month = "12월";
		int day = 29;
		char charDay = '일';


		System.out.printf("%d%c %s %d%c\n",
				year, charYear, month, day, charDay);

	}
}
