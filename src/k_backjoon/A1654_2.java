package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1654_2 {
	//Æ²·È½À´Ï´Ù
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[K];
		int cm = Integer.MIN_VALUE;
		for(int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			cm = Math.max(cm, (int)arr[i]);
		}
		int answer = -1;
		if(N > 1) {
			for(int i = 1; i <= cm; i++) {
				int cnt = 0;
				for(int j = 0; j < K; j++) {
					int tmp = arr[j];
					while(true) {
						if(tmp < i || tmp == 1) break;
						cnt++;
						tmp /= (i + 1);
						System.out.println("tmp : " + tmp + " / " + j);
						
						if(cnt > N) break;
					}
				}
				System.out.println("cnt & i : " + cnt + " & " + i);
				if(cnt < N) break;
				if(i > answer) answer = i;
				System.out.println("-----------¡Úanswer : " + answer);
			}
		} else answer = cm;
		System.out.println(answer);
	}
}