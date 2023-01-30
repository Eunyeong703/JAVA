package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("등록 성공");
		} catch(Exception e) {
			System.out.println("등록 실패");
		}
		
		 Connection con = null;
		 
		 try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String pwd = "oracle";
			
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("연결 성공");
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println("연결 실패");
		}
		 
		 // 정적 쿼리를 이용하여 데이터 가져오기, 정적 쿼리 객체 생성
		 Statement stmt = con.createStatement();
		 System.out.println("데이터 전송 객체 생성 성공");
		 
		 // 데이터 입력 받기
		 System.out.print("이름 입력 : ");
		 String name = sc.next();
		 System.out.print("국어 점수 입력 : ");
		 int kor = sc.nextInt();
		 System.out.print("영어 점수 입력 : ");
		 int eng = sc.nextInt();
		 System.out.print("수학 점수 입력 : ");
		 int math = sc.nextInt();
		 
		 int sum = kor + eng + math;
		 double avg = sum / 3.0;
		 
		 // 입력된 값을 DB에 데이터 저장하기
		 // insert, delete, update는 결과값을 반영된 레코드의 수를 반환한다.
		 // executeUpdate() : insert, delete, update 때 사용
		 // sql문을 작성한 문자열의 마지막에 ';'을 생략해야한다. 안 그러면 에러 발생
		 String sql = "insert into student values('"+name+"', "+kor+", "+eng+", "
		 		+ ""+math+", "+sum+", "+avg+")";
		 int result = stmt.executeUpdate(sql);
		 System.out.println(result + "행이 삽입되었습니다.");
	}
}