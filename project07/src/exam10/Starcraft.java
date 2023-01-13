package exam10;

public class Starcraft {
	public static void main(String[] args) {
		Protoss p = new Protoss();
		
		p.attack();
		p.depense();
		
		Dragon d = new Dragon();
		d.attack();
		d.depense();
		
		Zealot z = new Zealot();
		z.attack();
		z.depense();
		
		Protoss d1 = new Dragon();
		d1.attack();
		d1.depense();
		
		Protoss z1 = new Zealot();
		z1.attack();
		z1.depense();
	}
}
