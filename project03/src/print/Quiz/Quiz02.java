package print.Quiz;

public class Quiz02 {
	public static void main(String[] args) {
		int kor = 98;
		int eng = 92;
		int math = 100;
				
		//총점
		int sum = kor + eng + math;
		
		System.out.println("총점 : "+ (kor + eng + math) + "점");
		System.out.println("총점 : " + sum + "점");
		System.out.printf("총점 : %d점\n", kor+eng+math);
		System.out.printf("총점 : %d점\n", sum);
		
		//평균
		double avg = (kor + eng + math)/3.0;
		
		System.out.println("평균 : " + ((kor+eng+math)/3.0) + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.printf("평균 : %.2f점\n", (kor+eng+math)/3.0);
		System.out.printf("평균 : %.2f점\n", avg);
		
		System.out.printf("%.3f\n",avg);
	}
}
