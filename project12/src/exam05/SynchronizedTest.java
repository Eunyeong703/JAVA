package exam05;

public class SynchronizedTest {
	public static void main(String[] args) {
		Washroom wr = new Washroom();
		
		Family daddy = new Family("�ƺ�", wr);
		Family mommy = new Family("����", wr);
		Family sister = new Family("���", wr);
		Family brother = new Family("����", wr);
		
		daddy.start();
		mommy.start();
		sister.start();
		brother.start();
	}
}
