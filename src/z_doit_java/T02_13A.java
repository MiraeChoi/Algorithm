package z_doit_java;

class T02_13A {
	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		double sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			sum += a[i];
		}
//		for(double x : a) sum += x;
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
	}
}
