package exam04;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	
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
		this.sum = kor+eng+math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = sum / 3.0;
	}
	double avg;
}
