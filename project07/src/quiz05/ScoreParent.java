package quiz05;

public class ScoreParent {
	private String name;
	private int kor;
	private int eng;
	private int sum;
	private double avg;
	
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = kor+eng;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = sum / 2.0;
	}
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
}