package exam09;

public class Exan09_2 {
	public static void main(String[] args) {
		Exam09 e1 = new Exam09();
		System.out.println("e1 : " + e1.hashCode());
		System.out.println("e1 : " + e1.toString());
		
		Exam09 e2 = new Exam09();
		System.out.println("e2 : " + e2.hashCode());
		System.out.println("e2 : " + e2.toString());
		
		Exam09[] eList = new Exam09[3];
		System.out.println("eList : " + eList.hashCode());
		
		for(int i=0; i<3; i++) {
			eList[i] = new Exam09();
			System.out.println("eList["+i+"] : " + eList[i].hashCode());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.toString());
	}
}
