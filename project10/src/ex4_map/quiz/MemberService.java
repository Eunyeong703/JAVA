package ex4_map.quiz;

import java.util.Map;

public interface MemberService {
	public int menu();
	public void join(Map<String, Member> memberList);
	public void output(Map<String, Member> memberList);
	public void modify(Map<String, Member> memberList);
	public void delete(Map<String, Member> memberList);
	public void clear(Map<String, Member> memberList);
}