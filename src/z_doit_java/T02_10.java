package z_doit_java;

class T02_10 {
	public static void main(String[] args) {
		int count = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		
		for(int n = 3; n <= 1000; n += 2) {
			int i;
			
			for(i = 1; i < ptr; i++) {
				count++;
				if(n % prime[i] == 0) break;
			}
			//System.out.println("ptr & i & n : " + ptr + "/" + i + "/" + n);
			if(ptr == i) prime[ptr++] = n;
		}
		for(int i = 0; i < ptr; i++) System.out.println(prime[i]);
		System.out.println("³ª´°¼ÀÀ» ¼öÇàÇÑ È½¼ö : " + count);
	}
}
