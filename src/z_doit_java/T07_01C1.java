package z_doit_java;

class A {}
class B {
	int x;
	
	public B(int x) {this.x = x;}
	
	@Override
	public String toString() {return "B[" + x + "]";}
}

class T07_01C1 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		B b1 = new B(18);
		B b2 = new B(250);
		
		System.out.println("a1 = " + a1.toString());
		System.out.println("a2 = " + a2);
	}
}
