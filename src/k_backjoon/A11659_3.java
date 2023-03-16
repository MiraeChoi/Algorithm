package k_backjoon;

class A11659_3 {
	public static void main(String[] args) throws Exception {
		int N = read();
		int M = read();
		int[] arr = new int[N + 1];
		for(int i = 1; i <= N; i++) arr[i] = read() + arr[i - 1];
		StringBuilder sb = new StringBuilder();
		while(M-- > 0) {
			int i = read() - 1;
			int j = read();
			sb.append(arr[j] - arr[i]).append('\n');
		}
		System.out.println(sb);
	}
	
	private static int read() throws Exception {
		int c, n = System.in.read() & 15;
		while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		if(c == 13) System.in.read();
		return n;
	}
}