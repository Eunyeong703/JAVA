package quiz09;

public class Banana extends Fruit{
	String fName = "�ٳ���";
	int price = 1000;
	int amount = 10;
	
	public void output() {
		System.out.println("���� �̸� : " + fName);
		System.out.println("���� : " + price);
		System.out.println("���� : " + amount);
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
