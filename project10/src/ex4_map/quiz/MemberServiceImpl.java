package ex4_map.quiz;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MemberServiceImpl implements MemberService {
	Scanner sc = new Scanner(System.in);

	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 회원가입");
		System.out.println("2. 회원출력");
		System.out.println("3. 회원수정");
		System.out.println("4. 회원삭제");
		System.out.println("5. 전체삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print(">>> ");
		return sc.nextInt();
	}

	@Override
	public void join(Map<String, Member> memberList) {
		// TODO Auto-generated method stub
		Member m = new Member();
		sub:while(true) {
			System.out.print("아이디 입력 : ");
			m.setId(sc.next());

			Set<String> key = memberList.keySet();

			for(String s: key) {
				if(s.equals(m.getId())) {
					System.out.println("사용중인 아이디 입니다.");

					System.out.print("다시 입력 하시겠습니까 (Y/N) ? ");
					String select = sc.next();

					switch(select) {
					case "Y":
					case "y":
						continue sub;
					case "N":
					case "n":
						System.out.println("취소 합니다.");
						return;
					default:
						System.out.println("잘못 입력 되었습니다.");
						return;
					}
				}
			}
			break;
		}
		System.out.print("암호 입력 : ");
		m.setPwd(sc.next());
		System.out.print("이름 입력 : ");
		m.setName(sc.next());
		System.out.print("이메일 입력 : ");
		m.setEmail(sc.next());

		memberList.put(m.getId(), m);
	}

	@Override
	public void output(Map<String, Member> memberList) {
		// TODO Auto-generated method stub
		if(memberList.size() == 0) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			Set<Map.Entry<String, Member>> entrySet = memberList.entrySet();
			for(Map.Entry<String, Member> entry : entrySet) {
				Member m = entry.getValue();
				System.out.println("### " + m.getId() + " ###");
				System.out.println("암호 : " + m.getPwd());
				System.out.println("이름 : " + m.getName());
				System.out.println("이메일 : " + m.getEmail());
			}
		}
	}

	@Override
	public void modify(Map<String, Member> memberList) {
		// TODO Auto-generated method stub
		if(memberList.size() == 0) {
			System.out.println("수정할 데이터가 없습니다.");
		} else {
			System.out.print("수정할 아이디 입력 : ");
			String id = sc.next();

			Member m = memberList.get(id);

			if(m != null) {
				while(true) {
					System.out.println("1. 암호 변경");
					System.out.println("2. 이름 변경");
					System.out.println("3. 이메일 변경");
					System.out.println("0. 메인 메뉴로 이동");
					System.out.print("선택 : ");
					int menu = sc.nextInt();

					switch(menu) {
					case 1:
						System.out.print("변경할 암호 입력 : ");
						m.setPwd(sc.next());
						break;
					case 2:
						System.out.print("변경할 이름 입력 : ");
						m.setName(sc.next());
						break;
					case 3:
						System.out.print("변경할 이메일 입력 : ");
						m.setEmail(sc.next());
						break;
					case 0:
						System.out.println("프로그램 종료");
						return;
					default:
						System.out.println("선택된 메뉴가 없습니다.");
					}
				}
			} else {
				System.out.println("찾으시는 아이디가 없습니다.");
			}
		}
	}

	@Override
	public void delete(Map<String, Member> memberList) {
		// TODO Auto-generated method stub
		if(memberList.isEmpty()) {
			System.out.println("삭제할 데이터가 없습니다.");
		} else {
			System.out.print("삭제할 아이디 입력 : ");
			String id = sc.next();
			
			Member m = memberList.get(id);
			
			if(m != null) {
				System.out.println(m.getId() + " 님의 정보를 삭제합니다.");
				memberList.remove(id);
			} else {
				System.out.println("찾으시는 아이디가 없습니다.");
			}
		}
	}

	@Override
	public void clear(Map<String, Member> memberList) {
		// TODO Auto-generated method stub
		System.out.println("전체 데이터를 삭제합니다.");
		memberList.clear();
	}
}