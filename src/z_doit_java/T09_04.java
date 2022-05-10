package z_doit_java;

import java.util.Comparator;
import java.util.Scanner;

class T09_04 {
	static Scanner kb = new Scanner(System.in);
	
	static class Data {
		static final int NO = 1;
		static final int NAME = 2;
		private Integer no;
		private String name;
		
		public String toString() {
			return "(" + no + ") " + name;
		}
		
		void scanData(String guide, int sw) {
			System.out.println(guide + "�� �����͸� �Է��ϼ���.");
			if((sw & NO) == NO) {
				System.out.print("��ȣ : ");
				no = kb.nextInt();
			}
			if((sw & NAME) == NAME) {
				System.out.print("�̸� : ");
				name = kb.next();
			}
		}
		
		//ȸ����ȣ�� ���� �ű�� comparator
		public static final Comparator<Data> NO_ORDER = new NoOrderComparator();
		
		private static class NoOrderComparator implements Comparator<Data> {
			public int compare(Data d1, Data d2) {
				return (d1.no > d2.no) ? 1 : (d1.no < d2.no) ? -1 : 0;
			}
		}
		
		//�̸����� ������ �ű�� comparator
		public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();
		
		private static class NameOrderComparator implements Comparator<Data> {
			public int compare(Data d1, Data d2) {
				return d1.name.compareTo(d2.name);
			}
		}
	}
	
	enum Menu {
		ADD_FIRST("�Ӹ��� ��� ����"),
		ADD_LAST("������ ��� ����"),
		RMV_FIRST("�Ӹ� ��� ����"),
		RMV_LAST("���� ��� ����"),
		RMV_CRNT("���� ��� ����"),
		CLEAR("��� ��� ����"),
		SEARCH_NO("��ȣ�� �˻�"),
		SEARCH_NAME("�̸����� �˻�"),
		NEXT("���� ���� �̵�"),
		PRINT_CRNT("���� ��� ���"),
		DUMP("��� ��� ���"),
		TERMINATE("����");
		
		private final String message;	//����� ���ڿ�
		
		static Menu MenuAt(int idx) {	//������ idx�� ���� ��ȯ
			for(Menu m : Menu.values()) {
				if(m.ordinal() == idx) return m;
			}
			return null;
		}
		
		private Menu(String string) {
			message = string;
		}
		
		String getMessage() {
			return message;
		}
	}
	
	//�޴� ����
	static Menu SelectMenu() {
		int key;
		do {
			for(Menu m : Menu.values()) {
				System.out.printf("(%d) %s��", m.ordinal(), m.getMessage());
				if((m.ordinal() % 3) == 2 && m.ordinal() != Menu.TERMINATE.ordinal()) {
					System.out.println();
				}
			}
			System.out.print(" : ");
			key = kb.nextInt();
		} while(key < Menu.ADD_FIRST.ordinal() || key > Menu.TERMINATE.ordinal());
		return Menu.MenuAt(key);
	}
	
	public static void main(String[] args) {
		Menu menu;				//�޴�
		Data data;				//�߰��� ������ ����
		Data ptr;				//�˻��� ������ ����
		Data tmp = new Data();	//�Է¿� ������
		
		T09_03<Data> list = new T09_03<>(100);
		
		do {
			switch(menu = SelectMenu()) {
			case ADD_FIRST : 
				data = new Data();
				data.scanData("�Ӹ��� ����", Data.NO | Data.NAME);
				list.addFirst(data);
				break;
			case ADD_LAST : 
				data = new Data();
				data.scanData("������ ����", Data.NO | Data.NAME);
				list.addLast(data);
				break;
			case RMV_FIRST :
				list.removeFirst();
				break;
			case RMV_LAST :
				list.removeLast();
				break;
			case RMV_CRNT : 
				list.removeCurrentNode();
				break;
			case SEARCH_NO :
				tmp.scanData("�˻�", Data.NO);
				ptr = list.search(tmp, Data.NO_ORDER);
				if(ptr == null) System.out.println("�� ��ȣ�� �����Ͱ� �����ϴ�.");
				else System.out.println("�˻� ���� : " + ptr);
				break;
			case SEARCH_NAME :
				tmp.scanData("�˻�", Data.NAME);
				ptr = list.search(tmp, Data.NAME_ORDER);
				if(ptr == null) System.out.println("�� �̸��� �����Ͱ� �����ϴ�.");
				else System.out.println("�˻� ���� : " + ptr);
				break;
			case NEXT :
				list.next();
				break;
			case PRINT_CRNT :
				list.printCurrentNode();
				break;
			case DUMP :
				list.dump();
				break;
			case CLEAR :
				list.clear();
				break;
			}
		} while(menu != Menu.TERMINATE);
	}
}
