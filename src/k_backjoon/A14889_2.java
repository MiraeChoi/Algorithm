package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A14889_2 {
	static int N, answer = Integer.MAX_VALUE, total = 0;
	static int[][] arr;
	static int[] nArr;
	static boolean[] team;
	
	private static void DFS(int idx, int L) {
		if(L == N / 2) {
			int sum = 0;
			for(int i = 0; i < N; i++) {
				if(team[i]) sum += nArr[i];
			}
			answer = Math.min(answer, Math.abs(total - sum));
			return;
		} else {
			for(int i = idx; i < N; i++) {
				if(!team[i]) team[i] = true;
				DFS(i + 1, L + 1);
				team[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				total += (arr[i][j] = Integer.parseInt(st.nextToken()));
			}
		}
		nArr = new int[N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				nArr[i] += arr[i][j] + arr[j][i];
			}
		}
		team = new boolean[N];
		DFS(0, 0);
		System.out.println(answer);
	}
}