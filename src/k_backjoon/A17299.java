package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A17299 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] stack = new int[N];
		int[] arr = new int[N];
		int[] app = new int[N];
		int top = -1;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			app[arr[i]]++;
		}
		for(int i = 0; i < N; i++) {
			while(top != -1 && arr[stack[top]] < arr[i]) {
				arr[stack[top]] = arr[i];
				top--;
			}
			top++;
			stack[top] = i;
		}
		for(int i = top; i >= 0; i--) arr[stack[i]] = -1;
		for(int x : arr) sb.append(x).append(' ');
		System.out.print(sb);
	}
}
