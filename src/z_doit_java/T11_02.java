package z_doit_java;

import java.util.Scanner;

class T11_02 {
	static Scanner kb = new Scanner(System.in);
	
	static class Data {
		static final int NO = 1;	//번호 입력받기
		static final int NAME = 2;	//이름 입력받기
		private Integer no;			//회원번호(키값)
		private String name;		//이름
		
		Integer keyCode() {return no;}
		public String toString() {return name;}
		
		//데이터 입력
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
		ADD("추가"),
		REMOVE("삭제"),
		SEARCH("검색"),
		DUMP("출력"),
		TERMINATE("종료");
		
		private final String message;	//출력할 문자열
		
		static Menu MenuAt(int idx) {	//서수가 idx인 열거를 반환
			for(Menu m : Menu.values()) {
				if(m.ordinal() == idx) return m;
			}
			return null;
		}
		
		Menu(String string) {message = string;}	//생성자
		String getMessage() {return message;}	//출력할 문자열 반환
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
		Menu menu;				//메뉴
		Data data;				//추가용 데이터 참조
		Data tmp = new Data();	//입력용 데이터
		
		T11_01<Integer, Data> hash = new T11_01<>(13);
		
		do {
			switch(menu = SelectMenu()) {
			case ADD :
				data = new Data();
				data.scanData("추가", Data.NO | Data.NAME);
				hash.add(data.keyCode(), data);
				break;
			case REMOVE :
				tmp.scanData("삭제", Data.NO);
				hash.remove(tmp.keyCode());
				break;
			case SEARCH :
				tmp.scanData("검색", Data.NO);
				Data t = hash.search(tmp.keyCode());
				if(t != null) System.out.println("그 키를 갖는 데이터는 " + t + "입니다.");
				else System.out.println("데이터가 존재하지 않습니다.");
				break;
			case DUMP :
				hash.dump();
				break;
			}
		} while(menu != Menu.TERMINATE);
	}
}
