package project13;

import java.util.Random;

public class Exam04 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		// 0~9������ ������
		System.out.println(rand.nextInt(10));
		
		// �ڷ����� ���� ���� �߻�
		System.out.println(rand.nextInt());
		System.out.println(rand.nextLong());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextFloat());
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextGaussian());
	}
}
