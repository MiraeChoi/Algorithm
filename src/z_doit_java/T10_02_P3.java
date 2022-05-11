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
			System.out.println(guide + "할 데이터를 입력하세요.");
			if((sw & NO) == NO) {
				System.out.print("번호 : ");
				no = kb.nextInt();
			}
			if((sw & NAME) == NAME) {
				System.out.print("이름 : ");
				name = kb.next();
			}
		}
	}
	
	enum Menu {
		ADD("삽입"),
		REMOVE("삭제"),
		SEARCH("검색"),
		PRINT("출력 오름차순"),
		PRINTR("출력 내림차순"),
		MIN_KEY("가장 작은 키"),
		MIN_DATA("가장 작은 키를 갖는 데이터"),
		MAX_KEY("가장 큰 키"),
		MAX_DATA("가장 큰 키를 갖는 데이터"),
		TERMINATE("종료");
		
		private final String message;			//출력할 문자열
		
		static Menu MenuAt(int idx) {			//서수가 idx인 열거 반환
			for(Menu m : Menu.values()) {
				if(m.ordinal() == idx) return m;
			}
			return null;
		}
		
		Menu(String string) {message = string;}
		String getMessage() {return message;}	//출력할 문자열 반환
	}
	
	//메뉴 선택
	static Menu SelectMenu() {
		int key;
		do {
			for(Menu m : Menu.values()) {
				System.out.printf("(%d) %s　", m.ordinal(), m.getMessage());
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
		Menu menu;				//메뉴
		Data data;				//추가용 데이터 참조
		Data ptr;				//검색용 데이터 참조
		Data tmp = new Data();	//입력용 데이터
		T10_01_P1P2<Integer, Data> tree = new T10_01_P1P2<>();
		
		do {
			switch(menu = SelectMenu()) {
			case ADD :
				data = new Data();
				data.scanData("삽입", Data.NO | Data.NAME);
				tree.add(data.keyCode(), data);
				break;
			case REMOVE :
				tmp.scanData("삭제", Data.NO);
				tree.remove(tmp.keyCode());
				break;
			case SEARCH :
				tmp.scanData("검색", Data.NO);
				ptr = tree.search(tmp.keyCode());
				if(ptr != null) System.out.println("그 번호의 이름은 " + ptr + "입니다.");
				else System.out.println("해당 데이터가 없습니다.");
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
				if (keyMin != null) System.out.println("가장 작은 키값은 " + keyMin + "입니다.");
				else System.out.println("데이터가 없습니다.");
				break;
			 case MIN_DATA :
				ptr = tree.getDataWithMinKey();
				if (ptr != null) System.out.println("가장 작은 키값을 갖는 데이터는 " + ptr + "입니다.");
				else System.out.println("데이터가 없습니다.");
				break;
			 case MAX_KEY :
				Integer keyMax = tree.getMaxKey();
				if (keyMax != null) System.out.println("가장 큰 키값은 " + keyMax + "입니다.");
				else System.out.println("데이터가 없습니다.");
				break;
			 case MAX_DATA :
				ptr = tree.getDataWithMaxKey();
				if (ptr != null) System.out.println("가장 큰 키값을 갖는 데이터는 " + ptr + "입니다.");
				else System.out.println("데이터가 없습니다.");
				break;
			}
		} while(menu != Menu.TERMINATE);
	}
}
