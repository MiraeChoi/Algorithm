package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1654 {
	//Æ²·È½À´Ï´Ù
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		double[] arr = new double[K];
		int answer = -1;
		int cm = Integer.MAX_VALUE;
		for(int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			cm = Math.min(cm, (int)arr[i]);
		}
		while(true) {
			int cnt = 0;
			for(int i = 0; i < K; i++) cnt += arr[i] / cm;
			if(cnt < N) cm--;
			else {
				answer = cm;
				break;
			}
		}
		System.out.println(answer);
	}
}