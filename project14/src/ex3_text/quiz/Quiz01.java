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
		// 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 저장할 파일 경로 및 파일 생성
		File dir = new File("C:\\java\\test");
		File f = new File(dir, "score.txt");
		
		while(true) {

			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 검색");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				FileWriter fw = new FileWriter(f, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				
				System.out.println("### 성적 입력 ###");
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("국어 점수 입력 : ");
				int kor = sc.nextInt();
				System.out.print("영어 점수 입력 : ");
				int eng = sc.nextInt();
				System.out.print("수학 점수 입력 : ");
				int math = sc.nextInt();
				
				pw.println(name+","+kor+","+eng+","+math);
				
				// close()가 안 되면 저장이 안 된다.
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
					
					// 문자열로 저장된 성적을 숫자로 변환하기 위해서 사용함
					String[] score = scoreLine.split(",");
					System.out.println("이름 : " + score[0]);
					int sum = 0;
					for(int i=1; i<4; i++) {
						sum +=  Integer.parseInt(score[i]);
					}
					System.out.println("총점 : " + sum);
					System.out.println("평균 : " + (sum/3.0));
				}
				
				br.close();
				fr.close();
				break;
			case 3:
				FileReader fr1 = new FileReader(f);
				BufferedReader br1 = new BufferedReader(fr1);
				
				System.out.print("검색할 이름 입력 : ");
				String findName = sc.next()
				
				while(true) {
					String scoreLine = br1.readLine();
					
					if(scoreLine == null) {
						break;
					}
					
					String[] score = scoreLine.split(",");
					if(findName.equals(score[0])) {
						System.out.println("이름 : " + score[0]);
						int sum = 0;
						for(int i=1; i<4; i++) {
							sum +=  Integer.parseInt(score[i]);
						}
						System.out.println("총점 : " + sum);
						System.out.println("평균 : " + (sum/3.0));
					}
				}
				
				br1.close();
				fr1.close();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
		
	}
}
