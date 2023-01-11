package method.quiz;

import java.util.Scanner;

public class Quiz03 {
	static Scanner sc = new Scanner(System.in);

	// �� �ܹ��� ����
	static int chicken = 4500;
	static int shrimp = 4000;
	static int bulgogi = 3500;
	// �� ���� ����
	static int cola = 2000;
	static int sider = 2000;
	static int coffee = 1500;
	// �����ݾ��� �����ϴ� ����
	static int sum = 0;
	// ������ �����ϴ� ����
	static int chAcc = 0;
	static int shAcc = 0;
	static int bulAcc = 0;
	static int coAcc = 0;
	static int siAcc = 0;
	static int ffAcc = 0;

	// ������ ��й�ȣ ���� ����
	static int adminPass = 1234;

	// �� �Ǹ� ������ ���� ����
	static int chickenAll = 0;
	static int shrimpAll = 0;
	static int bulgogiAll = 0;
	static int colaAll = 0;
	static int siderAll = 0;
	static int coffeeAll = 0;

	public static void tradeName() {
		System.out.println("####################");
		System.out.println("##### ������ �ܹ��� #####");
		System.out.println("####################");
		System.out.println();
	}
	
	public static void orderList() {
		if(chAcc > 0) {
			System.out.println("ġŲ���� : " + chAcc);
		}
		if(shAcc > 0) {
			System.out.println("������� : " + shAcc);
		}
		if(bulAcc > 0) {
			System.out.println("�Ұ����� : " + bulAcc);
		}
		if(coAcc > 0) {
			System.out.println("�ݶ� : " + coAcc);
		}
		if(siAcc > 0) {
			System.out.println("���̴� : " + siAcc);
		}
		if(ffAcc > 0) {
			System.out.println("Ŀ�� : " + ffAcc);
		}
		System.out.println();
	}
	
	public static int menu() {
		System.out.println("1. �ܹ���");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ��ü���");
		System.out.print("���� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public static int hamMenu() {
		System.out.println("\n###### �ܹ��� #####");
		System.out.println("1. ġŲ����");
		System.out.println("2. �������");
		System.out.println("3. �Ұ�����");
		System.out.println("4. �ܹ��� ���� ���");
		System.out.println("5. �޴��� �̵�");
		System.out.print("���� : ");
		int select = sc.nextInt();
		return select;
	}
	
	public static void hamOrder(String str) {
		System.out.println(str + " �߰��մϴ�.");
		System.out.print("���� �Է� : ");
	}
	
	public static int drinkMenu() {
		System.out.println("\n###### ���� #####");
		System.out.println("1. �ݶ�");
		System.out.println("2. ���̴�");
		System.out.println("3. Ŀ��");
		System.out.println("4. ���� ���� ���");
		System.out.println("5. �޴��� �̵�");
		System.out.print("���� : ");
		int select = sc.nextInt();
		return select;
	}
	
	public static int adminMenu() {
		System.out.println("##### ������ ��� #####");
		System.out.println("1. ��� ����");
		System.out.println("2. �Ǹż�������");
		System.out.println("3. �Ǹűݾ׺���");
		System.out.println("4. ���ϸ��⺸��");
		System.out.println("5. �����ʱ�ȭ");
		System.out.println("6. �����ں�й�ȣ����");
		System.out.println("7. ���θ޴��� �̵�");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public static int payModMenu() {
		System.out.println("##### ��� ���� #####");
		System.out.println("1. ġŲ����");
		System.out.println("2. �������");
		System.out.println("3. �Ұ�����");
		System.out.println("4. �ݶ�");
		System.out.println("5. ���̴�");
		System.out.println("6. Ŀ��");
		System.out.print("���� : ");
		int select = sc.nextInt();
		return select;
	}
	
	public static void main(String[] args) {
		while(true) {
			tradeName();
			orderList();

			int menu = menu();
			
			switch(menu) {
			case 1:
				boolean burger = true;
				while(burger) {
					System.out.println();
					orderList();
					int select = hamMenu();

					switch(select) {
					case 1:
						hamOrder("ġŲ���Ÿ�");
						chAcc += sc.nextInt();
						break;
					case 2:
						hamOrder("������Ÿ�");
						shAcc += sc.nextInt();
						break;
					case 3:
						hamOrder("�Ұ����Ÿ�");
						bulAcc += sc.nextInt();
						break;
					case 4:
						System.out.println("�ܹ��� ���� ����մϴ�.");
						chAcc = 0;
						shAcc = 0;
						bulAcc = 0;
						break;
					case 5:
						System.out.println("�޴��� �̵��մϴ�.");
						burger = false;
						break;
					default:
						System.out.println("���õ� �޴��� �����ϴ�.");
					}
				}
				break;
			case 2:
				boolean drink = true;
				while(drink) {
					System.out.println();
					orderList();
					int select = drinkMenu();
					switch(select) {
					case 1:
						hamOrder("�ݶ�");
						coAcc += sc.nextInt();
						break;
					case 2:
						hamOrder("���̴ٸ�");
						siAcc += sc.nextInt();
						break;
					case 3:
						hamOrder("Ŀ�Ǹ�");
						ffAcc += sc.nextInt();
						break;
					case 4:
						System.out.println("���� ������ ����մϴ�.");
						coAcc =0;
						siAcc = 0;
						ffAcc = 0;
						break;
					case 5:
						System.out.println("�޴��� �̵��մϴ�.");
						drink = false;
						break;
					default:
						System.out.println("���õ� �޴��� �����ϴ�.");
					}
				}
				break;
			case 3:
				sum += (chAcc * chicken);
				sum += (shAcc * shrimp);
				sum += (bulAcc * bulgogi);
				sum += (coAcc * cola);
				sum += (siAcc * sider);
				sum += (ffAcc * coffee);
				System.out.println("##### ���� #####");
				System.out.println("�����Ͻ� �ݾ� : " + sum);
				System.out.println("ī��� ���� �մϴ�.");
				System.out.println("���� �Ϸ� �߽��ϴ�.");

				chickenAll += chAcc;
				shrimpAll += shAcc;
				bulgogiAll += bulAcc;
				colaAll += coAcc;
				siderAll += siAcc;
				coffeeAll += ffAcc;

				sum = 0;
				chAcc = 0;
				shAcc = 0;
				bulAcc = 0;
				coAcc = 0;
				siAcc = 0;
				ffAcc = 0;
				break;
			case 4:
				System.out.println("##### ��ü ��� #####");
				System.out.println("üũ �� ��� ��ǰ�� ��� �Ǿ����ϴ�.");
				chAcc = 0;
				shAcc = 0;
				bulAcc = 0;
				coAcc = 0;
				siAcc = 0;
				ffAcc = 0;
				break;
			case 9999:
				admin:for(int i=0;i<3;i++) {
					System.out.print("������ ��й�ȣ �Է� : ");
					int check = sc.nextInt();

					if(adminPass == check) {
						while(true) {
							menu = adminMenu();
							switch(menu) {
							case 1:
								int select = payModMenu();

								switch(select) {
								case 1:
									System.out.print("ġŲ���� ���� ��� �Է� : ");
									chicken = sc.nextInt();
									break;
								case 2:
									System.out.print("������� ���� ��� �Է� : ");
									shrimp = sc.nextInt();
									break;
								case 3:
									System.out.print("�Ұ����� ���� ��� �Է� : ");
									bulgogi = sc.nextInt();	
									break;
								case 4:
									System.out.print("�ݶ� ���� ��� �Է� : ");
									cola = sc.nextInt();
									break;
								case 5:
									System.out.print("���̴� ���� ��� �Է� : ");
									sider = sc.nextInt();
									break;
								case 6:
									System.out.print("Ŀ�� ���� ��� �Է� : ");
									coffee = sc.nextInt();
									break;
								default:
									System.out.println("���õ� �޴��� �����ϴ�.");
								}
								break;
							case 2:
								System.out.println("##### �Ǹ� ���� #####");
								System.out.println("ġŲ ���� : " + chickenAll);
								System.out.println("���� ���� : " + shrimpAll);
								System.out.println("�Ұ�� ���� : " + bulgogiAll);
								System.out.println("�ݶ� : " + colaAll);
								System.out.println("���̴� : " + siderAll);
								System.out.println("Ŀ�� : " + coffeeAll);
								break;
							case 3:
								System.out.println("##### �Ǹ� �ݾ� #####");
								System.out.println("ġŲ ���� : " + (chickenAll * chicken));
								System.out.println("���� ���� : " + (shrimpAll * shrimp));
								System.out.println("�Ұ�� ���� : " + (bulgogiAll * bulgogi));
								System.out.println("�ݶ� : " + (colaAll * cola));
								System.out.println("���̴� : " + (siderAll * sider));
								System.out.println("Ŀ�� : " + (coffeeAll * coffee));
								break;
							case 4:
								System.out.println("##### ���� ���� ���� #####");
								System.out.println("�� ���� : " + ((chickenAll * chicken) +
										(shrimpAll * shrimp) +
										(bulgogiAll * bulgogi) +
										(colaAll * cola) +
										(siderAll * sider)+
										(coffeeAll * coffee)));
								break;
							case 5:
								System.out.println("##### ���� �ʱ�ȭ #####");
								System.out.println("������ �ʱ�ȭ �߽��ϴ�.");
								chickenAll = 0;
								shrimpAll = 0;
								bulgogiAll = 0;
								colaAll = 0;
								siderAll = 0;
								coffeeAll = 0;
								break;
							case 6:
								System.out.println("##### ������ ��й�ȣ ���� #####");
								for(int x=0;x<3;x++) {
									System.out.print("���� ��й�ȣ �Է� : ");
									check  = sc.nextInt();

									if(adminPass == check) {
										System.out.print("���ο� ��й�ȣ �Է� : ");
										int pass1 = sc.nextInt();
										System.out.print("���ο� ��й�ȣ Ȯ�� : ");
										int pass2 = sc.nextInt();
										if(pass1 == pass2) {
											System.out.println("��й�ȣ�� �����մϴ�.");
											adminPass = pass1;
										} else {
											System.out.println("��й�ȣ�� Ȯ���� �ٽ� �����ϼ���");
										}
										break;
									} else {
										System.out.println( (x+1) + " ȸ Ʋ�Ƚ��ϴ�.");
									}
								}
								break;
							case 7:
								System.out.println("���� �޴��� �̵��մϴ�.");
								break admin;
							case 0:
								System.out.println("���α׷� ����");
								return;
							default:
								System.out.println("���õ� �޴��� �����ϴ�.");
							}
							System.out.println();
						}
					} else {
						System.out.println((i+1)+"ȸ ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					}
				}
				break;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
			System.out.println();
		}

	}
}