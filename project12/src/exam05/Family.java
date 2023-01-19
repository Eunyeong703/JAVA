package exam05;

public class Family extends Thread{
	private Washroom wr;
	private String who;
	
	public Family(String name, Washroom wr) {
		who = name;
		this.wr = wr;
	}
	
	public void run() {
		wr.openDoor(who);
	}
}
