package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class A2606 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[com + 1][com + 1];
		boolean[] check = new boolean[com + 1];
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(1);
		check[1] = true;
		int answer = 0;
		while(!Q.isEmpty()) {
			int tmp = Q.poll();
			for(int i = 1; i <= com; i++) {
				if(arr[tmp][i] == 1 && !check[i]) {
					Q.offer(i);
					check[i] = true;
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}