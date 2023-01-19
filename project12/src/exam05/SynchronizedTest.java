package exam05;

public class SynchronizedTest {
	public static void main(String[] args) {
		Washroom wr = new Washroom();
		
		Family daddy = new Family("아빠", wr);
		Family mommy = new Family("엄마", wr);
		Family sister = new Family("언니", wr);
		Family brother = new Family("동생", wr);
		
		daddy.start();
		mommy.start();
		sister.start();
		brother.start();
	}
}
