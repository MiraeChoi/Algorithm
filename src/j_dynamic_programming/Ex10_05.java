package j_dynamic_programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Ex10_05 {
	static int n, m, answer = Integer.MAX_VALUE;
	static Integer[] coin;
	
	public void DFS(int L, int sum) {
		System.out.println(sum + "/" + L);
		if(sum > m) return;
		if(L >= answer) return;
		if(sum == m) {
			answer = Math.min(answer, L);
			System.out.println("answer : " + answer);
		} else {
			for(int i = 0; i < n; i++) {
				DFS(L+1, sum + coin[i]);
			}
			System.out.println("-------------" + sum + "/" + L);
		}
	}
	
	public static void main(String[] args) {
		Ex10_05 T = new Ex10_05();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		coin = new Integer[n];
		for(int i = 0; i < n; i++) coin[i] = kb.nextInt();
		m = kb.nextInt();
		Arrays.sort(coin, Collections.reverseOrder());
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
