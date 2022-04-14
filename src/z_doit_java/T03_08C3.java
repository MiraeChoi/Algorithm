package z_doit_java;

class T03_08C3 {
	static class GenericClass<T> {
		private T xyz;
		
		public GenericClass(T t) {this.xyz = t;}
		T getXyz() {return xyz;}
	}
	
	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<>("Sushi");
		GenericClass<Integer> n = new GenericClass<>(486);
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}
}
