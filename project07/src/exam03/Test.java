package exam03;

public class Test {
//	int num;
//	String str;
	
	// Ä¸½¶È­
	private int num;
	private String str;
	private int su;
	
	// Getter / Setter ¸Ş¼­µå

	public void setSu(int su) {
		// this : °´Ã¼ ÀÚ½ÅÀÇ º¯¼ö¸¦ ÁöÄªÇÒ ¶§ »ç¿ë
		this.su = su;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getSu() {
		return su;
	}
}
