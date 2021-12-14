package c_pointers_n_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Ex03_02_Review {
	public ArrayList<Integer> solution(int n, int[] a, int m, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0, p2 = 0;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		while(p1 < n && p2 < m) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1] < b[p2]) p1++;
			else p2++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_02_Review T = new Ex03_02_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = kb.nextInt();
		
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++) b[i] = kb.nextInt();
		
		for(int x : T.solution(n, a, m, b)) System.out.print(x + " ");
	}
}

