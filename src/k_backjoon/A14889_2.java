package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A14889_2 {
	static int N, answer = Integer.MAX_VALUE;
	static int[][] arr;
	static boolean[] team;
	
	private static void DFS(int idx, int L) {
		if(L == N / 2) {
			SUM();
			return;
		} else {
			for(int i = idx; i < N; i++) {
				if(!team[i]) team[i] = true;
				DFS(i + 1, L + 1);
				team[i] = false;
			}
		}
	}
	
	private static void SUM() {
		int start = 0, link = 0;
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(team[i] && team[j]) {
					start += arr[i][j] + arr[j][i];
				}
				if(!team[i] && !team[j]) {
					link += arr[i][j] + arr[j][i];
				}
			}
		}
		answer = Math.min(answer, Math.abs(start - link));
		if(answer == 0) {
			System.out.println(answer);
			System.exit(0);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		team = new boolean[N];
		DFS(0, 0);
		System.out.println(answer);
	}
}