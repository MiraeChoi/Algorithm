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
		System.out.println("damgom�� ���̵� : " + damgom.getId());
		System.out.println("koroke�� ���̵� : " + koroke.getId());
		
		System.out.println("�ο��� ���̵� ���� : " + Id.getCounter());
	}
}
