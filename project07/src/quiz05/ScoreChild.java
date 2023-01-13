
package quiz05;

public class ScoreChild extends ScoreParent{
	private int math;
	private int music;
	private int sum;
	private double avg;
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = getKor() + getEng() + math + music;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = sum / 4.0;
	}
}