package z_doit_java;

import java.util.Scanner;

class T03_02 {
	static int seqSearch(int[] a, int key) {
		for(int i = 0; i < a.length; i++) {
			if(key == a[i]) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = kb.nextInt();
		int[] x = new int[n];
		
		for(int i = 0; i < x.length; i++) {
			System.out.printf("x[%d] : ", i);
			x[i] = kb.nextInt();
		}
		System.out.print("검색할 값 : ");
		int key = kb.nextInt();
		int idx = seqSearch(x, key);
		
		if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
		else System.out.printf("%d(은)는 x[%d]에 있습니다.", key, idx);
	}
}
