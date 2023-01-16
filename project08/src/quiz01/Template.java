package quiz01;

import java.util.Scanner;

public abstract class Template {
	public Scanner sc = new Scanner(System.in);
	public int idx = 0;
	
	public abstract int menu();
	public abstract void input(Object[] obj);
	public abstract void output(Object[] obj);
	public abstract void modify(Object[] obj);
	public abstract void delete(Object[] obj);
}