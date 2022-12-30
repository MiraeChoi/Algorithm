package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A15649_2 {
	static int N, M;
	static int[] arr, ch;
	
	static void DFS(int L) {
		if(L == M) {
			for(int x : arr) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 0; i < N; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					arr[L] = i + 1;
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		//모든 경우를 탐색하는 백트래킹 알고리즘 입문 문제
		ch = new int[N];
		arr = new int[M];
		DFS(0);
	}
}