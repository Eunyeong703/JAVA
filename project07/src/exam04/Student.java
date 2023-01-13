package exam04;

public class Student {
	// private int stuId;
	private static int stuId = 20230001;
	
	private int stu_id;
	private String name;
	public int getStuId() {
		return stu_id;
	}
	public void setStuId() {
		stu_id = stuId++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}