package ex4_while.Quiz;

public class Quiz01 {
	   public static void main(String[] args) {
		      int sum1 = 0;
		      
		      for(int i=1;i<11;i++) {
		         sum1 +=i;
		      } System.out.println("for문의 합계: "+sum1);
		      
		      int j=1;
		      int sum2 = 0;
		      
		      while(j<11) {
		         sum2 +=j;
		         j++;
		      } System.out.println("while문의 합계: "+sum2);
		   }
		}