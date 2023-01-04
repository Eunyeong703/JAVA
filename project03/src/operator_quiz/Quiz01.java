package operator_quiz;

public class Quiz01 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 6;
		int num3 = 9;
		int num4 = 3;
		
		int result = (num1++) + (--num2) + (--num3) - (num4++);
		// 10(출력 후 1 증가) + 5 + 8 - 3(출력 후 1 증가)
		
		// num1 = 11
		// num2 = 5
		// num3 = 8
		// num4 = 4
		
		result = (++num1) + (--num2) + (num3--) - (--num4);
		// 12 + 4 + 8 - 3
		System.out.println(result);
		
		// num1 = 12
		// num2 = 4
		// num3 = 7
		// num4 = 3
	}

}
