package exam03;

public class Main {
	public static void main(String[] args) {
		K3 k3 = new K3();
		
		System.out.println(k3.doorInfo());
		System.out.println(k3.engineInfo());
		System.out.println(k3.getTire());
		
		K5 k5 = new K5();
		
		System.out.println(k5.doorInfo());
		System.out.println(k5.engineInfo());
		System.out.println(k5.getTire());
		
		K7 k7 = new K7();
		
		System.out.println(k7.doorInfo());
		System.out.println(k7.engineInfo());
		System.out.println(k7.getTire());
	}
}
