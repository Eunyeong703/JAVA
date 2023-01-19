package project13;

public class Exam01 {
	public static void main(String[] args) {
		String str1 = "HELLO hi Java!";
		String str2 = "hello HI jAVA!";
		
		// charAt(int index) : ������ �ε��� ��ȣ�� ���ڸ� ��ȯ
		System.out.println(str1.charAt(4));
		
		// ���� ���ڿ��̸� 0, �� �ܴ� �� �ٸ� ���ڿ��̴�.
		// compareTo(���ڿ�) : ���ڿ��� ���������� ���� - ��ҹ��ڸ� ����
		System.out.println(str1.compareTo(str2));
		
		// compareToIgnoreCase(���ڿ�) : ��ҹ��� ������ ����
		System.out.println(str1.compareToIgnoreCase(str2));
		
		// ���ڿ� ���� ������ + �� �̿��ؼ� �� ���ڿ��� ���ᰡ���ϴ�.
		System.out.println(str1 + str2);
		
		// concat(���ڿ�) : �� ���ڿ��� ����
		System.out.println(str1.concat(str2));
		
		// startWith(���ڿ�) : ���ڿ��� �Էµ� ���ڿ��� ���� - ��ҹ��ڸ� ����
		System.out.println(str1.startsWith("HELLO"));
		System.out.println(str1.startsWith("HELLo"));
		System.out.println(str1.endsWith("!"));
		System.out.println(str1.endsWith("."));
		
		// equals(���ڿ�) : ���� ���ڿ����� �� - ��ҹ��ڸ� ����
		System.out.println(str1.equals(str2));
		
		// equalsIgnoreCase(���ڿ�) : ���� ���ڿ����� �� - ��ҹ��� ���� ����
		System.out.println(str1.equalsIgnoreCase(str2));
		
		// getBytes() : ���ڿ��� byte �迭�� ��ȯ
		byte[] by = str1.getBytes();
		for(byte b : by) {
			System.out.print(b);
		}
		for(byte b : by) {
			System.out.print((char)b); // ���ڷ� ���� ���� char ���·� ����ȯ
		}
		
		// hashCode() : �ؽ��ڵ� �� ��ȯ
		System.out.println(str1.hashCode());
		
		// indexOf("����") : �ش� ���ڰ� ó�� ������ �ε��� ��ȣ ��ȯ
		System.out.println(str1.indexOf(" "));
		
		// lastIndexOf("����") : �ش� ���ڰ� ���������� ������ �̵��ϸ鼭 ������ �ε��� ��ȣ ��ȯ
		System.out.println(str1.lastIndexOf(" "));
		
		// isEmpty() : ����ִ��� �˷��ش�.
		String str3 = "";
		System.out.println(str1.isEmpty());
		System.out.println(str3.isEmpty());
		
		// length() : ���ڿ� ���� ��ȯ
		System.out.println(str1.length());
		
		// split("����") : ���ڸ� �������� �迭�� ������ش�.
		String[] str4 = str1.split(" ");
		for(String s : str4) {
			System.out.println(s);
		}
		
		// subString(����) : ���ں��� ������ ���ڿ� ��ȯ
		System.out.println(str1.substring(6));
		
		// subString(����, ����) : �ε��� ��ȣ ���ں��� ����-1 ���� ���ڿ��� ��ȯ
		System.out.println(str1.substring(6, 9));
		
		// toCharArray() : ���ڿ��� char �迭�� ��ȯ
		char[] ch = str1.toCharArray();
		for(char c : ch) {
			System.out.print(c);
		}
		
		// toLowerCase() : �빮�ڸ� �ҹ��ڷ�, �ҹ��ڴ� �ҹ��ڷ� ��ȯ
		System.out.println(str1.toLowerCase());
		
		// toUpperCase() : �빮�ڸ� �빮�ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ
		System.out.println(str1.toUpperCase());
		
		// trim() : �յ� ������ ��� ���ְ� ��ȯ
		String str5 = " 1234 ";
		System.out.println(str5.trim());
		
		// valueOf(�⺻�� ������) : �⺻ �ڷ��� ���� ���ڿ� ���� ��ȯ
		System.out.println(String.valueOf(123));
		
		int num = 1234;
		// String str6 = (String) num; �̰��� �Ұ����ϴ�.
		String str6 = String.valueOf(num);
		System.out.println(str6);
	}
}
