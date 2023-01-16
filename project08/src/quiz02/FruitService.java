package quiz02;

import quiz01.Template;

public class FruitService extends Template{

	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 과일 입력");
		System.out.println("2. 과일 출력");
		System.out.println("3. 과일 수정");
		System.out.println("4. 과일 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		return sc.nextInt();
	}

	@Override
	public void input(Object[] obj) {
		// TODO Auto-generated method stub
		Fruit[] fruit = (Fruit[]) obj;
		fruit[idx] = new Fruit();
		System.out.print("과일 이름 입력 : ");
		fruit[idx].setName(sc.next());
		System.out.print("과일 가격 입력 : ");
		fruit[idx].setPrice(sc.nextInt());
		idx++;
	}

	@Override
	public void output(Object[] obj) {
		// TODO Auto-generated method stub
		Fruit[] fruit = (Fruit[]) obj;
		if(idx == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			for(int i=0;i<idx;i++) {
				System.out.println("### " + fruit[i].getName() + " ###");
				System.out.println("가격 : " + fruit[i].getPrice());
			}
		}
	}

	@Override
	public void modify(Object[] obj) {
		// TODO Auto-generated method stub
		Fruit[] fruit = (Fruit[]) obj;
		if(idx == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			System.out.print("수정할 이름 입력 : ");
			String name = sc.next();
			
			for(int i=0;i<idx;i++) {
				if(name.equals(fruit[i].getName())) {
				System.out.print("수정할 가격 입력 : ");
				fruit[i].setPrice(sc.nextInt());
				return;
				}
			}
			System.out.println("찾으시는 과일이 없습니다.");
		}
	}

	@Override
	public void delete(Object[] obj) {
		// TODO Auto-generated method stub
		Fruit[] fruit = (Fruit[]) obj;
		if(idx == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			System.out.print("삭제할 이름 입력 : ");
			String name = sc.next();
		
			for(int i=0;i<idx;i++) {
				if(name.equals(fruit[i].getName())) {
					System.out.println(name + "의 정보를 삭제합니다.");
					idx--;
					for(int j=i;j<idx;j++) {
						fruit[j] = fruit[j+1];
					}
					return;
				}
			}
			System.out.println("찾으시는 과일이 없습니다.");
		}
	}
}
