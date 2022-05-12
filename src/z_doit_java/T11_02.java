package z_doit_java;

import java.util.Scanner;

class T11_02 {
	static Scanner kb = new Scanner(System.in);
	
	static class Data {
		static final int NO = 1;	//��ȣ �Է¹ޱ�
		static final int NAME = 2;	//�̸� �Է¹ޱ�
		private Integer no;			//ȸ����ȣ(Ű��)
		private String name;		//�̸�
		
		Integer keyCode() {return no;}
		public String toString() {return name;}
		
		//������ �Է�
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
		ADD("�߰�"),
		REMOVE("����"),
		SEARCH("�˻�"),
		DUMP("���"),
		TERMINATE("����");
		
		private final String message;	//����� ���ڿ�
		
		static Menu MenuAt(int idx) {	//������ idx�� ���Ÿ� ��ȯ
			for(Menu m : Menu.values()) {
				if(m.ordinal() == idx) return m;
			}
			return null;
		}
		
		Menu(String string) {message = string;}	//������
		String getMessage() {return message;}	//����� ���ڿ� ��ȯ
	}
	
	static Menu SelectMenu() {
		int key;
		do {
			for(Menu m : Menu.values()) System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
			System.out.print(" : ");
			key = kb.nextInt();
		} while(key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());
		return Menu.MenuAt(key);
	}
	
	public static void main(String[] args) {
		Menu menu;				//�޴�
		Data data;				//�߰��� ������ ����
		Data tmp = new Data();	//�Է¿� ������
		
		T11_01<Integer, Data> hash = new T11_01<>(13);
		
		do {
			switch(menu = SelectMenu()) {
			case ADD :
				data = new Data();
				data.scanData("�߰�", Data.NO | Data.NAME);
				hash.add(data.keyCode(), data);
				break;
			case REMOVE :
				tmp.scanData("����", Data.NO);
				hash.remove(tmp.keyCode());
				break;
			case SEARCH :
				tmp.scanData("�˻�", Data.NO);
				Data t = hash.search(tmp.keyCode());
				if(t != null) System.out.println("�� Ű�� ���� �����ʹ� " + t + "�Դϴ�.");
				else System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
				break;
			case DUMP :
				hash.dump();
				break;
			}
		} while(menu != Menu.TERMINATE);
	}
}
