package z_doit_java;

class Id {
	private static int counter = 0;
	private int id;
	
	public Id() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getCounter() {
		return counter;
	}
}

class T03_05C1 {
	public static void main(String[] args) {
		Id damgom = new Id();
		Id koroke = new Id();
		System.out.println("damgom의 아이디 : " + damgom.getId());
		System.out.println("koroke의 아이디 : " + koroke.getId());
		
		System.out.println("부여한 아이디 개수 : " + Id.getCounter());
	}
}
