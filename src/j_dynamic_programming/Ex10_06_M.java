package j_dynamic_programming;

import java.util.ArrayList;
import java.util.Scanner;

class Test06M {
	int s, t;
	
	public Test06M(int s, int t) {
		this.s = s;
		this.t = t;
	}
}

class Ex10_06_M {
	static int[] dy;
	
	public int solution(int n, int m, ArrayList<Test06M> arr) {
		for(int i = 0; i < n; i++) {
			int ps = arr.get(i).s;
			int pt = arr.get(i).t;
			
			for(int j = m; j >= pt; j--) {
				dy[j] = Math.max(dy[j], dy[j-pt] + ps);
			}
			for(int x : dy) System.out.print(x + " ");
			System.out.println();
		}
		
		return dy[m];
	}
	
	public static void main(String[] args) {
		Ex10_06_M T = new Ex10_06_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		dy = new int[m+1];
		ArrayList<Test06M> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) arr.add(new Test06M(kb.nextInt(), kb.nextInt()));
		System.out.println(T.solution(n, m, arr));
	}
}
