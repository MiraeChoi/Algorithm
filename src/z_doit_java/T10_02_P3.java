package z_doit_java;

import java.util.Scanner;

class T10_02_P3 {
	static Scanner kb = new Scanner(System.in);
	
	static class Data {
		static final int NO = 1;
		static final int NAME = 2;
		private Integer no;
		private String name;
		
		Integer keyCode() {return no;}
		public String toString() {return name;}
		
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
	}
	
	enum Menu {
		ADD("����"),
		REMOVE("����"),
		SEARCH("�˻�"),
		PRINT("��� ��������"),
		PRINTR("��� ��������"),
		MIN_KEY("���� ���� Ű"),
		MIN_DATA("���� ���� Ű�� ���� ������"),
		MAX_KEY("���� ū Ű"),
		MAX_DATA("���� ū Ű�� ���� ������"),
		TERMINATE("����");
		
		private final String message;			//����� ���ڿ�
		
		static Menu MenuAt(int idx) {			//������ idx�� ���� ��ȯ
			for(Menu m : Menu.values()) {
				if(m.ordinal() == idx) return m;
			}
			return null;
		}
		
		Menu(String string) {message = string;}
		String getMessage() {return message;}	//����� ���ڿ� ��ȯ
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
		} while(key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());
		return Menu.MenuAt(key);
	}
	
	public static void main(String[] args) {
		Menu menu;				//�޴�
		Data data;				//�߰��� ������ ����
		Data ptr;				//�˻��� ������ ����
		Data tmp = new Data();	//�Է¿� ������
		T10_01_P1P2<Integer, Data> tree = new T10_01_P1P2<>();
		
		do {
			switch(menu = SelectMenu()) {
			case ADD :
				data = new Data();
				data.scanData("����", Data.NO | Data.NAME);
				tree.add(data.keyCode(), data);
				break;
			case REMOVE :
				tmp.scanData("����", Data.NO);
				tree.remove(tmp.keyCode());
				break;
			case SEARCH :
				tmp.scanData("�˻�", Data.NO);
				ptr = tree.search(tmp.keyCode());
				if(ptr != null) System.out.println("�� ��ȣ�� �̸��� " + ptr + "�Դϴ�.");
				else System.out.println("�ش� �����Ͱ� �����ϴ�.");
				break;
			case PRINT :
				tree.print();
				break;
			//P3
			 case PRINTR :
				tree.printReverse();
				break;
			 case MIN_KEY :
				Integer keyMin = tree.getMinKey();
				if (keyMin != null) System.out.println("���� ���� Ű���� " + keyMin + "�Դϴ�.");
				else System.out.println("�����Ͱ� �����ϴ�.");
				break;
			 case MIN_DATA :
				ptr = tree.getDataWithMinKey();
				if (ptr != null) System.out.println("���� ���� Ű���� ���� �����ʹ� " + ptr + "�Դϴ�.");
				else System.out.println("�����Ͱ� �����ϴ�.");
				break;
			 case MAX_KEY :
				Integer keyMax = tree.getMaxKey();
				if (keyMax != null) System.out.println("���� ū Ű���� " + keyMax + "�Դϴ�.");
				else System.out.println("�����Ͱ� �����ϴ�.");
				break;
			 case MAX_DATA :
				ptr = tree.getDataWithMaxKey();
				if (ptr != null) System.out.println("���� ū Ű���� ���� �����ʹ� " + ptr + "�Դϴ�.");
				else System.out.println("�����Ͱ� �����ϴ�.");
				break;
			}
		} while(menu != Menu.TERMINATE);
	}
}
