package ex4_map.quiz;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MemberServiceImpl implements MemberService {
	Scanner sc = new Scanner(System.in);

	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. ȸ������");
		System.out.println("2. ȸ�����");
		System.out.println("3. ȸ������");
		System.out.println("4. ȸ������");
		System.out.println("5. ��ü����");
		System.out.println("0. ���α׷� ����");
		System.out.print(">>> ");
		return sc.nextInt();
	}

	@Override
	public void join(Map<String, Member> memberList) {
		// TODO Auto-generated method stub
		Member m = new Member();
		sub:while(true) {
			System.out.print("���̵� �Է� : ");
			m.setId(sc.next());

			Set<String> key = memberList.keySet();

			for(String s: key) {
				if(s.equals(m.getId())) {
					System.out.println("������� ���̵� �Դϴ�.");

					System.out.print("�ٽ� �Է� �Ͻðڽ��ϱ� (Y/N) ? ");
					String select = sc.next();

					switch(select) {
					case "Y":
					case "y":
						continue sub;
					case "N":
					case "n":
						System.out.println("��� �մϴ�.");
						return;
					default:
						System.out.println("�߸� �Է� �Ǿ����ϴ�.");
						return;
					}
				}
			}
			break;
		}
		System.out.print("��ȣ �Է� : ");
		m.setPwd(sc.next());
		System.out.print("�̸� �Է� : ");
		m.setName(sc.next());
		System.out.print("�̸��� �Է� : ");
		m.setEmail(sc.next());

		memberList.put(m.getId(), m);
	}

	@Override
	public void output(Map<String, Member> memberList) {
		// TODO Auto-generated method stub
		if(memberList.size() == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		} else {
			Set<Map.Entry<String, Member>> entrySet = memberList.entrySet();
			for(Map.Entry<String, Member> entry : entrySet) {
				Member m = entry.getValue();
				System.out.println("### " + m.getId() + " ###");
				System.out.println("��ȣ : " + m.getPwd());
				System.out.println("�̸� : " + m.getName());
				System.out.println("�̸��� : " + m.getEmail());
			}
		}
	}

	@Override
	public void modify(Map<String, Member> memberList) {
		// TODO Auto-generated method stub
		if(memberList.size() == 0) {
			System.out.println("������ �����Ͱ� �����ϴ�.");
		} else {
			System.out.print("������ ���̵� �Է� : ");
			String id = sc.next();

			Member m = memberList.get(id);

			if(m != null) {
				while(true) {
					System.out.println("1. ��ȣ ����");
					System.out.println("2. �̸� ����");
					System.out.println("3. �̸��� ����");
					System.out.println("0. ���� �޴��� �̵�");
					System.out.print("���� : ");
					int menu = sc.nextInt();

					switch(menu) {
					case 1:
						System.out.print("������ ��ȣ �Է� : ");
						m.setPwd(sc.next());
						break;
					case 2:
						System.out.print("������ �̸� �Է� : ");
						m.setName(sc.next());
						break;
					case 3:
						System.out.print("������ �̸��� �Է� : ");
						m.setEmail(sc.next());
						break;
					case 0:
						System.out.println("���α׷� ����");
						return;
					default:
						System.out.println("���õ� �޴��� �����ϴ�.");
					}
				}
			} else {
				System.out.println("ã���ô� ���̵� �����ϴ�.");
			}
		}
	}

	@Override
	public void delete(Map<String, Member> memberList) {
		// TODO Auto-generated method stub
		if(memberList.isEmpty()) {
			System.out.println("������ �����Ͱ� �����ϴ�.");
		} else {
			System.out.print("������ ���̵� �Է� : ");
			String id = sc.next();
			
			Member m = memberList.get(id);
			
			if(m != null) {
				System.out.println(m.getId() + " ���� ������ �����մϴ�.");
				memberList.remove(id);
			} else {
				System.out.println("ã���ô� ���̵� �����ϴ�.");
			}
		}
	}

	@Override
	public void clear(Map<String, Member> memberList) {
		// TODO Auto-generated method stub
		System.out.println("��ü �����͸� �����մϴ�.");
		memberList.clear();
	}
}