package quiz03;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		// 연산을 하기 위해서는 반드시 실행은 해야 한다.
		this.sum = kor + eng + math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		// 연산을 하기 위해서는 반드시 실행은 해야 한다.
		this.avg = sum/3.0;
	}
}
