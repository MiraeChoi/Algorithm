package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A11054 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] dyL = new int[N];
		int[] dyR = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		for(int i = 0; i < N; i++) {
			dyL[i] = 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j] && dyL[j] + 1 > dyL[i]) dyL[i] = dyL[j] + 1;
			}
		}
		for(int i = N - 1; i >= 0; i--) {
			dyR[i] = 1;
			for(int j = N - 1; j > i; j--) {
				if(arr[i] > arr[j] && dyR[j] + 1 > dyR[i]) dyR[i] = dyR[j] + 1;
			}
		}
		int answer = 0;
		for(int i = 0; i < N; i++) {
			answer = Math.max(answer, dyL[i] + dyR[i] - 1);
		}
		System.out.print(answer);
	}
}