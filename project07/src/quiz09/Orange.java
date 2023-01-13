package quiz09;

public class Orange extends Fruit{
	String fName = "오렌지";
	int price = 2000;
	int amount = 20;
	public void output() {
		System.out.println("과일 이름 : " + fName);
		System.out.println("가격 : " + price);
		System.out.println("갯수 : " + amount);
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}