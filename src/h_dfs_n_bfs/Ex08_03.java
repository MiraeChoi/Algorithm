package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_03 {
	//설명
	//이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
	//각 문제는 그것을 풀었을 때 얻는 점수와 푸는 데 걸리는 시간이 주어지게 됩니다.
	//제한시간 M 안에 N개의 문제 중 최대 점수를 얻을 수 있도록 해야 합니다.
	//(해당 문제는 해당 시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한 개만 풀 수 있습니다.)

	//입력
	//첫 번째 줄에 문제의 개수 N(1<=N<=20)과 제한 시간 M(10<=M<=300)이 주어집니다.
	//두 번째 줄부터 N줄에 걸쳐 문제를 풀었을 때의 점수와 푸는 데 걸리는 시간이 주어집니다.

	//출력
	//첫 번째 줄에 제한 시간 안에 얻을 수 있는 최대 점수를 출력합니다.
	static int answer = 0, n, m;
	static int[][] arr;
	
	public void DFS(int L, int min, int sum) {
		if(min > m) return;
		if(L == n) answer = Math.max(answer, sum);
		else {
			DFS(L+1, min + arr[L][1], sum + arr[L][0]);
			DFS(L+1, min, sum);
		}
	}
	
	public static void main(String[] args) {
		Ex08_03 T = new Ex08_03();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) arr[i][j] = kb.nextInt();
		}
		T.DFS(0, 0, 0);
		System.out.println(answer);
	}
}
