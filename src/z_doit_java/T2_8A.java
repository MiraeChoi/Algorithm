package z_doit_java;

class T2_8A {
	public static void main(String[] args) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int x = 59;
		int r = 16;
		char[] d = new char[x];
//		String bin = Integer.toBinaryString(x);
//		String oct = Integer.toOctalString(x);
//		String hex = Integer.toHexString(x);
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);
		
		System.out.println(digits);
//		System.out.println(bin);
//		System.out.println(oct);
//		System.out.println(hex);
	}
}
