package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class A17299 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int[] arr = new int[N];
		int[] cnt = new int[1000001];
		int[] answer = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			cnt[arr[i]]++;
		}
		for(int i = 0; i < N; i++) {
			while(!stack.isEmpty() && cnt[arr[stack.peek()]] < cnt[arr[i]]) {
				answer[stack.pop()] = arr[i];
			}
			stack.push(i);
			System.out.println("stack : " + stack);
		}
		while(!stack.isEmpty()) answer[stack.pop()] = -1;
		StringBuilder sb = new StringBuilder();
		for(int x : answer) sb.append(x).append(' ');
		System.out.print(sb);
	}
}