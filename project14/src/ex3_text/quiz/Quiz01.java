package ex3_text.quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws Exception {
		// �Է� ��ü ����
		Scanner sc = new Scanner(System.in);
		
		// ������ ���� ��� �� ���� ����
		File dir = new File("C:\\java\\test");
		File f = new File(dir, "score.txt");
		
		while(true) {

			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� �˻�");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				FileWriter fw = new FileWriter(f, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				
				System.out.println("### ���� �Է� ###");
				System.out.print("�̸� �Է� : ");
				String name = sc.next();
				System.out.print("���� ���� �Է� : ");
				int kor = sc.nextInt();
				System.out.print("���� ���� �Է� : ");
				int eng = sc.nextInt();
				System.out.print("���� ���� �Է� : ");
				int math = sc.nextInt();
				
				pw.println(name+","+kor+","+eng+","+math);
				
				// close()�� �� �Ǹ� ������ �� �ȴ�.
				pw.close();
				bw.close();
				fw.close();
				break;
			case 2:
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
				while(true) {
					String scoreLine = br.readLine();
					
					if(scoreLine == null) {
						break;
					}
					
					// ���ڿ��� ����� ������ ���ڷ� ��ȯ�ϱ� ���ؼ� �����
					String[] score = scoreLine.split(",");
					System.out.println("�̸� : " + score[0]);
					int sum = 0;
					for(int i=1; i<4; i++) {
						sum +=  Integer.parseInt(score[i]);
					}
					System.out.println("���� : " + sum);
					System.out.println("��� : " + (sum/3.0));
				}
				
				br.close();
				fr.close();
				break;
			case 3:
				FileReader fr1 = new FileReader(f);
				BufferedReader br1 = new BufferedReader(fr1);
				
				System.out.print("�˻��� �̸� �Է� : ");
				String findName = sc.next()
				
				while(true) {
					String scoreLine = br1.readLine();
					
					if(scoreLine == null) {
						break;
					}
					
					String[] score = scoreLine.split(",");
					if(findName.equals(score[0])) {
						System.out.println("�̸� : " + score[0]);
						int sum = 0;
						for(int i=1; i<4; i++) {
							sum +=  Integer.parseInt(score[i]);
						}
						System.out.println("���� : " + sum);
						System.out.println("��� : " + (sum/3.0));
					}
				}
				
				br1.close();
				fr1.close();
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
		
	}
}
