package exam04;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) throws SQLException {
		StudentService ss = new StudentService();
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 1:
				ss.insert();
				break;
			case 2:
				ss.select();
				break;
			case 3:
				ss.update();
				break;
			case 4:
				ss.delete();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
			System.out.println();
		}
	}
}