package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1932 {
	//맞았습니다!! 5/23부터 새 걸로 커밋푸시해염 이건 5/22에 했음
	private static int[][] arr;
	private static Integer[][] dy;
	private static int N;
	
	private static int DFS(int i, int j) {
		if(i == N - 1) return dy[i][j];
		if(dy[i][j] == null) {
			dy[i][j] = Math.max(DFS(i + 1, j), DFS(i + 1, j + 1)) + arr[i][j];
		}
		return dy[i][j];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		dy = new Integer[N][N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < N; i++) dy[N - 1][i] = arr[N - 1][i];
		System.out.print(DFS(0, 0));
	}
}